package by.iba.voronova.mychat.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import by.iba.voronova.mychat.R
import com.google.firebase.auth.FirebaseAuth

class SplashActivity : AppCompatActivity() {
    //lateinit var result
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }
fun startAuth(){
    val intent= Intent(applicationContext, AuthActivity::class.java)
    val result= registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        if(it.resultCode== RESULT_OK){
            //todo: startChat
        } else {
            //todo: finish
        }
            }
    result.launch(intent)
}
    override fun onResume() {
        super.onResume()
        FirebaseAuth.getInstance().currentUser
        if (FirebaseAuth.getInstance().currentUser == null) {
           startAuth()
        } else {//TODO: chatActivity

        }
    }
}
