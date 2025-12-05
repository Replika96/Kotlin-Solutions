class SpaceAge(val seconds: Long) {
    
    private val EARTH_YEAR_SECONDS = 31557600.0
    
    private val MERCURY_ORBITAL = 0.2408467
    private val VENUS_ORBITAL = 0.61519726
    private val MARS_ORBITAL = 1.8808158
    private val JUPITER_ORBITAL = 11.862615
    private val SATURN_ORBITAL = 29.447498
    private val URANUS_ORBITAL = 84.016846
    private val NEPTUNE_ORBITAL = 164.79132
    
    private fun toEarthYears(): Double = seconds / EARTH_YEAR_SECONDS
    
    fun onEarth(): Double = toEarthYears()
    fun onMercury(): Double = toEarthYears() / MERCURY_ORBITAL
    fun onVenus(): Double = toEarthYears() / VENUS_ORBITAL
    fun onMars(): Double = toEarthYears() / MARS_ORBITAL
    fun onJupiter(): Double = toEarthYears() / JUPITER_ORBITAL
    fun onSaturn(): Double = toEarthYears() / SATURN_ORBITAL
    fun onUranus(): Double = toEarthYears() / URANUS_ORBITAL
    fun onNeptune(): Double = toEarthYears() / NEPTUNE_ORBITAL
}