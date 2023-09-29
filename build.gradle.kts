buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
//        classpath("com.android.tools.build:gradle:3.6.3")
      classpath ("com.android.tools.build:gradle:8.1.1")
        classpath("com.google.gms:google-services:4.4.0")  }
}

allprojects {
    repositories {
//        google()
//        jcenter()
    }
}
plugins {
    id("com.android.application") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    id("com.google.gms.google-services") version "4.4.0" apply false
}
//dependencies {
//    implementation("com.softhearted.modded:android-image-cropper:")
//    implementation("un0912.ted:datetimepicker:2.3.4")
//    implementation("roods.lifecycle:lifecycle-view-model-ktx:2.6.2")
//    implementation("om.softhearted.modded:android-image-cropper:..")
//    implementation("912.ted:datetimepicker:2.3.4")
}//buildscript {
//    repositories{
//        google ()
//        mavenCentral()
//        }
//    dependencies {
////        classpath("com.google.gms:google-services:8.2.0")
//        classpath ("com.android.tools.build:gradle:8.1.1")
//        classpath("com.google.gms:google-services:4.4.0")
//    }}
//// Top-level build file where you can add configuration options common to all sub-projects/modules.

//dependencies {
//    implementation("com.square.picasso:picasso:2.8")
//    implementation("androidx.lifecycle:lifecycle-view-model-ktx:2.6.2")
//    implementation("com.softhearted.modded:android-image-cropper:.")
//    implementation("un0912.ted:datetimepicker:2.3.4")}
