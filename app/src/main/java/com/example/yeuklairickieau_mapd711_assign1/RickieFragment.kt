package com.example.yeuklairickieau_mapd711_assign1


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment


// this file is for task 2
class RickieFragment : Fragment()  {

    // initiate the 4 labels displaying the text
    private lateinit var onCreateViewText: TextView
    private lateinit var onStartText: TextView
    private lateinit var onResumeText: TextView
    private lateinit var onPauseText: TextView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_rickie, container, false)

        // connect the 4 TextView that display the text
        onCreateViewText = view.findViewById<TextView>(R.id.onCreateViewLabel)
        onStartText = view.findViewById<TextView>(R.id.onStartLabel)
        onResumeText = view.findViewById<TextView>(R.id.onResumeLabel)
        onPauseText = view.findViewById<TextView>(R.id.onPauseLabel)

        // display the message after onCreateView() is invoked
        onCreateViewText.text = "onCreateView() invoked"

        return view
    }

    // display the message after onStart() is invoked
    override fun onStart() {
        // inherit the onStart() function, prevent it from being modified
        super.onStart()
        onStartText.text = "OnStart() invoked"
    }

    // display the message after onResume() is invoked
    override fun onResume() {
        // inherit the onResume() function, prevent it from being modified
        super.onResume()
        onResumeText.text = "onResume() invoked"
    }

    // display the message after onPause() is invoked
    override fun onPause() {
        // inherit the onPause() function, prevent it from being modified
        super.onPause()
        onPauseText.text = "onPause() invoked"
    }


}