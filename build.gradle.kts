plugins {
    java
    kotlin(module = "jvm") version "1.3.21"
    application
}

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin(module = "stdlib-jdk8"))

    testImplementation("junit:junit:4.12")
}

application {
    mainClassName = ""
}
