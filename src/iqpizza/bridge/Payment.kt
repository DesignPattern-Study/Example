package iqpizza.bridge

abstract class Payment(protected val paymentGateway: PaymentGateway) {
    abstract fun pay(amount: Double)
}