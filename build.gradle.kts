plugins {
    kotlin("jvm") version "2.0.20"
    application
}

group = "com.ankit.kotlin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}

application {
    mainClass.set("com.ankit.kotlin.MainKt")
}
