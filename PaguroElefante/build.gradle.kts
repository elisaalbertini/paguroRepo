plugins {
    id("java")
    id("jacoco")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.test {
    useJUnitPlatform()
    finalizedBy(tasks.jacocoTestReport) // report is always generated after tests run
}

tasks.jacocoTestReport {
    dependsOn(tasks.test) // tests are required to run before generating the report
    reports {
        xml.required.set(false)
        csv.required.set(false)
        html.required.set(true)
        html.outputLocation.set(File("/report"))
    }
}

jacoco {
    toolVersion = "0.8.11"
    //reportsDirectory.set(layout.buildDirectory.dir("customJacocoReportDir"))
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

/*tasks.getByName<Test>("test") {
    useJUnitPlatform()
}*/