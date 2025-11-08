object Raindrops {

    fun convert(n: Int): String {
        val rain = StringBuilder()
        if( n % 3 == 0) rain.append("Pling")
        if( n % 5 == 0) rain.append("Plang")
        if( n % 7 == 0) rain.append("Plong")
        if(rain.toString().isBlank()) return n.toString()
        return rain.toString()
    }
}
