package org.core.questions.examples;

/*Explanation:
Interfaces: PaymentProcessor defined the contract for all payment processors.

Abstract Class: BasePaymentProcessor provided common functionality that could be used by all payment processors.

Concrete Classes: CreditCardProcessor and PayPalProcessor provided specific implementations for
processing credit card and PayPal payments, respectively.*/
public class ECommerceApp {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = getPaymentProcessor("creditcard");
        paymentProcessor.processPayment(100.0);
    }

    public static PaymentProcessor getPaymentProcessor(String type) {
        switch (type.toLowerCase()) {
            case "creditcard":
                return new CreditCardProcessor();
            case "paypal":
                return new PayPalProcessor();
            default:
                throw new IllegalArgumentException("Unsupported payment type: " + type);
        }
    }

}
