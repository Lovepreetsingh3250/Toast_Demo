package droid.app.demolibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class LoginActivity : AppCompatActivity() {

    lateinit var tvEmail:TextView
    lateinit var tvPass:TextView
    lateinit var btnSubmit:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        tvEmail = findViewById(R.id.tv_email)
        tvPass = findViewById(R.id.tv_pass)
        btnSubmit = findViewById(R.id.btnSubmit)

        btnSubmit.setOnClickListener{
            ToastMessage().showToast(applicationContext,"Submitted")
        }

    }
}