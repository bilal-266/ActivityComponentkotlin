package com.example.activitycomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.d("Start","Start Method");
    }

    override fun onResume() {
        super.onResume()
        Log.d("Resume","Resume Method");
    }

    override fun onPause() {
        super.onPause()
        Log.d("Pause","Pause Method");
    }

    override fun onStop() {
        super.onStop()
        Log.d("Stop","Stop Method");
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Restart","Restart Method");
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Destroy","Destroy Method");
    }
}