package com.arash.altafi.navigationfragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.navigationfragment.sample2.SampleTwo
import com.arash.altafi.navigationfragment.sample3.SampleThree
import com.arash.altafi.navigationfragment.sapmle1.SampleOne
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    private lateinit var btnOne : MaterialButton
    private lateinit var btnTwo : MaterialButton
    private lateinit var btnThree : MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        bindViews()

        btnOne.setOnClickListener {
            startActivity(Intent(this , SampleOne::class.java))
        }

        btnTwo.setOnClickListener {
            startActivity(Intent(this , SampleTwo::class.java))
        }

        btnThree.setOnClickListener {
            startActivity(Intent(this , SampleThree::class.java))
        }

    }

    private fun bindViews() {
        btnOne = findViewById(R.id.btn_one)
        btnTwo = findViewById(R.id.btn_two)
        btnThree = findViewById(R.id.btn_three)
    }

}