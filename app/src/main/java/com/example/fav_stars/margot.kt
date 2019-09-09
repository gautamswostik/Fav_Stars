package com.example.fav_stars

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_clinteastwood.*
import kotlinx.android.synthetic.main.activity_clinteastwood.tack
import kotlinx.android.synthetic.main.activity_clinteastwood.tvBak
import kotlinx.android.synthetic.main.activity_clinteastwood.vBak
import kotlinx.android.synthetic.main.activity_jacknicholson.*

class margot : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clinteastwood)

        val T = findViewById<TextView>(R.id.CEtxt)
        T.setText("Margot Elise Robbie (/ˈmɑːrɡoʊ ˈrɒbi/ MAR-goh ROB-ee; born 2 July 1990)[1][2][3] is an Australian actress and film producer. She has received nominations for an Academy Award and three BAFTA Awards. In 2017, Time magazine named her as one of the 100 most influential people in the world, and Forbes featured her on its 30 Under 30 list.[4][5]\n" +
                "\n" +
                "Born and raised on a farm in Dalby, Queensland, Robbie studied drama at Somerset College. She began her career in Australian independent films in the late 2000s, before working in the soap opera Neighbours (2008–2011), which earned her two Logie Award nominations. After moving to the United States, she starred in the short-lived ABC drama series Pan Am (2011–2012). In 2013, she had a supporting role in the romantic comedy About Time, and made her breakthrough later that year, by co-starring in Martin Scorsese's biographical black comedy The Wolf of Wall Street. Robbie launched a production company named LuckyChap Entertainment in 2014.\n" +
                "\n" +
                "Robbie's profile continued to grow with leading roles in the romantic drama Focus (2015), as Jane Porter Clayton in the action-adventure film The Legend of Tarzan (2016), and as Harley Quinn in the superhero film Suicide Squad (2016). Robbie received critical acclaim in 2017 for her portrayal of the disgraced figure skater Tonya Harding in the biographical film I, Tonya, which she also produced, receiving a nomination for the Academy Award for Best Actress. Her portrayal of Queen Elizabeth I in Mary Queen of Scots (2018), gained her a nomination for the BAFTA Award for Best Actress in a Supporting Role.")
        WOWweb.setOnClickListener {
            val url = "https://www.imdb.com/title/tt0993846/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        SOSweb.setOnClickListener {
            val url = "https://www.imdb.com/title/tt1386697/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        HOLLYweb.setOnClickListener {
            val url = "https://www.imdb.com/title/tt7131622/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        TERMweb.setOnClickListener {
            val url = "https://www.imdb.com/title/tt4463816/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        MARQweb.setOnClickListener {
            val url = "https://www.imdb.com/title/tt2328900/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        vBak.setOnClickListener {
            val url = "https://twitter.com/margotrobbie"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        tvBak.setOnClickListener {
            val url = "https://www.instagram.com/margotrobbie/"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        tack.setOnClickListener {
            Toast.makeText(this , "Not Available", Toast.LENGTH_SHORT).show()
        }
    }
}
