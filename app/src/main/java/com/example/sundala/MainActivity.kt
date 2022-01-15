package com.example.sundala

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      val firstFragment = FirstFragment()
      val secondFragment = FirstFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R. id.flFragment, firstFragment)
            commit()
        }

    }
}