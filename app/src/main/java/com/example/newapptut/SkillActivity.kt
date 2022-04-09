package com.example.newapptut

import Model.Player
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second_frame.*
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)!!
    }

    fun proCLick(view: View) {
        beginnerBtn.isChecked = false
        player.skill = ""
        if (proBtn.isChecked) {
            player.skill = "Baller"}
    }

    fun beginnerClick(view: View) {
        proBtn.isChecked = false
        player.skill = ""
        if (beginnerBtn.isChecked) {
            player.skill = "Beginner"}
    }
    fun finishClick(view: View) {
        if (player.skill != "") {
            val finishActivity = Intent(this, FinalActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please, select your skill level...", Toast.LENGTH_SHORT).show()
        }
    }

}