// Implementações concretas dos provedores de pagamento
class CreditCardPayment implements PaymentProvider {
    @Override
    public void processPayment(double amount) {
        System.out.println("Pagamento com cartão de crédito no valor de R$" + amount);
    }
}