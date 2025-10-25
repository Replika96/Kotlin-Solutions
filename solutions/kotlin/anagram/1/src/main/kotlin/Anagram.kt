class Anagram(private val letter: String) {

    private val counts = Array(26) { 0 }
    init{
        for(ch in letter.lowercase()){
            if(ch in 'a'..'z'){
                val index = ch - 'a'
                counts[index]++
            }
        }
    }
    
    
    fun match(anagrams: Collection<String>): Set<String> {
        val set = mutableSetOf<String>()
        for(anagram in anagrams){
            val word = anagram.lowercase()
            val count = Array(26) { 0 }
            for(ch in word){
                if(ch in 'a'..'z'){
                    val index = ch-'a'
                    count[index]++
                }
            }
            if (word != letter.lowercase() && counts.contentEquals(count)) {
                set.add(anagram)
            }
        }
        return set
    }
}
