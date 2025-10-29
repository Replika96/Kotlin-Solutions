object Flattener {
    fun flatten(source: Collection<Any?>): List<Any> {
        val result = mutableListOf<Any>()
        
        fun flattenHelper(element: Any?) {
            when (element) {
                is Collection<*> -> element.forEach { flattenHelper(it) }
                else -> if (element != null) result.add(element)
            }
        }
        
        source.forEach { flattenHelper(it) }
        return result
    }
}