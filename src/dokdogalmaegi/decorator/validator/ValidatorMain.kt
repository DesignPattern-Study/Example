/*
 * 프로그램에 대한 저작권을 포함한 지적재산권은 (주)씨알에스큐브에 있으며, (주)씨알에스큐브가 명시적으로 허용하지 않은
 * 사용, 복사, 변경, 제3자에의 공개, 배포는 엄격히 금지되며, (주)씨알에스큐브의 지적 재산권 침해에 해당됩니다.
 * Copyright ⓒ 2024. CRScube Co., Ltd. All Rights Reserved| Confidential)
 */
package dokdogalmaegi.decorator.validator

/**
 * Created by ljy on 12/23/24.
 */
fun main() {
    val validator = TrueValidator()
    println(validator.validate("test"))

    val notNullValidator = NotNullDecorator(validator)
    println(notNullValidator.validate("test"))

    val notEmptyValidator = NotEmptyDecorator(validator)
    println(notEmptyValidator.validate("test"))

    val notNullAndNotEmptyValidator = NotNullAndNotEmptyDecorator(validator)
    println(notNullAndNotEmptyValidator.validate("test"))

    val lengthValidator = LengthDecorator(validator)
    println(lengthValidator.validate("test"))
    println(lengthValidator.validate("testdddd"))
}