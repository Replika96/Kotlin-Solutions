object ScrabbleScore {
    private val scoreCache = mutableMapOf<Char, Int>()
    
    fun scoreLetter(c: Char): Int {
        return scoreCache.getOrPut(c) {
            when (c.uppercaseChar()) {
                in "AEIOULNRST" -> 1
                in "DG" -> 2
                in "BCMP" -> 3
                in "FHVWY" -> 4
                'K' -> 5
                in "JX" -> 8
                in "QZ" -> 10
                else -> 0
            }
        }
    }

    fun scoreWord(word: String): Int = word.sumOf { scoreLetter(it) }
}