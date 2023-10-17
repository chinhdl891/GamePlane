package com.ispring.gameplane

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View

class MainActivity : Activity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClick(v: View) {
        val viewId = v.id
        if (viewId == R.id.btnGame) {
            startGame()
        }
    }

    fun startGame() {
        val intent = Intent(this, GameActivity::class.java)
        startActivity(intent)
    }
}