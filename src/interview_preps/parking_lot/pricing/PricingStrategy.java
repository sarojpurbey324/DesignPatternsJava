package interview_preps.parking_lot.pricing;

import interview_preps.parking_lot.Ticket;

public interface PricingStrategy {

    double calculate(Ticket ticket);
}

