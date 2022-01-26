package com.example.savenetimg

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        save_btn.setOnClickListener {
            val imgUrl = "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fpic.q2d.com%2Fd%2Ffile%2F20201204%2F1607073432773007.png&refer=http%3A%2F%2Fpic.q2d.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1645803668&t=2d147915080680ce96f961899a9bd43e";
            OperatePicUtil.instance.savePicByBm(this, imgUrl, "1.jpg")
        }


    }
}