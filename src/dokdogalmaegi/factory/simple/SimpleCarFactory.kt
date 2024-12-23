/*
 * 프로그램에 대한 저작권을 포함한 지적재산권은 (주)씨알에스큐브에 있으며, (주)씨알에스큐브가 명시적으로 허용하지 않은
 * 사용, 복사, 변경, 제3자에의 공개, 배포는 엄격히 금지되며, (주)씨알에스큐브의 지적 재산권 침해에 해당됩니다.
 * Copyright ⓒ 2024. CRScube Co., Ltd. All Rights Reserved| Confidential)
 */
package dokdogalmaegi.factory.simple

/**
 * Created by ljy on 12/17/24.
 */
class SimpleCarFactory {
    fun orderCar(type: String): Car {
        val car = createCar(type)
        car?.let {
            return it
        } ?: throw IllegalArgumentException("Unknown car type")
    }

    private fun createCar(type: String): Car? {
        return when (type) {
            "SEDAN" -> Sedan()
            "COUPE" -> Coupe()
            else -> null
        }
    }
}