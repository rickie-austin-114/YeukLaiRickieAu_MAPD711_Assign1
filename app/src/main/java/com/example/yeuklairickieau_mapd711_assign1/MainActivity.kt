package com.example.yeuklairickieau_mapd711_assign1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.view.View
import android.widget.EditText
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)


        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, RickieFragment())
            .commit()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    //defining a button click event
    fun Button_Click(v: View) {
        //checking whether the button 1 is clicked or not
        if (v.id == R.id.button1) {
            //creating an intent object using both first and second activities.
            val i = Intent(this@MainActivity, SecondActivity::class.java)

            //java reference object for edit text control
            val nameInput = findViewById<EditText>(R.id.nameInput)

            //getting value from edit text and assign to string message
            val nameMessage = nameInput.text.toString()

            //assigning value into intent object using key and values pairs.
            i.putExtra("Name", nameMessage)

            val addressInput = findViewById<EditText>(R.id.addressInput)
            val addressMessage = addressInput.text.toString()
            i.putExtra("Address", addressMessage)

            val professionInput = findViewById<EditText>(R.id.professionInput)
            val professionMessage = professionInput.text.toString()
            i.putExtra("Profession", professionMessage)

            val dreamJobInput = findViewById<EditText>(R.id.dreamJobInput)
            val dreamJobMessage = dreamJobInput.text.toString()
            i.putExtra("DreamJob", dreamJobMessage)

            val favoriteFoodInput = findViewById<EditText>(R.id.favoriteFoodInput)
            val favoriteFoodMessage = favoriteFoodInput.text.toString()
            i.putExtra("FavoriteFood", favoriteFoodMessage)

            //starting sub activity
            startActivity(i)

        }
    }
}