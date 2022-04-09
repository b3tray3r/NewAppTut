package com.example.newapptut

import Model.Player
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_final.*

class FinalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchText.text = "Looking for ${player!!.league} ${player.skill} league near you ..."
    }




}