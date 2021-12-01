package com.furkankurt.kotlincountdown

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.furkankurt.kotlincountdown.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //Abstract-Inheritance

       object :CountDownTimer(10000,1000) {
           override fun onTick(millisUntilFinished: Long) {
               //Her bir periyotta(Interval) da ne olacak(1000 saniyede bir ne olacak)
               binding.textview.text="Left: ${millisUntilFinished/1000}"
           }

           override fun onFinish() {
              //İşlem bitince ne olacak
               binding.textview.text="Left: 0"
           }

       }.start()
    }

}