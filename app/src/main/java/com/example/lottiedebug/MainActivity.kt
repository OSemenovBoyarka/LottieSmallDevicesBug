package com.example.lottiedebug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieDrawable
import android.os.Looper.loop
import com.airbnb.lottie.LottieComposition
import com.airbnb.lottie.LottieComposition.Factory.fromAssetFileName
import com.airbnb.lottie.LottieCompositionFactory
import com.airbnb.lottie.LottieDrawable.INFINITE
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val drawable = LottieDrawable()

    LottieCompositionFactory.fromUrl(this, "https://assets6.lottiefiles.com/packages/lf20_VPZwgg.json").addListener {
      drawable.composition = it
      ivPullArrowDrawable.setImageDrawable(drawable)

      drawable.repeatCount = INFINITE
      drawable.playAnimation()
    }


  }
}
