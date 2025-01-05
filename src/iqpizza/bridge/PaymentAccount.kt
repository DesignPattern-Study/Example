package iqpizza.bridge

data class PaymentAccount(
	private val username: String,
	private val password: String,
	private val clientId: String
) {
	companion object {
		fun createDummy(): PaymentAccount {
			return PaymentAccount("", "", "")
		}
	}
}