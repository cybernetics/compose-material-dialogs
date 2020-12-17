object Dependencies {
    const val androidGradlePlugin = "com.android.tools.build:gradle:7.0.0-alpha02"
    const val material = "com.google.android.material:material:1.2.1"

    object ComposeMaterialDialogs {
        const val version = "0.2.7"

        const val core = "com.vanpra.compose-material-dialogs:core:$version"
        const val datetime = "com.vanpra.compose-material-dialogs:datetime:$version"
        const val color = "com.vanpra.compose-material-dialogs:color:$version"
    }

    object Accompanist {
        private const val version = "0.4.0"
        const val coil = "dev.chrisbanes.accompanist:accompanist-coil:$version"
    }

    object Kotlin {
        const val version = "1.4.20"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
    }

    object AndroidX {
        const val appcompat = "androidx.appcompat:appcompat:1.2.0-rc01"
        const val coreKtx = "androidx.core:core-ktx:1.5.0-alpha02"

        object Compose {
            const val version = "1.0.0-alpha08"

            const val ui = "androidx.compose.ui:ui:$version"
            const val tooling = "androidx.compose.ui:ui-tooling:$version"
            const val material = "androidx.compose.material:material:$version"
            const val materialIconsExtended = "androidx.compose.material:material-icons-extended:$version"

        }
    }
}