package com.orhanucar.historicalplacesbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.orhanucar.historicalplacesbook.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = getIntent()
        val selectedHistoricalPlaces = intent.getSerializableExtra("historicalPlaces") as HistoricalPlaces

        binding.nameText.text = selectedHistoricalPlaces.name
        binding.countryText.text = selectedHistoricalPlaces.country
        binding.imageView.setImageResource(selectedHistoricalPlaces.image)

    }
}