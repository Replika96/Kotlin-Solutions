class PhoneNumber(num: String) {
    
    val number: String

    init {
        val digits = num.filter { it.isDigit() }
        
        number = when {
            digits.length == 11 && digits[0] == '1' -> digits.substring(1)
            digits.length == 10 -> digits
            else -> throw IllegalArgumentException("Invalid phone number")
        }.also { validatedNumber ->
            // Проверяем валидность NANP формата
            require(validatedNumber.length == 10) { "Must be 10 digits" }
            
            val areaCode = validatedNumber.substring(0, 3)
            val exchangeCode = validatedNumber.substring(3, 6)
            
            require(areaCode[0] in '2'..'9') { "Area code cannot start with ${areaCode[0]}" }
            require(exchangeCode[0] in '2'..'9') { "Exchange code cannot start with ${exchangeCode[0]}" }
        }
    }
}