package dokdogalmaegi.flyweight

object MemoryMonitor {
    private const val MAX_MEMORY = 300
    private var usedMemory = 0

    fun allocateMemory(memory: Int) {
        if (usedMemory + memory > MAX_MEMORY) {
            throw OutOfMemoryError("Not enough memory, used: $usedMemory, requested: $memory(${usedMemory + memory})")
        }

        usedMemory += memory

        println("Allocated memory: $memory, used: $usedMemory")
    }
}