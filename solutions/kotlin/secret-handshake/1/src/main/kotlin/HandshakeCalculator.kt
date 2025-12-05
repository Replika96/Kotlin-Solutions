object HandshakeCalculator {
    fun calculateHandshake(number: Int): List<Signal> {
        val actions = mutableListOf<Signal>()
        
        if (number and 0b00001 != 0) actions.add(Signal.WINK)
        if (number and 0b00010 != 0) actions.add(Signal.DOUBLE_BLINK)
        if (number and 0b00100 != 0) actions.add(Signal.CLOSE_YOUR_EYES)
        if (number and 0b01000 != 0) actions.add(Signal.JUMP)
        
        return if (number and 0b10000 != 0) actions.reversed() else actions
    }
}