plugins {
    alias(libs.plugins.dokka)
    alias(libs.plugins.ktlint)
    alias(libs.plugins.kotlin)
    alias(libs.plugins.sonarqube)
}

repositories {
    mavenCentral()
}

sonar.properties {
    property("systemProp.sonar.host.url")
    property("systemProp.sonar.projectKey")
    property("systemProp.sonar.organization")
    property("systemProp.sonar.sources")
    property("systemProp.sonar.coverage.exclusions")
    property("systemProp.sonar.coverage.jacoco.xmlReportPaths")
    property("systemProp.sonar.javascript.lcov.reportPaths")
    property("systemProp.sonar.exclusion")
    //property("sonar.token", "4a3d8ea01b02dbef8115c170a3c30871f67f64c3") //!!!
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation(libs.junit5)
    testRuntimeOnly(libs.junit5.runtime)
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

// subprojects {
//  apply(plugin = dokka)
// alias(libs.plugins.dokka)
// }

ktlint {
    filter {
        include("**/main/kotlin/**/*.kt") // ricorda di mettere *.estensione altrimenti non becca i file
        exclude("**/*.gradle.kts")
    }
}
