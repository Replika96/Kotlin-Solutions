class RotationalCipher(val rotation: Int) {
    
    fun encode(text: String): String {
        if (rotation == 0) return text
        
        return text.map { char ->
            when {
                char.isUpperCase() -> {
                    val base = 'A'.code
                    val shifted = (char.code - base + rotation) % 26
                    (base + shifted).toChar()
                }
                char.isLowerCase() -> {
                    val base = 'a'.code
                    val shifted = (char.code - base + rotation) % 26
                    (base + shifted).toChar()
                }
                else -> char
            }
        }.joinToString("")
    }
}