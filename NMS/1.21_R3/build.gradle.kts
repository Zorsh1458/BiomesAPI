plugins {
    id("io.papermc.paperweight.userdev") version "2.0.0-beta.14"
}

dependencies {
    paperweight.paperDevBundle("1.21.4-R0.1-SNAPSHOT")
    compileOnly(project(":NMS:Wrapper"))
}

tasks.reobfJar {

}

java {
    toolchain.languageVersion = JavaLanguageVersion.of(21)
}