package iqpizza.bridge

import iqpizza.bridge.gateway.NaverPayGateway
import iqpizza.bridge.gateway.PayPalGateway
import iqpizza.bridge.payment.CreditCardPayment
import iqpizza.bridge.payment.MobilePayment

class PaymentExample {
    companion object {
        val payPalAccount = PaymentAccount("", "", "paypal-client-id")
        val naverAccount = PaymentAccount("", "", "naver-client-id")
        val kakaoAccount = PaymentAccount("", "", "kakao-client-id")
    }
}

fun main() {
    // PayPal 로 처리하되, 결제 방식은 카드 결재. ($20)
    val payPalGateway = PayPalGateway()
    payPalGateway.account = PaymentExample.payPalAccount.copy(username = "임재청", password = "456789")
    val creditCardPayment = CreditCardPayment(payPalGateway)
    creditCardPayment.pay(20.0)

    // Naver 로 처리하되, 결제 방식은 모바일 결재 ($30)
    val naverGateway = NaverPayGateway()
    naverGateway.account = PaymentExample.naverAccount.copy(username = "김준호", password = "123456")
    val mobilePayment = MobilePayment(naverGateway)
    mobilePayment.pay(30.0)
}
