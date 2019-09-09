package com.example.fav_stars

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_johnneydeep.*
import kotlinx.android.synthetic.main.activity_keanureeves.*
import kotlinx.android.synthetic.main.activity_keanureeves.tack
import kotlinx.android.synthetic.main.activity_keanureeves.tvBak
import kotlinx.android.synthetic.main.activity_keanureeves.vBak

class keanureeves : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keanureeves)

        val T = findViewById<TextView>(R.id.Ktxt)
        T.setText("Keanu Charles Reeves (/kiˈɑːnuː/ kee-AH-noo;[1][2] born September 2, 1964) is a Canadian[a] actor and musician. He gained fame for his starring roles in several blockbuster films, including comedies from the Bill and Ted franchise (1989–2020), action thrillers Point Break (1991), Speed (1994), the John Wick franchise (2014–2021), psychological thriller The Devil's Advocate (1997), supernatural thriller Constantine (2005), and science fiction/action series The Matrix (1999–2003). He has also appeared in dramatic films, such as Dangerous Liaisons (1988), My Own Private Idaho (1991), and Little Buddha (1993), as well as the romantic horror Bram Stoker's Dracula (1992).\n" +
                "\n" +
                "Reeves has earned critical acclaim for his acting. One New York Times critic praised Reeves' versatility, saying that he \"displays considerable discipline and range... he moves easily between the buttoned-down demeanor that suits a police procedural story and the loose-jointed manner of his comic roles.\"[3] However, Reeves has spent much of his later career being typecast. Saving the world is a recurring character arc in many roles he has portrayed, as manifested in characters such as Ted Logan, Siddhartha Buddha, Neo, Johnny Mnemonic, John Constantine, and Klaatu. The John Wick franchise represented a return to critical praise and commercial success for Reeves.[4][5][6] His acting has garnered several awards, and he has a star on the Hollywood Walk of Fame.\n" +
                "\n" +
                "Outside of film acting, Reeves has pursued other forms of artistry, including stage acting, music performing, and directing. Onstage, he performed as Prince Hamlet for the Manitoba Theatre Centre's production of Hamlet. He is a musician and played bass guitar for the bands Dogstar and Becky. He wrote the text for a picture book, Ode to Happiness, illustrated by Alexandra Grant. He has also produced a documentary, Side by Side, and directed the martial arts film Man of Tai Chi.")
        JWweb.setOnClickListener {
            val url = "https://www.imdb.com/title/tt2911666/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        Matweb.setOnClickListener {
            val url = "https://www.imdb.com/title/tt0133093/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        SPDweb.setOnClickListener {
            val url = "https://www.imdb.com/title/tt0111257/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        TSweb.setOnClickListener {
            val url = "https://www.imdb.com/title/tt1979376/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        TLHweb.setOnClickListener {
            val url = "https://www.imdb.com/title/tt0410297/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        vBak.setOnClickListener {
            Toast.makeText(this , "Not Available", Toast.LENGTH_SHORT).show()
        }
        tvBak.setOnClickListener {
            Toast.makeText(this , "Not Available", Toast.LENGTH_SHORT).show()
        }
        tack.setOnClickListener {
            Toast.makeText(this , "Not Available", Toast.LENGTH_SHORT).show()
        }
    }
}
