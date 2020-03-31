package caio.playing.diceapp

import android.widget.TextView

fun showDiceResult(textView: TextView?, diceValue: Int) : TextView? {
    textView?.text = ""
    textView?.append(diceValue.toString())
    return textView
}