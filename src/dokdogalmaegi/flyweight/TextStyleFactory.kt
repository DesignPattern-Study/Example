package dokdogalmaegi.flyweight

object TextStyleFactory {
    private val styles = mutableMapOf<String, TextStyle>()

    private fun getStyleKey(font: String, size: Int, color: TextColor): String {
        return "$font[]$size[]$color"
    }

    fun getStyleWithFlyWeight(font: String, size: Int, color: TextColor): TextStyle =
        styles.computeIfAbsent(getStyleKey(font, size, color)) {
            println("Creating new TextStyle")
            val textStyle = TextStyle(font, size, color)
            MemoryMonitor.allocateMemory(textStyle.toString().length)

            textStyle
        }

    fun getStyle(font: String, size: Int, color: TextColor): TextStyle {
        println("Creating new TextStyle")
        val textStyle = TextStyle(font, size, color)
        MemoryMonitor.allocateMemory(textStyle.toString().length)

        return textStyle
    }
}