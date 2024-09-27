package com.example.yeuklairickieau_mapd711_assign1


import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.strings)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //defining an intent object
        val intent = intent

        //getting values from previous activity using intent object
        val name = intent.getStringExtra("Name")
        val nameText = findViewById<TextView>(R.id.nameText)
        nameText.text = "Name: $name"

        val address = intent.getStringExtra("Address")
        val addressText = findViewById<TextView>(R.id.addressText)
        addressText.text = "Name: $address"

        val profession = intent.getStringExtra("Profession")
        val professionText = findViewById<TextView>(R.id.professionText)
        professionText.text = "Profession: $profession"

        val dreamJob = intent.getStringExtra("DreamJob")
        val dreamJobText = findViewById<TextView>(R.id.dreamJobText)
        dreamJobText.text = "Dream Job: $dreamJob"

        val favoriteFood = intent.getStringExtra("FavoriteFood")
        val favoriteFoodText = findViewById<TextView>(R.id.favoriteFoodText)
        favoriteFoodText.text = "Favorite Food: $favoriteFood"
    }
}