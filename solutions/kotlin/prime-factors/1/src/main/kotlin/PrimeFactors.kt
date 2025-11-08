object PrimeFactorCalculator {

    fun primeFactors(int: Int): List<Int> {
        val factors = mutableListOf<Int>()
        var number = int
        var divisor = 2
        
        while (number > 1) {
            while (number % divisor == 0) {
                factors.add(divisor)
                number /= divisor
            }
            divisor++
        }
        return factors
    }

    fun primeFactors(long: Long): List<Long> {
        val factors = mutableListOf<Long>()
        var number = long  
        var divisor = 2L   
        
        while (number > 1) {
            while (number % divisor == 0L) {
                factors.add(divisor)
                number /= divisor
            }
            divisor++
        }
        return factors
    }
}