package com.tws.refactoring.extract_method;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void printOwing() {
        //given
        OwingPrinter owingPrinter = new OwingPrinter();
        List<Order> orders = new ArrayList<>();
        Order order1 = new Order(2.0);
        Order order2 = new Order(50.0);
        orders.add(order1);
        orders.add(order2);
        //when
        owingPrinter.printOwing("Lester",orders);
        //then
        String expected =  "*****************************\r\n".concat("****** Customer totals ******\r\n").concat("*****************************\r\n").concat("name: Lester\r\n").concat("amount: 52.0\r\n");
        assertEquals(expected, outContent.toString());
    }
}