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

        // add the toolbar on top
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        // add fragment to the layout
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, RickieFragment())
            .commit()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    // submit event
    fun Button_Click(v: View) {
        //checking whether the submit button is clicked or not
        if (v.id == R.id.submit) {
            //creating an intent object using both first and second activities.
            val i = Intent(this@MainActivity, SecondActivity::class.java)

            // get the name input, send it to second activity
            val nameInput = findViewById<EditText>(R.id.nameInput)
            val nameMessage = nameInput.text.toString()
            i.putExtra("Name", nameMessage)

            // get the address input, send it to second activity
            val addressInput = findViewById<EditText>(R.id.addressInput)
            val addressMessage = addressInput.text.toString()
            i.putExtra("Address", addressMessage)

            // get the profession input, send it to second activity
            val professionInput = findViewById<EditText>(R.id.professionInput)
            val professionMessage = professionInput.text.toString()
            i.putExtra("Profession", professionMessage)

            // get the dream job input, send it to second activity
            val dreamJobInput = findViewById<EditText>(R.id.dreamJobInput)
            val dreamJobMessage = dreamJobInput.text.toString()
            i.putExtra("DreamJob", dreamJobMessage)

            // get the favorite food input, send it to second activity
            val favoriteFoodInput = findViewById<EditText>(R.id.favoriteFoodInput)
            val favoriteFoodMessage = favoriteFoodInput.text.toString()
            i.putExtra("FavoriteFood", favoriteFoodMessage)

            //starting second activity
            startActivity(i)
        }
    }
}