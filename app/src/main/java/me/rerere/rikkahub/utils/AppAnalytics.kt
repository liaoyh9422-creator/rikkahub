package me.rerere.rikkahub.utils

import android.util.Log

private const val TAG = "AppAnalytics"

class AppAnalytics {
    fun logEvent(name: String) {
        Log.d(TAG, "event=$name")
    }
}
