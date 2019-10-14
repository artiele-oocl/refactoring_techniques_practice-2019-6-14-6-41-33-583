package com.tws.refactoring.extract_method;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class OwingPrinter {
    void printOwing(String name, List<Order> orders) {
        System.out.println ("*****************************");
        System.out.println ("****** Customer totals ******");
        System.out.println ("*****************************");
        System.out.println("name: " + name);
        System.out.println("amount: " + getTotalAmount(orders));
    }

    Double getTotalAmount(List<Order> orders) {
        Iterator<Order> elements = orders.iterator();
        double getTotalAmount = 0.0;
        while (elements.hasNext()) {
            Order each = elements.next();
            getTotalAmount += each.getAmount();
        }
        return getTotalAmount;
    }
}

class Order {
    private final double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    double getAmount() {
        return amount;
    }
}
