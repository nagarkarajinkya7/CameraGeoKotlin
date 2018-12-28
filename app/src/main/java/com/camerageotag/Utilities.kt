package com.camerageotag

import android.content.Context
import android.content.pm.PackageManager
import android.location.LocationManager
import android.net.ConnectivityManager
import android.net.NetworkInfo
import java.lang.Exception

class Utilities {

    companion object {

        fun checkCameraHardware(mContext: Context): Boolean {
            return mContext.packageManager.hasSystemFeature(PackageManager.FEATURE_CAMERA)
        }

        fun checkLocationServices(mContext: Context) : Boolean {

            var locationManager: LocationManager? = null
            var gpsEnabled = false
            var networkEnabled = false

            if (locationManager == null) {
                locationManager = mContext.getSystemService(Context.LOCATION_SERVICE) as LocationManager
            }

            try {
                gpsEnabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)
                networkEnabled = locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)
            } catch (e: Exception) {
                e.printStackTrace()
            }

            return gpsEnabled || networkEnabled
        }

        fun isInternetConnectionActive(mContext: Context): Boolean {
                var mConnectivityManager: ConnectivityManager? = null

                if (mConnectivityManager == null) {
                    mConnectivityManager =
                            mContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
                }

                var activeNetworkInfo: NetworkInfo? = null
                if (activeNetworkInfo == null) {
                    activeNetworkInfo = mConnectivityManager.activeNetworkInfo
                }
                return activeNetworkInfo!!.isConnected
        }
    }

}