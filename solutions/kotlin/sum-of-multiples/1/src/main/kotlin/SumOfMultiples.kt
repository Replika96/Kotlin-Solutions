object SumOfMultiples {

    fun sum(factors: Set<Int>, limit: Int): Int {
        val multiples  = mutableSetOf<Int>()
        factors.forEach{ factor ->
            if(factor>0){
                var multiple = factor
                while (multiple < limit) {
                    multiples.add(multiple)
                    multiple += factor
                }
            }
        }
        return multiples.sum()
    }
}
