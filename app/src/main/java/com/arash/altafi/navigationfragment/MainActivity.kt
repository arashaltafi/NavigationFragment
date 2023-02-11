package com.arash.altafi.navigationfragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.arash.altafi.navigationfragment.sample1.SampleOne
import com.arash.altafi.navigationfragment.sample2.SampleTwo
import com.arash.altafi.navigationfragment.sample4.SampleFour
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    private lateinit var btnDeepLink: MaterialButton
    private lateinit var btnOne: MaterialButton
    private lateinit var btnTwo: MaterialButton
    private lateinit var btnThree: MaterialButton
    private lateinit var btnFour: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        if (intent.action == Intent.ACTION_VIEW) {
            val deepLink = intent.data
            if (deepLink != null) {
                when (deepLink.path) {
                    "/resume.html" -> {
                        val intent = Intent(this, SampleOne::class.java).apply {
                            putExtra("deepLink", "resume")
                        }
                        startActivity(intent)
                    }
                }
            }
        }
    }

    private fun init() {
        bindViews()

        btnDeepLink.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://arashaltafi.ir")
                )
            )
        }

        btnOne.setOnClickListener {
            startActivity(Intent(this, SampleOne::class.java))
        }

        btnTwo.setOnClickListener {
            startActivity(Intent(this, SampleTwo::class.java))
        }

        btnFour.setOnClickListener {
            startActivity(Intent(this, SampleFour::class.java))
        }

    }

    private fun bindViews() {
        btnDeepLink = findViewById(R.id.btn_deep_link)
        btnOne = findViewById(R.id.btn_one)
        btnTwo = findViewById(R.id.btn_two)
        btnThree = findViewById(R.id.btn_three)
        btnFour = findViewById(R.id.btn_four)
    }

}