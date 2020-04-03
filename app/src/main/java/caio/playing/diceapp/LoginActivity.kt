package caio.playing.diceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val tvCancel: TextView = findViewById<TextView>(R.id.tvCancel)
        val username: TextView = findViewById<TextView>(R.id.edtUsername)
        val password: TextView = findViewById<TextView>(R.id.edtPassword)

        tvCancel.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}