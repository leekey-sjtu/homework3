package com.bytedance.homework3

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import javax.xml.datatype.DatatypeConstants.DURATION

class Bilibili : AppCompatActivity(), View.OnClickListener {
    private var buttonView:  Button? = null
    private var likeView:  ImageView? = null
    private var coinView:  ImageView? = null
    private var favoriteView:  ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bilibili)
        buttonView = findViewById(R.id.home_page_btn)
        buttonView!!.setOnClickListener(this)
        likeView = findViewById(R.id.like_image)
        likeView!!.setOnClickListener(this)
        coinView = findViewById(R.id.coin_image)
        coinView!!.setOnClickListener(this)
        favoriteView = findViewById(R.id.favorite_image)
        favoriteView!!.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.like_image -> {
                var loadAnimation: Animation = AnimationUtils.loadAnimation(this, R.anim.like_step_1)
                likeView!!.startAnimation(loadAnimation)
//                loadAnimation = AnimationUtils.loadAnimation(this, R.anim.like_step_2)
//                likeView!!.startAnimation(loadAnimation)
//                loadAnimation = AnimationUtils.loadAnimation(this, R.anim.like_step_3)
//                likeView!!.startAnimation(loadAnimation)
            }
            R.id.coin_image -> {
                val loadAnimation: Animation = AnimationUtils.loadAnimation(this, R.anim.like_step_1)
                coinView!!.startAnimation(loadAnimation)
            }
            R.id.favorite_image -> {
                val loadAnimation: Animation = AnimationUtils.loadAnimation(this, R.anim.like_step_1)
                favoriteView!!.startAnimation(loadAnimation)
            }
            R.id.home_page_btn -> {
                startActivity(Intent(this, MainActivity().javaClass))
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            }
        }
    }
}