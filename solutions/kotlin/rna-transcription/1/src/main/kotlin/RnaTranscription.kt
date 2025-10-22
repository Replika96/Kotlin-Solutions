fun transcribeToRna(dna: String): String{
    val dnaToRna = mapOf(
        'G' to 'C',
        'C' to 'G', 
        'T' to 'A',
        'A' to 'U'
    )
    
    return dna.map { nucleotide ->
        dnaToRna[nucleotide] ?: throw IllegalArgumentException("Invalid nucleotide: $nucleotide")
    }.joinToString("")
}
