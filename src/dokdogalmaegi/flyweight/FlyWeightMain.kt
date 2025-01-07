package dokdogalmaegi.flyweight

fun main() {
    flyweightMain()
//    overflowMain()
}

fun flyweightMain() {
    TextStyleFactory.getStyleWithFlyWeight("Arial", 12, TextColor.BLACK)
    TextStyleFactory.getStyleWithFlyWeight("Arial", 12, TextColor.BLACK)
    TextStyleFactory.getStyleWithFlyWeight("Arial", 12, TextColor.BLACK)
    TextStyleFactory.getStyleWithFlyWeight("Arial", 12, TextColor.BLACK)
    TextStyleFactory.getStyleWithFlyWeight("Arial", 12, TextColor.BLACK)
    TextStyleFactory.getStyleWithFlyWeight("Arial", 12, TextColor.BLACK)
    TextStyleFactory.getStyleWithFlyWeight("Arial", 12, TextColor.BLACK)
    TextStyleFactory.getStyleWithFlyWeight("Arial", 12, TextColor.BLACK)
    TextStyleFactory.getStyleWithFlyWeight("Arial", 12, TextColor.BLACK)
    TextStyleFactory.getStyleWithFlyWeight("Arial", 12, TextColor.BLACK)
    TextStyleFactory.getStyleWithFlyWeight("Arial", 12, TextColor.BLACK)
    TextStyleFactory.getStyleWithFlyWeight("Arial", 12, TextColor.BLACK)
}

fun overflowMain() {
    TextStyleFactory.getStyle("Arial", 12, TextColor.BLACK)
    TextStyleFactory.getStyle("Arial", 12, TextColor.BLACK)
    TextStyleFactory.getStyle("Arial", 12, TextColor.BLACK)
    TextStyleFactory.getStyle("Arial", 12, TextColor.BLACK)
    TextStyleFactory.getStyle("Arial", 12, TextColor.BLACK)
    TextStyleFactory.getStyle("Arial", 12, TextColor.BLACK)
    TextStyleFactory.getStyle("Arial", 12, TextColor.BLACK)
    TextStyleFactory.getStyle("Arial", 12, TextColor.BLACK)
    TextStyleFactory.getStyle("Arial", 12, TextColor.BLACK)
    TextStyleFactory.getStyle("Arial", 12, TextColor.BLACK)
    TextStyleFactory.getStyle("Arial", 12, TextColor.BLACK)
    TextStyleFactory.getStyle("Arial", 12, TextColor.BLACK)
}