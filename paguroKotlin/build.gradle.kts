plugins {
    alias(libs.plugins.dokka)
    alias(libs.plugins.ktlint)
    alias(libs.plugins.kotlin)
    id("jacoco")
}

jacoco {
    toolVersion = "0.8.11"
}

repositories {
    mavenCentral()
}

dependencies {
// testImplementation(kotlin("test"))
// testImplementation(libs.junit5)
// testRuntimeOnly(libs.junit5.runtime)
// implementation(kotlin("stdlib-jdk8"))
    testImplementation(libs.bundles.kotlin.testing)
    testImplementation("io.cucumber:cucumber-java:7.17.0")
    testImplementation("io.cucumber:cucumber-junit:7.17.0")
    testImplementation("org.junit.vintage:junit-vintage-engine")
}

tasks.test {
    useJUnitPlatform()
    finalizedBy(tasks.jacocoTestReport)
}

tasks.jacocoTestReport {
    dependsOn(tasks.test)
    reports {
        xml.required.set(true)
        csv.required.set(true)
    }
}
