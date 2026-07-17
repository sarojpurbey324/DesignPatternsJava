package interview_preps.car_rental.payment;

import interview_preps.car_rental.bill.Bill;

public interface PaymentStrategy {

    Payment processPayment(Bill bill, double paymentAmount);
}
