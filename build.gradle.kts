plugins {
    alias(libs.plugins.dokka)
    alias(libs.plugins.ktlint)
    alias(libs.plugins.kotlin)
}

repositories {
    mavenCentral()
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
    }
}
