fun translate(rna: String?): List<String> {
    if(rna==null ||rna.isEmpty()) return emptyList()
    val codonToAminoAcid = mapOf(
    "AUG" to "Methionine",
    "UUU" to "Phenylalanine",
    "UUC" to "Phenylalanine",
    "UUA" to "Leucine",
    "UUG" to "Leucine",
    "UCU" to "Serine",
    "UCC" to "Serine",
    "UCA" to "Serine",
    "UCG" to "Serine",
    "UAU" to "Tyrosine",
    "UAC" to "Tyrosine",
    "UGU" to "Cysteine",
    "UGC" to "Cysteine",
    "UGG" to "Tryptophan",
    "UAA" to "STOP",
    "UAG" to "STOP",
    "UGA" to "STOP"
    )   
    val proteins = mutableListOf<String>()
    
    for (codon in rna.chunked(3)){
        val aminoAcid = codonToAminoAcid[codon] ?: throw IllegalArgumentException("Invalid codon")
        
        if (aminoAcid == "STOP") {
            break
        }
        
        proteins.add(aminoAcid)
    }
    
    return proteins
}
