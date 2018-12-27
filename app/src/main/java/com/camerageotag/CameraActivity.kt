package com.camerageotag

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.TextureView
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class CameraActivity : AppCompatActivity() {

    private  var TAG: String = "CameraActivity"

    private var button: Button? = null
    private var textView: TextView? = null
    private var textureView: TextureView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)

        Log.v(TAG,"onCreate")
        if(!Utilities.checkCameraHardware(this)){
            Toast.makeText(this, "Device is not compatible with this application", Toast.LENGTH_LONG).show()
            finish()
        }

        initViews()
    }

    override fun onResume() {
        super.onResume()
    }


    private fun initViews() {
        button = findViewById(R.id.getpicture) as Button
        textView = findViewById(R.id.textView) as TextView
        textureView = findViewById(R.id.textureview) as TextureView
    }
}
