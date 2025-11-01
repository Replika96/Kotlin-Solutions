object Pangram {
    fun isPangram(input: String): Boolean {
        return ('a'..'z').all { letter -> 
            letter in input.lowercase() 
        }
    }
}