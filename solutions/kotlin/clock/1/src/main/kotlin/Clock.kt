class Clock(private var hours: Int, private var minutes: Int) {
    
    init {
        normalizeTime()
    }
    
    fun add(minutes: Int) {
        this.minutes += minutes
        normalizeTime()
    }
    
    fun subtract(minutes: Int) {
        this.minutes -= minutes
        normalizeTime()
    }
    
    private fun normalizeTime() {
        
        hours += minutes / 60
        minutes %= 60
        
        if (minutes < 0) {
            minutes += 60
            hours--
        }
        
        hours %= 24
        if (hours < 0) {
            hours += 24
        }
    }
    
    override fun toString(): String {
        return "%02d:%02d".format(hours, minutes)
    }
    
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Clock) return false
        return hours == other.hours && minutes == other.minutes
    }
    
    override fun hashCode(): Int {
        return 31 * hours + minutes
    }
}