plugins {
  `kotlin-dsl`
}

repositories {
  mavenCentral()
  mavenLocal()
  google()
  maven(url = "https://maven.pgk.jetbrains.space/public/p/compose/dev")
}

dependencies {

}

kotlin {
  sourceSets.getByName("main").kotlin.srcDir("buildSrc/src/main/kotlin")
}