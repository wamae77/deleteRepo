pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
//        maven {
//            url = uri("https://jitpack.io")
//            credentials {
//                username = "jp_hn6rfihc1bs0f1ekmsdrl5jfkq"
//            }
//        }
    }
}

rootProject.name = "My Application1"
include(":app")
include(":scan-lib")
include(":Mylib")
