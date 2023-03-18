package com.example.randomizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.random.Random
import android.widget.SeekBar
import android.widget.Button
import android.widget.TextView
import java.util.*
import kotlin.collections.HashMap


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.rollButton)
        val resultsTextView = findViewById<TextView>(R.id.result)
        val seekbar = findViewById<SeekBar>(R.id.seekBar)


        var hMap : HashMap<Int, String>
                = HashMap<Int, String> ()

        hMap.put(1,"Bateman")
        hMap.put(2,"milkman")
        hMap.put(3,"superman")
        hMap.put(4,"Bateman")
        hMap.put(5,"Bateman")
        hMap.put(6,"Bateman")
        hMap.put(7,"Bateman")
        hMap.put(8,"Bateman")
        hMap.put(9,"Bateman")
        hMap.put(10,"Bateman")

        rollButton.setOnClickListener {
             val rand = Random.nextInt(seekbar.progress)+1
            resultsTextView.text=rand.toString()

        }
    }
}