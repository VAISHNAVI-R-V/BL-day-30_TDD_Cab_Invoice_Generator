package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * The cab service is a subscription based service where the customer books a cab and pays the bill at the end of the month.
 * UC1 : Given Distance and Time, the invoice generator should return the total fare for the journey.
 *
 * @author : VAISHNAVI R. VISHWAKRMA.
 * @since : 29.09.2021
 */
public class InvoiceServiceTest {
    InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

    /**
     * ** Step 1.1
     * Purpose : Given distance and time,
     * return total fare
     */
    @Test
    public void givenDistanceAndTime_shouldReturn_totalFare() {
        double distance = 5.0;
        int time = 15;
        double fare = invoiceGenerator.calculatorFare(distance, time);
        Assertions.assertEquals(65, fare, 0.0);
    }

    /**
     * ** Step 1.2
     * Purpose: Given distance and time,
     * return minimum fare as 5
     */
    @Test
    public void givenLessDistanceAndTime_ShouldReturnMinFare() {
        double distance = 0.1;
        int time = 2;
        double fare = invoiceGenerator.calculatorFare(distance, time);
        Assertions.assertEquals(5, fare, 0.0);
    }
}
