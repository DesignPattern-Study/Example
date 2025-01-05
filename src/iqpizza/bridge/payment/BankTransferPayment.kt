package iqpizza.bridge.payment

import iqpizza.bridge.Payment
import iqpizza.bridge.PaymentGateway
import iqpizza.bridge.PaymentMethod

class BankTransferPayment(gateway: PaymentGateway) : Payment(gateway) {
    override fun pay(amount: Double) {
        paymentGateway.processPayment(PaymentMethod.BANK_TRANSFER, amount)
    }
}