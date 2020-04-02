package caio.playing.diceapp

import android.widget.TextView

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
