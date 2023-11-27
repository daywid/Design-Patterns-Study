// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        PaymentProviderFactory factory = new PaymentProviderFactory();

        // Utilizando cartão de crédito
        ECommerce ecommerceCreditCard = new ECommerce(factory);
        ecommerceCreditCard.processPayment(100.0, "creditCard");

        // Utilizando PayPal
        ECommerce ecommercePayPal = new ECommerce(factory);
        ecommercePayPal.processPayment(50.0, "paypal");
    }
}