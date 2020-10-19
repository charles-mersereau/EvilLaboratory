package com.waysuninc.evillaboratory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val LOG_TAG = "MainActivity:"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        codePlayground()
    }

    fun codePlayground() {

        val list = listOf<Int>(1,2,3,4)

        val newList = list.map {
            it * 2
        }

        val four = newList.first { it == 4 }

        for (num in list) Log.d(LOG_TAG, "codePlayground: $num")

        for (num in newList) Log.d(LOG_TAG, "codePlayground: $num")

        Log.d(LOG_TAG, "codePlayground: $four")

    }
}