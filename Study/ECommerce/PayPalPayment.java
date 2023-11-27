class PayPalPayment implements PaymentProvider {
    @Override
    public void processPayment(double amount) {
        System.out.println("Pagamento via PayPal no valor de R$" + amount);
    }
}