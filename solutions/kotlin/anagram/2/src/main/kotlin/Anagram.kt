class Anagram(private val word: String) {

    private val normalized = word.lowercase()
    private val signature = normalized.toCharArray().sorted()

    fun match(candidates: Collection<String>): Set<String> {
        return candidates.filter { candidate ->
            val test = candidate.lowercase()
            test != normalized && test.toCharArray().sorted() == signature
        }.toSet()
    }
}
