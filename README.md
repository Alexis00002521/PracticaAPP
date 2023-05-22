# PracticaAPP
Librerias ocupadas 
- navigation-fragment-ktx
- navigation-ui-ktx
-
buildscript{
    ext {
	activity_version = "1.7.1"
	fragment_version = "1.5.5"
	lifecycle_version = "2.5.1"
	arch_version = "2.1.0
	nav_version = "2.5.3"
	}
}



// Kotlin
    implementation "androidx.activity:activity-ktx:$activity_version"
   // Kotlin
    implementation "androidx.fragment:fragment-ktx:$fragment_version"
 // Kotlin
  implementation "androidx.navigation:navigation-fragment-ktx:$nav_version"
  implementation "androidx.navigation:navigation-ui-ktx:$nav_version"
  
implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
    // LiveData
    implementation "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"

    
    
    


  buildFeatures {
        dataBinding true
    }
