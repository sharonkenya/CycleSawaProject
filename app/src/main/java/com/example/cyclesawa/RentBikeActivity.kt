package com.example.cyclesawa
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RentBikeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rent_bike)

        // Sample list of bicycles (replace with your actual data)
        val bicycleList = listOf(
            Bicycle(1, "Bike 1", "Description for Bike 1", "https://example.com/bike1.jpg"),
            Bicycle(2, "Bike 2", "Description for Bike 2", "https://example.com/bike2.jpg"),
            // Add more bicycles here
        )

        // Initialize the RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val layoutManager = LinearLayoutManager(this)
        val adapter = BicycleAdapter(bicycleList)

        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
    }
}

//class RentBikeActivity {
//}