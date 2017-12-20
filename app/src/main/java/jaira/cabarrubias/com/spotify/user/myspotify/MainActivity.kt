package jaira.cabarrubias.com.spotify.user.myspotify

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val song= findViewById<RecyclerView>(R.id.recyclerView1)
        song.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val users = ArrayList<Songs>()

        users.add(Songs("Titibo-tibo", "Moira Dela Torre", "• Himig Handog 2017 "))
        users.add(Songs("Havana", "Camila Cabello , Young Thug", "• Havana"))
        users.add(Songs("Young Dumb & Broke", "Khalid", "American Teen"))
        users.add(Songs("What Lovers Do (feat. SZA)", "Maroon 5, SZA", "• Red Pill Blues(Deluxe)"))
        users.add(Songs("Perfect", "Ed Sheeran", "• Deluxe"))
        users.add(Songs("Arms Open", "The Script", " • Human Clay"))
        users.add(Songs("Look At Me Now", "Charlie Puth", " • Alien Boy"))
        users.add(Songs("Where My Love Goes", "Lawson", " • Perspective"))
        users.add(Songs("If You Could See Me Now", "The Script", " • 3"))
        users.add(Songs("Back To You", "Louis Tomlinson", " • Louis Tomlinson"))
        users.add(Songs("Sorry Not Sorry", "Demi Lovato", " • Tell Me You Love Me"))
        users.add(Songs("Too Good At Goodbyes", "Sam Smith", " • The Thrill of It All"))

        var adapter = SongListAdapter(users)
        song.adapter = adapter

    }
}
