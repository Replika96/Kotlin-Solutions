object Acronym {
    fun generate(phrase: String) : String {
        var acronym = StringBuilder()
        val words = phrase.split("[^\\p{L}\\p{N}']+".toRegex())
        for(word in words){
            acronym.append(word.first())
        }
        return acronym.toString().uppercase()
    }
}
