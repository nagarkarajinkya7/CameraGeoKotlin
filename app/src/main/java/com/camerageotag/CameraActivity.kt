package com.camerageotag

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.widget.Button
import android.widget.TextView


class CameraActivity : AppCompatActivity() {

    private var button: Button? = null
    private var textView: TextView? = null
    private var textureView: TextureView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)

        initViews()
    }

    private fun initViews() {
        button = findViewById(R.id.getpicture) as Button
        textView = findViewById(R.id.textView) as TextView
        textureView = findViewById(R.id.textureview) as TextureView
    }
}
