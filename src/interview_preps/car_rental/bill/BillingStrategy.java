package interview_preps.car_rental.bill;

import interview_preps.car_rental.reservation.Reservation;

public interface BillingStrategy {

    Bill generateBill(Reservation reservation);
}
