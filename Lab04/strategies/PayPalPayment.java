package Lab04.strategies;

import  Lab04.Interface.PaymentStrategy;
import Lab04.Interface.Refundable;

public class PayPalPayment implements PaymentStrategy, Refundable {
    private final String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Thanh toán " + amount + " VNĐ qua tài khoản PayPal (" + email + ")");
    }

    @Override
    public void processRefund(double amount) {
        System.out.println("Hoàn " + amount + " VNĐ về tài khoản PayPal " + email);
    }
}