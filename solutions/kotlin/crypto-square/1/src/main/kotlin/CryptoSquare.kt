object CryptoSquare {

    fun ciphertext(plaintext: String): String {
        val cleanText = plaintext.lowercase().filter { it.isLetterOrDigit() }
        if (cleanText.isEmpty()) return ""
        
        val len = cleanText.length
        val col = Math.ceil(Math.sqrt(len.toDouble())).toInt()
        val row = if (col * (col - 1) >= len) col - 1 else col
        
        val result = StringBuilder()
            
        for (c in 0 until col) {
            for (r in 0 until row) {
                val pos = r * col + c
                result.append(if (pos < len) cleanText[pos] else ' ')
            }
        }
        
        return result.chunked(row).joinToString(" ")
    }
}