package droid.app.demolibrary

import android.content.Context
import android.net.ConnectivityManager
import android.widget.Toast


class ToastMessage {
    fun showToast(c: Context?, message: String?) {

        Toast.makeText(c, message, Toast.LENGTH_LONG).show()

    }

    public fun isNetworkAvailable(context: Context): Boolean {
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetworkInfo = connectivityManager
                .activeNetworkInfo
        return activeNetworkInfo != null && activeNetworkInfo.isConnected
    }
}