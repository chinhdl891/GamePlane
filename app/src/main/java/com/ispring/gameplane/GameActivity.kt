package com.ispring.gameplane

import android.app.Activity
import android.os.Bundle
import android.view.View
import com.ispring.gameplane.game.GameView

class GameActivity : Activity() {
    private var gameView: GameView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        gameView = findViewById<View>(R.id.gameView) as GameView
        //0:combatAircraft
        //1:explosion
        //2:yellowBullet
        //3:blueBullet
        //4:smallEnemyPlane
        //5:middleEnemyPlane
        //6:bigEnemyPlane
        //7:bombAward
        //8:bulletAward
        //9:pause1
        //10:pause2
        //11:bomb
        val bitmapIds = intArrayOf(
            R.drawable.plane,
            R.drawable.explosion,
            R.drawable.yellow_bullet,
            R.drawable.blue_bullet,
            R.drawable.small,
            R.drawable.middle,
            R.drawable.big,
            R.drawable.bomb_award,
            R.drawable.bullet_award,
            R.drawable.pause1,
            R.drawable.pause2,
            R.drawable.bomb
        )
        gameView!!.start(bitmapIds)
    }

    override fun onPause() {
        super.onPause()
        if (gameView != null) {
            gameView!!.pause()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        if (gameView != null) {
            gameView!!.destroy()
        }
        gameView = null
    }
}