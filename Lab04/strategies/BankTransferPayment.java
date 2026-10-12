package Lab04.strategies;

import Lab04.Interface.PaymentStrategy;

public class BankTransferPayment implements PaymentStrategy {
    private final String bankAccount;

    public BankTransferPayment(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Thanh toán " + amount + " VNĐ qua Chuyển khoản ngân hàng STK: " + bankAccount);
    }
}
