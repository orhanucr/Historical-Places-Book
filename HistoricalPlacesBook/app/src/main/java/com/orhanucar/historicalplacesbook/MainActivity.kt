package com.orhanucar.historicalplacesbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.orhanucar.historicalplacesbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var historicalPlacesList : ArrayList<HistoricalPlaces>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        historicalPlacesList = ArrayList<HistoricalPlaces>()

        val pisa = HistoricalPlaces("Pisa Tower", "Italy",R.drawable.pisa)
        val eiffel = HistoricalPlaces("Eiffel Tower","France",R.drawable.eiffel)
        val collosseum = HistoricalPlaces("Colosseum","Italy",R.drawable.colosseum)

        historicalPlacesList.add(pisa)
        historicalPlacesList.add(eiffel)
        historicalPlacesList.add(collosseum)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val historicalAdapter = HistoricalAdapter(historicalPlacesList)
        binding.recyclerView.adapter = historicalAdapter

    }
}