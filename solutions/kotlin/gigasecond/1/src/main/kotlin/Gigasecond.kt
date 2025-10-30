import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond {
    private val totalSeconds = 1_000_000_000L
    
    val date: LocalDateTime
    
    constructor(startDate: LocalDate) {
        date = startDate.atStartOfDay().plusSeconds(totalSeconds)
    }
    
    constructor(startDateTime: LocalDateTime) {
        date = startDateTime.plusSeconds(totalSeconds)
    }
}