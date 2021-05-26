package droid.app.demolibrary

import android.content.Context
import android.net.ConnectivityManager
import android.widget.RelativeLayout
import android.widget.Toast
import com.ajithvgiri.canvaslibrary.CanvasView

class ToastMessage {
    lateinit var canvasView : CanvasView
    fun showToast(c: Context?, message: String?) {

        Toast.makeText(c, message, Toast.LENGTH_LONG).show()

    }

    public fun isNetworkAvailable(context: Context): Boolean {
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetworkInfo = connectivityManager
                .activeNetworkInfo
        return activeNetworkInfo != null && activeNetworkInfo.isConnected
    }

    fun addCanvas(context:Context,parentView: RelativeLayout){
        //val canvasView = CanvasView(context)
        canvasView = CanvasView(context)
        parentView.addView(canvasView)
    }

    fun clearCanvas(context: Context){
        //val canvasView = CanvasView(context)
        canvasView = CanvasView(context)
        canvasView.clearCanvas()
    }

}