package org.core.questions.examples;

public class PayPalProcessor extends BasePaymentProcessor {
    @Override
    public void processPayment(double amount) {
        // Specific implementation for PayPal payment processing
        System.out.println("Processing PayPal payment of PayPalProcessor: $" + amount);
        // Call common methods
        logTransaction(amount);
        generateReceipt(amount);
    }
}