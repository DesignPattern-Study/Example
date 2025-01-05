package iqpizza.bridge.gateway

import iqpizza.bridge.PaymentAccount
import iqpizza.bridge.PaymentGateway
import iqpizza.bridge.PaymentMethod

class NaverPayGateway : PaymentGateway {
    override var account: PaymentAccount = PaymentAccount.createDummy()

    override fun processPayment(method: PaymentMethod, amount: Double) {
        println("Processing method $method with NaverPay (amount: $amount). Thank you")
    }
}