object RunLengthEncoding {

    fun encode(input: String): String {
        if(input.isBlank()) return ""
        val result = StringBuilder()
        var currentChar = input[0]
        var count = 1
        for (i in 1 until input.length) {
            if (input[i] == currentChar) {
                count++
            } else {
                if (count > 1) result.append(count)
                result.append(currentChar)
                currentChar = input[i]
                count = 1
            }
        }
        if (count > 1) result.append(count)
        result.append(currentChar)
        
        return result.toString()
    }

    fun decode(input: String): String {
        if(input.isBlank()) return ""
        val result = StringBuilder()
        var count = StringBuilder()
        for(char in input){
            when{
                char.isDigit() -> count.append(char)
                else -> {
                    val repeatCount = if (count.isNotEmpty()) count.toString().toInt() else 1
                    result.append(char.toString().repeat(repeatCount))
                    count.clear()
                }
            }
        }
        return result.toString()
    }
}
