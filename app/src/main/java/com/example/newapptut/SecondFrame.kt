package com.example.newapptut

import Model.Player
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second_frame.*

class SecondFrame : BaseActivity() {

    var player = Player("","")

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_frame)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
        }
    }

    fun menClick(view: View){
        womenBtn.isChecked = false
        coedBtn.isChecked = false
        player.league = ""
        if (menBtn.isChecked) {
            player.league = "Men"}

    }

    fun womenClick(view: View){
        menBtn.isChecked = false
        coedBtn.isChecked = false
        player.league = ""
        if (womenBtn.isChecked) {
            player.league = "Women"}
    }

    fun coedClick(view: View) {
        menBtn.isChecked = false
        womenBtn.isChecked = false
        player.league = ""
        if (womenBtn.isChecked) {
            player.league = "Co-ed"}

    }


    fun nextActivity(view: View) {
        if (player.league != "") {
            val thirdFrame = Intent(this, SkillActivity::class.java)
            thirdFrame.putExtra(EXTRA_PLAYER, player)
            startActivity(thirdFrame)
        } else {
            Toast.makeText(this, "Please select your League...", Toast.LENGTH_SHORT).show()
        }
    }

}