package com.bridgelabz;

public class InvoiceGenerator {
    /**
     * Given : MINIMUM_COST_PER_KM = 10.0
     * COST_PER_TIME = 1
     * MINIMUM_FARE = 5
     */

    private static final double MAXIMUM_FARE = 5;
    private static final double PER_KILOMETER_COST = 10;
    private static final int PER_MINUTE_COST = 1;

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

    /**
     * Purpose : Given distance and time for multiple rides,
     * Return aggregate total fare for all the journey
     *
     * @param rides
     * @return
     */
    public static double calculateFareForMultipleRides(Ride[] rides) {
        double aggregateFare = 0.0;
        for (Ride ride : rides) {
            aggregateFare += calculatorFare(ride.distance, ride.time);
        }
        return aggregateFare;
    }

    /**
     * Purpose : Given distance and time for multiple rides,
     *           Calculate aggregate total fare for all the journey
     *           Calculate the average fare per ride taking total number of rides and total fare as input
     *
     * @param rides
     * @return
     */
    public InvoiceSummary calculateFareSummary(Ride[] rides) {
        double totalFare = 0.0;
        for (Ride ride : rides) {
            totalFare += this.calculateFare(ride.distance, ride.time);
        }
        return new InvoiceSummary(rides.length, totalFare);
    }

    private double calculateFare(double distance, int time) {
        double totalFare = distance * PER_KILOMETER_COST + time * PER_MINUTE_COST;
        return Math.max(MAXIMUM_FARE, totalFare);
    }
}
