package com.example.fav_stars

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        favJohnny.setOnClickListener {
            Toast.makeText(this , "Johnny Deep" , Toast.LENGTH_SHORT).show()
            val int1 = Intent(this , johnneydeep::class.java)
            startActivity(int1)
        }
        favKeanu.setOnClickListener {
            Toast.makeText(this , "You're Breathtaking" , Toast.LENGTH_SHORT).show()
            val int2 = Intent(this , keanureeves::class.java)
            startActivity(int2)
        }
        favClint.setOnClickListener {
            Toast.makeText(this , "Margot Robbie" , Toast.LENGTH_SHORT).show()
            val int3 = Intent(this , margot::class.java)
            startActivity(int3)
        }
        favQuentin.setOnClickListener {
            Toast.makeText(this , "Quentin Tarantino" , Toast.LENGTH_SHORT).show()
            val int4 = Intent(this , quentintarantino::class.java)
            startActivity(int4)
        }
        favRDJ.setOnClickListener {
            Toast.makeText(this , "Robert Downey Jr" ,Toast.LENGTH_SHORT).show()
            val int5 = Intent(this , robertdowney::class.java)
            startActivity(int5)
        }
        favRYAN.setOnClickListener {
            Toast.makeText(this , "Rayan Reynold" , Toast.LENGTH_SHORT).show()
            val int6 = Intent(this , rayanrenolds::class.java)
            startActivity(int6)
        }
    }
}
