import java.net.URI


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
        maven {
            url = uri("https://jitpack.io")
            credentials {
                username = "jp_l43utbn9e1e8b6fcu6s8vse8ns"
            }
        }
    }
}

rootProject.name = "My Application1"
include(":app")
include(":scan-lib")
include(":Mylib")
