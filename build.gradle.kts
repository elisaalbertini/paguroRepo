plugins {
    kotlin("jvm") version "1.8.21"
    id("org.jetbrains.dokka") version "1.9.20"
}

version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

subprojects {
    apply(plugin = "org.jetbrains.dokka")
}