package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main2.btnPrevious
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.activity_main4.*
import kotlinx.android.synthetic.main.activity_main2.btnNext as btnNext1
import kotlinx.android.synthetic.main.activity_main4.btnNext as btnNext1

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        btnPrevious.setOnClickListener() {
            startActivity(Intent(baseContext, MainActivity3::class.java))

        }
        val onClickListener: Any = btnNext.setOnClickListener() {
            startActivity(Intent(baseContext, MainActivity5::class.java))
        }

    }
    }

