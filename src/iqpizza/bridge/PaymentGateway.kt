package iqpizza.bridge

interface PaymentGateway {
    var account: PaymentAccount
    fun processPayment(method: PaymentMethod, amount: Double)
}