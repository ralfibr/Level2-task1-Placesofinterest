package com.example.placesofinterest
/**
 * @author Raeef Ibrahim
 */
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.placesofinterest.Data.Place
import kotlinx.android.synthetic.main.activity_place.*
class MainActivity : AppCompatActivity() {
    // array places
    private val places = arrayListOf<Place>()
    // set array in adapter
    private val placeAdapter = PlaceAdapter(places)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_place)
        initViews()
    }
    private fun initViews() {
        // Set recycle view layout manger
        rvPlaces.layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
        // set the place adapter in rv places
        rvPlaces.adapter = placeAdapter
        // for loop to get all images
        for (i in Place.PLACE_NAMES.indices) {
            places.add(
                Place(
                    Place.PLACE_NAMES[i],
                    Place.PLACE_RES_DRAWABLE_IDS[i]
                )
            )
        }
        placeAdapter.notifyDataSetChanged()
    }
}
