plugins {
    id("java")
    id("org.sonarqube") version "3.5.0.2730"
}

version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

sonar {
    properties {
        property("sonar.projectKey", "elisaalbertini_paguroRepo")
        property("sonar.organization", "elisaalbertini-pagurorepo")
        property("sonar.coverage.jacoco.xmlReportPaths", "./PaguroElefante/build/**/jacocoTestReport.xml")
        //property("sonar.web.context","http://localhost:9000")
        //property("sonar.host.url", "http://localhost:9000")
    }
}

/*subprojects {
    sonar {
        properties {
            property("sonar.sources", "src")
        }
    }
}*/

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}