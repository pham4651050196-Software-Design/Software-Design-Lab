package Lab04;

import Lab04.Service.PaymentService;
import Lab04.strategies.BankTransferPayment;
import Lab04.strategies.CreditCardPayment;
import Lab04.strategies.EWalletPayment;
import Lab04.strategies.PayPalPayment;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        PaymentService paymentService = new PaymentService();

        // 1. Thanh toán bằng Thẻ tín dụng
        System.out.println("=== Giao dịch 1: Thẻ tín dụng ===");
        CreditCardPayment creditCard = new CreditCardPayment("4123-4567-8901-2345");
        creditCard.verifyOTP("123456");
        paymentService.setPaymentStrategy(creditCard);
        paymentService.excutePayment(500000);

        // 2. Chuyển sang Ví điện tử
        System.out.println("\n=== Giao dịch 2: Ví điện tử ===");
        EWalletPayment eWallet = new EWalletPayment("0987654321");
        eWallet.verifyOTP("654321");
        paymentService.setPaymentStrategy(eWallet);
        paymentService.excutePayment(200000);

        // 3. Chuyển sang Chuyển khoản ngân hàng
        System.out.println("\n=== Giao dịch 3: Chuyển khoản ===");
        BankTransferPayment bankTransfer = new BankTransferPayment("1900123456789");
        paymentService.setPaymentStrategy(bankTransfer);
        paymentService.excutePayment(1500000);

        // 4. Hoàn tiền demo
        System.out.println("\n=== Xử lý hoàn tiền ===");
        PayPalPayment paypal = new PayPalPayment("user@example.com");
        paypal.processRefund(100000);
    }
}
