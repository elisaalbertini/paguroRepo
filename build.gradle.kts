plugins {
    alias(libs.plugins.dokka)
    alias(libs.plugins.ktlint)
    alias(libs.plugins.kotlin)
    alias(libs.plugins.sonarqube)
}

repositories {
    mavenCentral()
}

dependencies {
    //testImplementation(kotlin("test"))
    //testImplementation(libs.junit5)
    //testRuntimeOnly(libs.junit5.runtime)
    testImplementation(libs.bundles.kotlin.testing)
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
