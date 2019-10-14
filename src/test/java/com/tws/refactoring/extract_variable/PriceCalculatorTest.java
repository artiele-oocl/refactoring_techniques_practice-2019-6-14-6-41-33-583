package com.tws.refactoring.extract_variable;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PriceCalculatorTest {

    @Test
    public void printIEonMac() {
        //given
        PriceCalculator priceCalculator = new PriceCalculator();

        //when
        Double actual = priceCalculator.getPrice(12, 5);

        //then
        Double expected = 66.0;
        assertEquals(expected, actual);
    }
}
