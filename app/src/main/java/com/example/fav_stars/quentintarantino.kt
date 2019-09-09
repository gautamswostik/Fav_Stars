package com.example.fav_stars

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_johnneydeep.*
import kotlinx.android.synthetic.main.activity_quentintarantino.*
import kotlinx.android.synthetic.main.activity_quentintarantino.tack
import kotlinx.android.synthetic.main.activity_quentintarantino.tvBak
import kotlinx.android.synthetic.main.activity_quentintarantino.vBak

class quentintarantino : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quentintarantino)

        val T = findViewById<TextView>(R.id.Qtxt)
        T.setText("Quentin Jerome Tarantino[1] (/ˌtærənˈtiːnoʊ/; born March 27, 1963) is an American filmmaker and actor. His films are characterized by nonlinear storylines, satirical subject matter, an aestheticization of violence, extended scenes of dialogue, ensemble casts consisting of established and lesser-known performers, references to popular culture and a wide variety of other films, soundtracks primarily containing songs and score pieces from the 1960s to the 1980s, and features of neo-noir film.\n" +
                "\n" +
                "In the early 1990s, he began his career as an independent filmmaker with the release of Reservoir Dogs in 1992, which was funded by money from the sale of his script True Romance. Empire deemed Reservoir Dogs the \"Greatest Independent Film of All Time\". Its popularity was boosted by his second film, Pulp Fiction (1994), a black comedy crime film that was a major success both among critics and audiences.[2][3] For his next effort, Tarantino paid homage to the blaxploitation films of the 1970s with Jackie Brown (1997), an adaptation of Elmore Leonard's novel Rum Punch.\n" +
                "\n" +
                "Kill Bill, a highly stylized \"revenge flick\" in the cinematic traditions of Kung fu films, Japanese martial arts, Spaghetti Westerns and Italian horror, followed six years later, and was released as two films: Volume 1 in 2003 and Volume 2 in 2004. Tarantino next directed Death Proof in 2007, as part of a double feature with Robert Rodriguez, under the collective title Grindhouse. His long-postponed Inglourious Basterds, which tells an alternate history of Nazi Germany, was released in 2009 to positive reviews. After that came critically acclaimed Django Unchained (2012), a Western film set in the Antebellum South. His eighth film, The Hateful Eight (2015), was released in its roadshow version in 70 mm film format, with opening \"overture\" and halfway-point intermission. His ninth film, Once Upon a Time in Hollywood, is scheduled to be released on July 26, 2019.\n" +
                "\n" +
                "Tarantino's films have garnered both critical and commercial success. He has received many industry awards, including two Academy Awards, two Golden Globe Awards, two BAFTA Awards and the Palme d'Or, and has been nominated for an Emmy and a Grammy. In 2005, he was included on the annual Time 100 list of the most influential people in the world.[4] Filmmaker and historian Peter Bogdanovich has called him \"the single most influential director of his generation\".[5] In December 2015, Tarantino received a star on the Hollywood Walk of Fame for his contributions to the film industry.[6]")

        PULPweb.setOnClickListener {
            val url = "https://www.imdb.com/title/tt0110912/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        RESweb.setOnClickListener {
            val url = "https://www.imdb.com/title/tt0105236/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        INGLOweb.setOnClickListener {
            val url = "https://www.imdb.com/title/tt0361748/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        THEweb.setOnClickListener {
            val url = "https://www.imdb.com/title/tt3460252/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        DJUNweb.setOnClickListener {
            val url = "https://www.imdb.com/title/tt1853728/"
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
