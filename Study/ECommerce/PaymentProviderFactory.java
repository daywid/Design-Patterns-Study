// Única classe Factory parametrizada
class PaymentProviderFactory {
    public PaymentProvider createPaymentProvider(String paymentType) {
        switch (paymentType) {
            case "creditCard":
                return new CreditCardPayment();
            case "paypal":
                return new PayPalPayment();
            default:
                throw new IllegalArgumentException("Tipo de pagamento não suportado: " + paymentType);
        }
    }
}
