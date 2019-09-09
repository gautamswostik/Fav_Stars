package com.example.fav_stars

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_jacknicholson.*
import kotlinx.android.synthetic.main.activity_jacknicholson.tack
import kotlinx.android.synthetic.main.activity_jacknicholson.tvBak
import kotlinx.android.synthetic.main.activity_jacknicholson.vBak
import kotlinx.android.synthetic.main.activity_johnneydeep.*

class robertdowney : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jacknicholson)

        val T = findViewById<TextView>(R.id.JNtxt)
        T.setText("Robert John Downey Jr. (born April 4, 1965)[1] is an American actor. His career has included critical and popular success in his youth, followed by a period of substance abuse and legal difficulties, and a resurgence of commercial success in middle age. For three consecutive years from 2012 to 2015, Downey topped the Forbes list of Hollywood's highest-paid actors, and in 2008, Time magazine named him one of the 100 most influential people in the world.[2][3] His films have grossed over \$5.8 billion in North America and over \$14.4 billion worldwide, making Downey the second-highest-grossing box-office star of all time both domestically and worldwide.[4][5]\n" +
                "\n" +
                "Making his acting debut at the age of five, appearing in his father Robert Downey Sr.'s film Pound (1970), Downey appeared in roles associated with the Brat Pack, such as the teen sci-fi comedy Weird Science (1985) and the drama Less Than Zero (1987). He starred as the title character in the 1992 film Chaplin, for which he earned a nomination for the Academy Award for Best Actor and won the BAFTA Award for Best Actor in a Leading Role. After being released in 2000 from the California Substance Abuse Treatment Facility and State Prison where he was incarcerated on drug charges, Downey joined the cast of the TV series Ally McBeal playing Calista Flockhart's love interest. The role earned him a Golden Globe Award. His character was terminated when Downey was fired after two drug arrests in late 2000 and early 2001. After his last stay in a court-ordered drug treatment program, Downey achieved sobriety.[citation needed]\n" +
                "\n" +
                "Initially, bond completion companies would not insure Downey for roles in feature films. Mel Gibson, who had been a close friend to Downey since both had co-starred in Air America, paid the insurance bond for the 2003 film The Singing Detective.[6] Downey's performance in that film paved the way for his return to feature films including a role in the black comedy crime film Kiss Kiss Bang Bang (2005), the mystery thriller Zodiac (2007), and the satirical action comedy Tropic Thunder (2008); for the latter he was nominated for an Academy Award for Best Supporting Actor. Downey went on to star as the Marvel Comics superhero Iron Man in ten films within the Marvel Cinematic Universe, beginning with Iron Man (2008) and concluding with Avengers: Endgame (2019). He has also played the title character in Guy Ritchie's Sherlock Holmes (2009), which earned him his second Golden Globe win, and its sequel (2011).\n" +
                "\n" +
                "\n")

        IRONweb.setOnClickListener {
            val url = "https://www.imdb.com/title/tt0371746/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        TAVGweb.setOnClickListener {
            val url = "https://www.imdb.com/title/tt0848228/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        TRPTweb.setOnClickListener {
            val url = "https://www.imdb.com/title/tt0942385/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        CHAPweb.setOnClickListener {
            val url = "https://www.imdb.com/title/tt0103939/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        SHOMweb.setOnClickListener {
            val url = "https://www.imdb.com/title/tt0988045/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        vBak.setOnClickListener {
            val url = "https://twitter.com/robertdowneyjr"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        tvBak.setOnClickListener {
            val url = "https://www.instagram.com/robertdowneyjr/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        tack.setOnClickListener {
            Toast.makeText(this , "Not Available", Toast.LENGTH_SHORT).show()
        }
    }
}
