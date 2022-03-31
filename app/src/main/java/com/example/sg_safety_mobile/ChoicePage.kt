package com.example.sg_safety_mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ChoicePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choice_page)
        val yesbutton: Button =findViewById(R.id.yes)
        val nobutton:Button=findViewById(R.id.no)
        yesbutton.setOnClickListener{
            val intent = Intent(this, HelperChoice::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent)
        }
        nobutton.setOnClickListener{
            this.finish()
        }
    }
}