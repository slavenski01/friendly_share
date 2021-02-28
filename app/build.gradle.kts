plugins {
    id("com.android.application")
    id("kotlin-android")
    kotlin("kapt")
}

android {
    compileSdkVersion(29)
    buildToolsVersion("29.0.3")

    defaultConfig {
        applicationId = "com.example.friendlyshare"
        minSdkVersion(21)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            minifyEnabled(false)
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
        viewBinding = true
        compose = true
    }

    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_1_8)
        targetCompatibility(JavaVersion.VERSION_1_8)
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.0.0-beta01"
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.4.30")
    implementation("androidx.core:core-ktx:1.3.2")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("com.google.android.material:material:1.3.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
    testImplementation("junit:junit:4.+")
    androidTestImplementation("androidx.test.ext:junit:1.1.2")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")

    /*Jetpack compose*/
    implementation("androidx.compose.ui:ui:1.0.0-beta01")
    // Tooling support (Previews, etc.)
    implementation ("androidx.compose.ui:ui-tooling:1.0.0-beta01")
    // Foundation (Border, Background, Box, Image, Scroll, shapes, animations, etc.)
    implementation ("androidx.compose.foundation:foundation:1.0.0-beta01")
    // Material Design
    implementation ("androidx.compose.material:material:1.0.0-beta01")
    // Material design icons
    implementation ("androidx.compose.material:material-icons-core:1.0.0-beta01")
    implementation ("androidx.compose.material:material-icons-extended:1.0.0-beta01")
    // Integration with activities
    implementation ("androidx.activity:activity-compose:1.3.0-alpha03")

    // UI Tests
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.0.0-beta01")

    //startup
    implementation("androidx.startup:startup-runtime:1.0.0")

    //dagger 2 DI
    kapt("com.google.dagger:dagger-compiler:2.24")
    implementation("com.google.dagger:dagger:2.24")

    //navigation
    implementation("com.github.terrakok:cicerone:6.6")

    //Moxy
    kapt("tech.schoolhelper:moxy-x-compiler:1.7.0")
    implementation("tech.schoolhelper:moxy-x-androidx:1.7.0")
    implementation("tech.schoolhelper:moxy-x:1.7.0")

    //Moshi
    implementation("com.squareup.moshi:moshi:1.8.0")
    implementation("com.squareup.moshi:moshi-kotlin:1.8.0")
    kapt("com.squareup.moshi:moshi-kotlin-codegen:1.8.0")

    //Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.8")
    implementation("com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:0.9.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.8")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.7")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")

    //RecyclerView
    implementation("androidx.recyclerview:recyclerview:1.1.0")
}