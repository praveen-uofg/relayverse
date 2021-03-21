package com.example.socialracing

import android.content.Intent
import android.os.Bundle
import android.view.HapticFeedbackConstants
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.internal.ContextUtils.getActivity
import java.util.*


class RaceTurnActivity : AppCompatActivity() {

    private var position = -1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_race_turn)
        window.decorView.rootView.performHapticFeedback(HapticFeedbackConstants.LONG_PRESS)

        val imageArray = intArrayOf(
            R.drawable.your_turn_2,
            R.drawable.your_turn_3
        )

        val myImageView: ImageView = findViewById<ImageView>(R.id.imageView)

        val mTimer = Timer()
        mTimer.schedule(object : TimerTask() {
            override fun run() {
                // As timer is not a Main/UI thread need to do all UI task on runOnUiThread
               runOnUiThread(Runnable { // increase your position so new image will show
                    position++
                    // check whether position increased to length then set it to 0
                    // so it will show images in circuler
                    if (position < imageArray.size) {
                        // Set Image
                        myImageView.setImageResource(imageArray[position])
                        myImageView.performHapticFeedback(HapticFeedbackConstants.LONG_PRESS)
                    } else if (position >= imageArray.size) {
                        //TODO: Start complete activity
                        val intent = Intent(this@RaceTurnActivity, CompleteActivity::class.java)
                        startActivity(intent)
                    }
                })
            }
        }, 0, 30000)
    }
}