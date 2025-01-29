package org.core.questions.examples;

public interface PaymentProcessor {
    void processPayment(double amount);
    boolean validatePayment(String paymentDetails);
}

