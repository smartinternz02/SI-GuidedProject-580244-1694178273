package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton:Button=findViewById(R.id.rollButton)
        rollButton.setOnClickListener{
            diceRoller()
        }


    }

    private fun diceRoller(){
        val drawableResource =when (Random().nextInt(6)+1){
            1-> R.drawable.one
            2-> R.drawable.two
            3-> R.drawable.three
            4-> R.drawable.four
            5-> R.drawable.five
            else -> R.drawable.six
        }
        val diceimage: ImageView = findViewById(R.id.imgview)
        diceimage.setImageResource(drawableResource)
    }
}
