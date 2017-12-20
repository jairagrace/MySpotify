package jaira.cabarrubias.com.spotify.user.myspotify

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by user on 18/12/2017.
 */
class SongFragment : Fragment() {
    private var songs: List<String>? =  null
    private var albums: List<String>?  = null
    private var PARTS_SONG =  "song_list"
    private var PARTS_ALBUM= "album"


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        if (savedInstanceState != null) {
            songs = savedInstanceState.getStringArrayList(PARTS_SONG)
            albums = savedInstanceState.getStringArrayList(PARTS_ALBUM)
        }
        val rootView = inflater?.inflate(R.layout.fragmentsong, container, false)
        return rootView
    }
}