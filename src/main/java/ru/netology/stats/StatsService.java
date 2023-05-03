package ru.netology.stats;

public class StatsService {
    public long amount(long[] sales) {
        long allSale = 0;
        for (long sale : sales) {
            allSale += sale;
        }
        return allSale;
    }

    public long average(long[] sales) {
        if (sales.length == 0) {
            return 0;
        }
        return amount(sales) / sales.length;
    }

    public int salesMaximumAmount(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[month]) {
                month = i;
            }
        }
        return month + 1;
    }

    public int salesMinimumAmount(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[month]) {
                month = i;
            }
        }
        return month + 1;
    }

    public int monthsBelowAverage(long[] sales) {
        int calculator = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                calculator++;
            }
        }
        return calculator;
    }

    public int monthsAboveAverage(long[] sales) {
        int calculator = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                calculator++;
            }
        }
        return calculator;
    }
}


