plugins {
    kotlin("multiplatform") version "2.2.20"
}

group = "xyz.darkcomet"
version = "0.1.0"

repositories {
    mavenCentral()
}

kotlin {
    jvm()
    js(IR) {
        browser()
        nodejs()
    }
}

// TODO: publishing