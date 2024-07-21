package ru.netology;

public class StatsService {
    public long totalSum(long[] sales) {
        long sum = 0;
        for (long t : sales) {
            sum += t;
        }
        return sum;
    }

    public long averageSales(long[] sales) {
        long sum = totalSum(sales);
        long average = sum / sales.length;

        return average;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int lowerAverage(long[] sales) {
        long average = averageSales(sales);

        int countMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                countMonths++;
            }
        }
        return countMonths;
    }

    public int higherAverage(long[] sales) {
        long average = averageSales(sales);

        int countMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                countMonths++;
            }
        }
        return countMonths;
    }
}
