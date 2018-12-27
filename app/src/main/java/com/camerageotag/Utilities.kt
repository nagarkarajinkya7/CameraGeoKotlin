package com.camerageotag

import android.content.Context
import android.content.pm.PackageManager

class Utilities {

    companion object {
        fun checkCameraHardware(mContext: Context): Boolean {

            return mContext.packageManager.hasSystemFeature(PackageManager.FEATURE_CAMERA)
        }
    }
}