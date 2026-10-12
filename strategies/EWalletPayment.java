package Lab04.strategies;

import Lab04.Interface.OTPVerifiable;
import Lab04.Interface.PaymentStrategy;
import Lab04.Interface.Refundable;

public class EWalletPayment implements PaymentStrategy, OTPVerifiable, Refundable {
    private final String phoneNumber;

    public EWalletPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Thanh toán " + amount + " VNĐ qua Ví điện tử (" + phoneNumber + ")");
    }

    @Override
    public boolean verifyOTP(String otpCode) {
        System.out.println("Xác thực OTP Ví điện tử gửi tới số " + phoneNumber);
        return true;
    }

    @Override
    public void processRefund(double amount) {
        System.out.println("Hoàn " + amount + " VNĐ về Ví điện tử " + phoneNumber);
    }
}