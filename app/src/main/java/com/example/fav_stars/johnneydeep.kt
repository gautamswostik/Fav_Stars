package com.example.fav_stars

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_johnneydeep.*

class johnneydeep : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_johnneydeep)


        val T = findViewById<TextView>(R.id.Jtxt)
        T.setText("John Christopher Depp II (born June 9, 1963) is an American actor, producer, and musician. He has been nominated for 10 Golden Globe Awards, winning one for Best Actor for his performance of the title role in Sweeney Todd: The Demon Barber of Fleet Street (2008) and has been nominated for three Academy Awards for Best Actor, among other accolades. He is regarded as one of the world's biggest film stars.[1][2]\n" +
                "\n" +
                "Depp rose to prominence on the 1980s television series 21 Jump Street, becoming a teen idol. He has gained praise from reviewers for his portrayals of screenwriter-director Ed Wood in Ed Wood, undercover FBI agent Joseph D. Pistone in Donnie Brasco, author J. M. Barrie in Finding Neverland, and Boston gangster Whitey Bulger in Black Mass. Depp is the third highest-grossing actor worldwide, as films featuring Depp have grossed over US\$3.7 billion at the United States box office and over US\$10 billion worldwide.[3] He has been listed in the 2012 Guinness World Records as the world's highest-paid actor, with earnings of US\$75 million.[4] His most commercially successful films are the Pirates of the Caribbean series, which grossed US\$4.5 billion, the Fantastic Beasts film series, which grossed US\$1.3 billion, Alice in Wonderland, which grossed US\$1 billion, Charlie and the Chocolate Factory, which grossed US\$474 million, and The Tourist, which grossed US\$278 million.[5][6][7]\n" +
                "\n" +
                "Depp had a supporting role in Oliver Stone's 1986 Vietnam War film Platoon and played the title character in the 1990 romantic dark fantasy Edward Scissorhands. He later found box office success in the adventure film Sleepy Hollow (1999), the swashbuckler film series Pirates of the Caribbean (2003–present), the fantasy films Charlie and the Chocolate Factory (2005) and Alice in Wonderland (2010), the animated comedy western Rango (2011) (in which he voiced the title character), and most recently Fantastic Beasts: The Crimes of Grindelwald (2018). Depp has collaborated on nine films with director, producer and friend Tim Burton. Depp was inducted as a Disney Legend in 2015.[8] He has performed in numerous musical groups, including forming the rock supergroup Hollywood Vampires along with Alice Cooper and Joe Perry.")

        popweb.setOnClickListener {
            val url = "https://www.imdb.com/title/tt0325980/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        ranweb.setOnClickListener {
            val url = "https://www.imdb.com/title/tt1192628/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        swenweb.setOnClickListener {
            val url = "https://www.imdb.com/title/tt0408236/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        edweb.setOnClickListener {
            val url = "https://www.imdb.com/title/tt0099487/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        slpweb.setOnClickListener {
            val url = "https://www.imdb.com/title/tt0162661/"
            val  i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        vBak.setOnClickListener {
            Toast.makeText(this , "Not Available",Toast.LENGTH_SHORT).show()
        }
        tvBak.setOnClickListener {
            Toast.makeText(this , "Not Available",Toast.LENGTH_SHORT).show()
        }
        tack.setOnClickListener {
            Toast.makeText(this , "Not Available",Toast.LENGTH_SHORT).show()
        }
    }
}
