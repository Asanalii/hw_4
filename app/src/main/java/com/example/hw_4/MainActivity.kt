package com.example.hw_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw_4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val stationDialog1 = StationBottomSheet(true)
    private val stationDialog2 = StationBottomSheet(true,"ChargePoint Station 2", "STREET SRNA 74", "Amesterdam, Netherlands","2")
    private val stationDialog3 = StationBottomSheet(true,"ChargePoint Station 3", "STREET ADAS 123 123", "Amesterdam, Netherlands","5")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.station1.setOnClickListener {
            stationDialog1.show(supportFragmentManager, "StationBottomSheet")
        }

        binding.station2.setOnClickListener {
            stationDialog2.show(supportFragmentManager, "StationBottomSheet")
        }

        binding.station3.setOnClickListener {
            stationDialog3.show(supportFragmentManager, "StationBottomSheet")
        }
    }
}