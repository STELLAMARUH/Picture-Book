package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*
import com.example.picturebook.MainActivity3 as PicturebookMainActivity3

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


btnPrevious.setOnClickListener(){

            startActivity(Intent(baseContext, MainActivity::class.java))
}
btnNext.setOnClickListener{

            startActivity(Intent(baseContext,com.example.picturebook.MainActivity3::class.java))
}
}
}

