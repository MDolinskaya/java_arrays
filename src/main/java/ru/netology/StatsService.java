package ru.netology;

public class StatsService {
    public int totalSum(int[] sales) {
        int sum = 0;
        for (int t : sales) {
            sum += t;
        }
        return sum;
    }

    public int averageSales(int[] sales) {
        int sum = totalSum(sales);
        int average = sum / sales.length;

        return average;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int lowerAverage(int[] sales) {
        int average = averageSales(sales);

        int countMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                countMonths++;
            }
        }
        return countMonths;
    }

    public int higherAverage(int[] sales) {
        int average = averageSales(sales);

        int countMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                countMonths++;
            }
        }
        return countMonths;
    }
}
