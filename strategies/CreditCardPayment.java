package Lab04.strategies;

import Lab04.Interface.OTPVerifiable;
import Lab04.Interface.PaymentStrategy;
import Lab04.Interface.Refundable;


public class CreditCardPayment implements PaymentStrategy, OTPVerifiable, Refundable {
    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Thanh toán " + amount + " VNĐ bằng thẻ tín dụng (" + cardNumber + ")");
    }

    @Override
    public boolean verifyOTP(String otpCode) {
        System.out.println("Xác thực OTP: " + otpCode + " cho thẻ " + cardNumber);
        return true;
    }

    @Override
    public void processRefund(double amount) {
        System.out.println("Hoàn " + amount + " VNĐ về thẻ tín dụng " + cardNumber);
    }
}
