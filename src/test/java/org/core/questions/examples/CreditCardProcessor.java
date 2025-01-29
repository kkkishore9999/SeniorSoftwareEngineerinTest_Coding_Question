package org.core.questions.examples;

public class CreditCardProcessor extends BasePaymentProcessor {
    @Override
    public void processPayment(double amount) {
        // Specific implementation for credit card payment processing
        System.out.println("Processing credit card payment of Concrete Classes: $" + amount);
        // Call common methods
        logTransaction(amount);
        generateReceipt(amount);
    }
}
