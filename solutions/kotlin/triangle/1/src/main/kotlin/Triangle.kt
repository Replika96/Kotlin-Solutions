class Triangle<out T : Number>(val a: T, val b: T, val c: T) {

    private val sideA: Double
    private val sideB: Double
    private val sideC: Double
    
    init{
        sideA = a.toDouble()
        sideB = b.toDouble()
        sideC = c.toDouble()
        if(sideA<=0 || sideB <=0 || sideC<=0) {
            throw IllegalArgumentException("all sides have to be of length > 0")
        }
        if (sideA + sideB < sideC || sideA + sideC < sideB || sideB + sideC < sideA) {
            throw IllegalArgumentException("Not a valid triangle")
        }
    }
    
    
    val isEquilateral: Boolean
        get() = sideA==sideB && sideB==sideC
    val isIsosceles: Boolean 
        get() = sideA==sideB || sideB==sideC || sideA==sideC
    val isScalene: Boolean
        get() = !isEquilateral && !isIsosceles
}
