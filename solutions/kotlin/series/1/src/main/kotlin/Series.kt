object Series {
    fun slices(n: Int, s: String): List<List<Int>> {
        require(n > 0) { "Slice size must be positive" }
        require(n <= s.length) { "Slice size cannot be greater than string length" }
        
        return s.windowed(n) { window ->
            window.map { it.digitToInt() }
        }
    }
}