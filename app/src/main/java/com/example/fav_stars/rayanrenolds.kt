package com.example.fav_stars

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_jacknicholson.*
import kotlinx.android.synthetic.main.activity_tomhanks.*
import kotlinx.android.synthetic.main.activity_tomhanks.tack
import kotlinx.android.synthetic.main.activity_tomhanks.tvBak
import kotlinx.android.synthetic.main.activity_tomhanks.vBak

class rayanrenolds : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tomhanks)

        val T = findViewById<TextView>(R.id.Ttxt)
        T.setText("Ryan Rodney Reynolds (born October 23, 1976) is a Canadian-American actor, comedian, film producer, and screenwriter.\n" +
                "\n" +
                "He began his career starring in the Canadian teen soap opera Hillside and had minor roles before landing the role of Michael Bergen on the sitcom Two Guys and a Girl between 1998 and 2001. Reynolds then starred in a range of films, including comedies such as National Lampoon's Van Wilder, Waiting..., and The Proposal. He also performed in dramatic roles in Buried, Woman in Gold, and Life, and starred in action films such as Blade: Trinity, Green Lantern, and Safe House.\n" +
                "\n" +
                "In 2016, he starred as the title character in Deadpool. The film received critical and commercial acclaim and set numerous records at the time of its release for an R-rated comedy. For his performance, Reynolds received numerous accolades, including nominations for the Critics' Choice Movie Awards and the Golden Globe Awards. He reprised the role in Deadpool 2.\n" +
                "\n" +
                "Reynolds was awarded a star on the Hollywood Walk of Fame in 2017. He is married to actress Blake Lively, with whom he has two daughters and is expecting a third child")

        DEDweb.setOnClickListener {
            val url = "https://www.imdb.com/title/tt1431045/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        WOLweb.setOnClickListener {
            val url = "https://www.imdb.com/title/tt0458525/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        PIKAweb.setOnClickListener {
            val url = "https://www.imdb.com/title/tt5884052/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        PROPweb.setOnClickListener {
            val url = "https://www.imdb.com/title/tt1041829/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        HBDweb.setOnClickListener {
            val url = "https://www.imdb.com/title/tt1959563/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        vBak.setOnClickListener {
            val url = "https://twitter.com/vancityreynolds"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        tvBak.setOnClickListener {
            val url = "https://www.instagram.com/vancityreynolds/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        tack.setOnClickListener {
            val url = "https://www.youtube.com/channel/UCA3-nIYWu4PTWkb6NwhEpzg"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
    }
}
