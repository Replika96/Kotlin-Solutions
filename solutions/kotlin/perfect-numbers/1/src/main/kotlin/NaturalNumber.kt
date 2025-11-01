
enum class Classification {
    DEFICIENT, PERFECT, ABUNDANT
}

fun classify(naturalNumber: Int): Classification {
    require(naturalNumber>0) { "Must be positive"}
    
    if (naturalNumber == 1) return Classification.DEFICIENT
    
    var sum = 0

    for (i in 1..Math.sqrt(naturalNumber.toDouble()).toInt()) {
        if (naturalNumber % i == 0) {
            sum+=i
            if (i != naturalNumber / i && i != 1) {  
                sum+=naturalNumber / i
            }
        }
    }
    return when{
        sum > naturalNumber ->  Classification.ABUNDANT
        sum < naturalNumber ->  Classification.DEFICIENT
        else ->  Classification.PERFECT
    }
    
}
