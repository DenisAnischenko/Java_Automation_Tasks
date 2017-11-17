package org.my.model;

public class Bank {

    private String name;
    private int minimumDeposit;
    private int maximumDeposit;
    private double rate3Months;
    private double rate6Months;
    private double rate12Months;

    public Bank(String name, int minimumDeposit, int maximumDeposit,
                double rate3Months, double rate6Months, double rate12Months) {
        this.name = name;
        this.minimumDeposit = minimumDeposit;
        this.maximumDeposit = maximumDeposit;
        this.rate3Months = rate3Months;
        this.rate6Months = rate6Months;
        this.rate12Months = rate12Months;
    }

    String getName() {
        return name;
    }

    int getMinimumDeposit() {
        return minimumDeposit;
    }

    int getMaximumDeposit() {
        return maximumDeposit;
    }

    double getRate3Months() {
        return rate3Months;
    }

    double getRate6Months() {
        return rate6Months;
    }

    double getRate12Months() {
        return rate12Months;
    }

}
