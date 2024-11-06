import com.vanniktech.maven.publish.SonatypeHost

plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.vannitktech.maven.publish)
}

android {
    namespace = "com.kdroid.androidcontextprovider"
    compileSdk = 34

    defaultConfig {
        minSdk = 21
        targetSdk = 34
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies { }

mavenPublishing {
    coordinates(
        groupId = "io.github.kdroidfilter",
        artifactId = "androidcontextprovider",
        version = "1.0.1"
    )

    // Configure POM metadata for the published artifact
    pom {
        name.set("AndroidContextProvider")
        description.set("Android Context Provider is a simple utility library that allows you to easily access the application context from anywhere in your app. This can be especially useful for situations where accessing the context in a static manner is needed.")
        inceptionYear.set("2024")
        url.set("https://github.com/kdroidFilter/AndroidContextProvider")

        licenses {
            license {
                name.set("MIT")
                url.set("https://opensource.org/licenses/MIT")
            }
        }

        // Specify developers information
        developers {
            developer {
                id.set("kdroidfilter")
                name.set("Elyahou Hadass")
                email.set("elyahou.hadass@gmail.com")
            }
        }

        // Specify SCM information
        scm {
            url.set("https://github.com/kdroidFilter/AndroidContextProvider")
        }
    }

    // Configure publishing to Maven Central
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)


    // Enable GPG signing for all publications
    signAllPublications()
}


