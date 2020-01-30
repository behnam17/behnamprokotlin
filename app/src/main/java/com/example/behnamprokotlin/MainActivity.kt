package com.example.behnamprokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(),TestRecyclerClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = arrayListOf<String>("  Profile","  Products","  Share","  About Us")

        val adapter = TestKotlinRecyclerAdapter(list, this)
        recycler.adapter = adapter


    }

    override fun onclick(name: String) {
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show()
    }
}
