package com.example.cyclesawa
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
//import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
//import com.example.cyclesawa.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
    }



        class MainViewModel : ViewModel()



//        // Set up your view model (if needed)
//        val viewModel = MainViewModel()

        // Bind the view model to the layout

//        binding.viewModel = MainViewModel
//
//        // Ensure LiveData updates are observed
//        binding.lifecycleOwner = this
    }


//import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.view.View
//class MainActivity : AppCompatActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }
//
//    // Called when the "Rent a Bike" button is clicked
//    fun onRentBikeClick() {
//        // Start the activity to rent a bike
//        val intent = Intent(this, RentBikeActivity::class.java)
//        startActivity(intent)
//    }
//
//    // Called when the "Update Profile" button is clicked
//    fun onUpdateProfileClick() {
//        // Start the activity to update the user's profile
//        val intent = Intent(this, UpdateProfileActivity::class.java)
//        startActivity(intent)
//    }
//
//    fun onUpdateProfileClick(view: View) {}
//    fun onRentBikeClick(view: View) {}
//}

//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }
//
//    fun onUpdateProfileClick(view: View) {}
//}
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//
//class MainActivityy : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }
//}
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import com.example.cyclesawa.ui.theme.CycleSawaTheme
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            CycleSawaTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting("Android")
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    CycleSawaTheme {
//        Greeting("Android")
//    }
//}
//<?xml version="1.0" encoding="utf-8"?>
//<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
//xmlns:app="http://schemas.android.com/apk/res-auto"
//xmlns:tools="http://schemas.android.com/tools"
//android:layout_width="match_parent"
//android:layout_height="match_parent"
//tools:context=".MainActivity">
//
//<TextView
//android:layout_width="wrap_content"
//android:layout_height="wrap_content"
//android:text="Hello World!"
//app:layout_constraintBottom_toBottomOf="parent"
//app:layout_constraintLeft_toLeftOf="parent"
//app:layout_constraintRight_toRightOf="parent"
//app:layout_constraintTop_toTopOf="parent" />
//
//</androidx.constraintlayout.widget.ConstraintLayout>