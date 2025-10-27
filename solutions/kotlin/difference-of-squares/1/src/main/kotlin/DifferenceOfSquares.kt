class Squares(private val number: Int) {
    
    private val sum: Int = (1..number).sum()
    
    fun sumOfSquares(): Int = (1..number).sumOf { it * it } 

    fun squareOfSum(): Int = sum * sum

    fun difference(): Int = squareOfSum() - sumOfSquares()
    
}
