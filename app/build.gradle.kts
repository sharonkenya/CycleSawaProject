
plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
    id ("com.google.gms.google-services")
}

android {
    compileSdk= 34
    namespace="com.example.cyclesawa"

    defaultConfig {
        applicationId= "com.example.cyclesawa"
        minSdk= 22
        targetSdk= 32
        versionCode= 1
        versionName ="1.0"

        testInstrumentationRunner= "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled= false
            proguardFiles (getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
//    compileOptions {
//        sourceCompatibility JavaVersion.VERSION_1_8
//                targetCompatibility JavaVersion.VERSION_1_8
//    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures{
        viewBinding = true
        compose = true
        dataBinding=true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

}

dependencies {

    implementation ("androidx.core:core-ktx:1.12.0")
    implementation ("androidx.appcompat:appcompat:1.6.1")
    implementation ("com.google.android.material:material:1.9.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation ("com.google.firebase:firebase-auth:22.1.2")
    implementation("androidx.compose.ui:ui-graphics-android:1.5.1")
    implementation("com.google.firebase:firebase-database-ktx:20.2.2")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
    implementation("androidx.activity:activity-compose:1.7.2")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))
    implementation("com.google.firebase:firebase-auth-ktx:22.1.2")
//    implementation platform("com.google.firebase:firebase-bom:32.3.1")
    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
    implementation ("com.square.picasso:picasso:2.8")

    implementation( "androidx.lifecycle:lifecycle-view-model-ktx:2.6.2") // Replace with the correct version
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2" )// Replace with the correct version
    implementation ("com.softhearted.modded:android-image-cropper:")
    implementation ("un0912.ted:datetimepicker:2.3.4")
    implementation("com.square.picasso:picasso:2.8")
    implementation ("roods.lifecycle:lifecycle-view-model-ktx:2.6.2")
    implementation("om.softhearted.modded:android-image-cropper:.")
    implementation ("912.ted:datetimepicker:2.3.4")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

}
//plugins {
//    id("com.android.application")
//    id("org.jetbrains.kotlin.android")
////    id("com.android.application")
//    id("com.google.gms.google-services")
//
//}
//
//android {
//    namespace = "com.example.cyclesawa"
//    compileSdk = 34
//
//    defaultConfig {
//        applicationId = "com.example.cyclesawa"
//        minSdk = 24
//        targetSdk = 33
//        versionCode = 1
//        versionName = "1.0"
//
//        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
//        vectorDrawables {
//            useSupportLibrary = true
//        }
//    }
//
//    buildTypes {
//        release {
//            isMinifyEnabled = false
//            proguardFiles(
//                getDefaultProguardFile("proguard-android-optimize.txt"),
//                "proguard-rules.pro"
//            )
//        }
//    }
//    compileOptions {
//        sourceCompatibility = JavaVersion.VERSION_1_8
//        targetCompatibility = JavaVersion.VERSION_1_8
//    }
//    kotlinOptions {
//        jvmTarget = "1.8"
//    }
//    buildFeatures {
//        compose = true
//        viewBinding=true
//    }
//    composeOptions {
//        kotlinCompilerExtensionVersion = "1.4.3"
//    }
//    packaging {
//        resources {
//            excludes += "/META-INF/{AL2.0,LGPL2.1}"
//        }
//    }
//}
//
//dependencies {
//    implementation(platform("com.google.firebase:firebase-bom:32.3.1"))
//    implementation("com.google.firebase:firebase-auth-ktx")
//    implementation("com.google.android.gms:play-services-auth:20.7.0")
//    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")
//    implementation ("com.google.android.material:material:1.9.0")
//
//
//
//    implementation("androidx.core:core-ktx:1.12.0")
//    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
//    implementation("androidx.activity:activity-compose:1.7.2")
//    implementation(platform("androidx.compose:compose-bom:2023.09.01"))
//    implementation("androidx.compose.ui:ui")
//    implementation("androidx.compose.ui:ui-graphics")
//    implementation("androidx.compose.ui:ui-tooling-preview")
//    implementation("androidx.compose.material3:material3")
//    implementation(platform("androidx.compose:compose-bom:2023.09.01"))
//    implementation(platform("androidx.compose:compose-bom:2023.09.01"))
//    implementation(platform("androidx.compose:compose-bom:2023.09.01"))
//    implementation("com.google.firebase:firebase-database-ktx:20.2.2")
//    testImplementation("junit:junit:4.13.2")

//    androidTestImplementation(platform("androidx.compose:compose-bom:2023.09.01"))

//    androidTestImplementation(platform("androidx.compose:compose-bom:2023.09.01"))
//    androidTestImplementation(platform("androidx.compose:compose-bom:2023.09.01"))
//    androidTestImplementation(platform("androidx.compose:compose-bom:2023.09.01"))

//}