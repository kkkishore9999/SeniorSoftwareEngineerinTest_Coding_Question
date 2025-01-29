package org.core.questions.examples;
public abstract class BasePaymentProcessor implements PaymentProcessor {
    @Override
    public boolean validatePayment(String paymentDetails) {
        // Common validation logic
        return paymentDetails != null && !paymentDetails.isEmpty();
    }

    public void logTransaction(double amount) {
        // Common transaction logging logic
        System.out.println("Logging transaction abstract class method : $" + amount);
    }

    public void generateReceipt(double amount) {
        // Common receipt generation logic
        System.out.println("Generating receipt for abstract class method: $" + amount);
    }
}
