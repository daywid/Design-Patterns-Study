// Classe principal ECommerce que utiliza a fábrica de provedores de pagamento
class ECommerce {
    private PaymentProviderFactory paymentProviderFactory;

    // Construtor que recebe a fábrica de provedores de pagamento
    public ECommerce(PaymentProviderFactory paymentProviderFactory) {
        this.paymentProviderFactory = paymentProviderFactory;
    }

    // Método para processar o pagamento usando a instância criada pela fábrica
    public void processPayment(double amount, String paymentType) {
        PaymentProvider paymentProvider = paymentProviderFactory.createPaymentProvider(paymentType);
        paymentProvider.processPayment(amount);
    }
}
