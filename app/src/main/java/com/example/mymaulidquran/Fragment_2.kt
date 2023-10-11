package com.example.mymaulidquran

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Fragment_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_2)

        val fragmentManager = supportFragmentManager
        val fragment_1 = Fragment_1()
        val fragment = fragmentManager.findFragmentByTag(Fragment_1::class.java.simpleName)

        if (fragment !is Fragment_1) {
            fragmentManager
                .beginTransaction()
                .add(R.id.container, fragment_1, Fragment_1::class.java.simpleName)

        }
    }
}