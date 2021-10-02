package com.bridgelabz;

public class InvoiceGenerator {
    /**
     * Given : MINIMUM_COST_PER_KM = 10.0
     * COST_PER_TIME = 1
     * MINIMUM_FARE = 5
     */

    public static final double MAXIMUM_FARE = 5;
    public static final double PER_KILOMETER_COST = 10;
    public static final int PER_MINUTE_COST = 1;

    /**
     * Purpose : Given distance and time,
     * Return total fare for the journey.
     * <p>
     * Condition : If minimum total fare is less than the MINIMUM_FARE, return MINIMUM_FARE
     *
     * @param distance
     * @param time
     * @return
     */
    public static double calculatorFare(double distance, int time) {
        double totalFare = distance * PER_KILOMETER_COST + time * PER_MINUTE_COST;
        return Math.max(MAXIMUM_FARE, totalFare);
    }

    public static double calculateFareForMultipleRides(Ride[] rides) {
        double aggregateFare = 0.0;
        for (Ride ride : rides) {
            aggregateFare += calculatorFare(ride.distance, ride.time);
        }
        return aggregateFare;
    }



}