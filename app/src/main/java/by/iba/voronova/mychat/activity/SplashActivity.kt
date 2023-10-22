package by.iba.voronova.mychat.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import by.iba.voronova.mychat.R
import com.google.firebase.auth.FirebaseAuth

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }

    override fun onResume() {
        super.onResume()
        FirebaseAuth.getInstance().currentUser
    }
}
