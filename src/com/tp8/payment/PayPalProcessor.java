package com.tp8.payment;

public class PayPalProcessor implements PaymentProcessor {

    private String email;

    public PayPalProcessor(String email) {
        this.email = email;
    }

    @Override
    public boolean processPayment(double amount) {
        if (amount <= 0) {
            System.out.println("Montant invalide : " + amount);
            return false;
        }
        System.out.println("Paiement de " + amount + " € effectué via PayPal (" + email + ").");
        return true;
    }

    @Override
    public String getPaymentMethod() {
        return "PayPal";
    }
}