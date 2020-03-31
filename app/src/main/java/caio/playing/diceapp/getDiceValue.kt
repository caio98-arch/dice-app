package caio.playing.diceapp

fun getDiceValue(diceSize: Int): Int {
    return (1..diceSize).random()
}
