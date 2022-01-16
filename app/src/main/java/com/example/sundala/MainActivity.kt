package com.example.sundala

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment=FirstFragment()
        val secondragment=SecondFragment()


        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, firstFragment)
            commit()
        }
    btnfragment1 .setOnClickListener {
    supportFragmentManager .beginTransaction() .apply {
        replace(R.id.flFragment, firstFragment)
        commit()
    }
}
    btnfragment2 .setOnClickListener {
        supportFragmentManager .beginTransaction() .apply {
            replace(R.id.flFragment, secondragment)
            commit()
        }
    }
            }
        }


