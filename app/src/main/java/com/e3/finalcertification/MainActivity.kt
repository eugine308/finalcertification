package com.e3.finalcertification

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.FragmentContainer
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val blankFragment = BlankFragment()

        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_container_view, blankFragment)
            //.add(R.id.fragment_container_view, scrollingFragment)
            .addToBackStack(null)
            .setReorderingAllowed(true)
            .commit()
    }
}
