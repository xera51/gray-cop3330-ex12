/*
 *  UCF COP3330 Summer 2021 Exercise 12 Solution
 *  Copyright 2021 Christopher Gray
 */
package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_is_formatted_properly() {
        App myApp = new App();

        double investment = 1758;
        double roi = 0.043;
        int years = 4;

        String expectedOutput = "After 4 years at 4.3%, the investment will be worth $1758.";
        String actualOutput = myApp.generateOutputString(years, roi * 100, investment);

        assertEquals(expectedOutput, actualOutput);
    }

}