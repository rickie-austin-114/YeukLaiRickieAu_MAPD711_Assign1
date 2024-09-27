package com.example.yeuklairickieau_mapd711_assign1


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity





class RickieFragment : Fragment()  {

    // initiate the 4 labels displaying the text
    private lateinit var onCreateViewText: TextView
    private lateinit var onStartText: TextView
    private lateinit var onResumeText: TextView
    private lateinit var onPauseText: TextView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_rickie, container, false)

        //
        onCreateViewText = view.findViewById<TextView>(R.id.onCreateViewLabel)
        onStartText = view.findViewById<TextView>(R.id.onStartLabel)
        onResumeText = view.findViewById<TextView>(R.id.onResumeLabel)
        onPauseText = view.findViewById<TextView>(R.id.onPauseLabel)
        onCreateViewText.text = "onCreateView() invoked"

        return view
    }

    override fun onStart() {
        super.onStart()
        onStartText.text = "OnStart() invoked"
    }

    override fun onResume() {
        super.onResume()
        onResumeText.text = "onResume() invoked"
    }

    override fun onPause() {
        super.onPause()
        onPauseText.text = "onPause() invoked"
    }


}