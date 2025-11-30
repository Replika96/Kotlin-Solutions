class RotationalCipher(val rot: Int) {
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    val alphabetUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    fun encode(text: String): String {
        if(rot == 0) return text
        val result = StringBuilder()
        
        for(char in text){
            when{
                char.isUpperCase() -> {
                    var index = alphabetUpper.indexOf(char) + rot
                    if(index>=26){
                        index = index - 26
                    }
                    result.append(alphabetUpper[index])
                }
                char.isLowerCase() -> {
                    var index = alphabet.indexOf(char) + rot
                    if(index>=26){
                        index = index - 26
                    }
                    result.append(alphabet[index])
                }
                else -> result.append(char)
            }   
        }
        return result.toString()
    }
}
