package caio.playing.diceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton: Button = findViewById<Button>(R.id.btnLogin)

        val rollButtonD4: Button = findViewById<Button>(R.id.roll_d4)
        val rollButtonD6: Button = findViewById<Button>(R.id.roll_d6)
        val rollButtonD8: Button = findViewById<Button>(R.id.roll_d8)
        val rollButtonD10: Button = findViewById<Button>(R.id.roll_d10)
        val rollButtonD12: Button = findViewById<Button>(R.id.roll_d12)
        val rollButtonD20: Button = findViewById<Button>(R.id.roll_d20)

        textView = findViewById<TextView>(R.id.tView)

        rollButtonD4.setOnClickListener {
            showDiceResult(textView, getDiceValue(4))
        }

        rollButtonD6.setOnClickListener {
            showDiceResult(textView, getDiceValue(6))
        }

        rollButtonD8.setOnClickListener {
            showDiceResult(textView, getDiceValue(8))
        }

        rollButtonD10.setOnClickListener {
            showDiceResult(textView, getDiceValue(10))
        }

        rollButtonD12.setOnClickListener {
            showDiceResult(textView, getDiceValue(12))
        }

        rollButtonD20.setOnClickListener {
            showDiceResult(textView, getDiceValue(20))
        }

        loginButton.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }

    fun showDiceResult(textView: TextView?, diceValue: Int) : TextView? {
        cleanView(textView)
        appendIntView(textView, diceValue)
        return textView
    }

    fun cleanView(textView: TextView?) : TextView? {
        textView?.text = ""
        return textView
    }

    fun appendIntView (textView: TextView?, value: Int) : TextView? {
        textView?.append(value.toString())
        return textView
    }

    fun getDiceValue(diceSize: Int): Int {
        return (1..diceSize).random()
    }
}
