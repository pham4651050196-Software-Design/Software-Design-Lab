package Lab04.Service;

import Lab04.Interface.PaymentStrategy;

public class PaymentService {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void excutePayment(double amount) throws IllegalAccessException {
        if(paymentStrategy == null){
            throw new IllegalAccessException("Chưa lựa chọn phương thức thanh toán!");
        }
        paymentStrategy.processPayment(amount);
    }
}
