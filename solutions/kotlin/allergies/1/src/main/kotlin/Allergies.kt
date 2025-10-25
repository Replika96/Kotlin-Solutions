class Allergies(private val score: Int) {

    fun getList(): List<Allergen> {
        return Allergen.values().filter { allergen ->
            isAllergicTo(allergen)
        }
    }

    fun isAllergicTo(allergen: Allergen): Boolean {
        return score and allergen.score != 0
    }
}
