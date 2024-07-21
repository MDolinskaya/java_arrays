package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void calculateTotalSum () {
        StatsService service = new StatsService();

        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedSum = 180;
        int actualSum = service.totalSum(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void calculateAverageSales () {
        StatsService service = new StatsService();

        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedAverage = 15;
        int actualAverage = service.averageSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void findMinSales () {
        StatsService service = new StatsService();

        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedDay = 9;
        int actualDay = service.minSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void findMaxSales () {
        StatsService service = new StatsService();

        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedDay = 8;
        int actualDay = service.maxSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void findLowerAverageMonths () {
        StatsService service = new StatsService();

        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedCount = 5;
        int actualCount = service.lowerAverage(sales);

        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void findHigherAverageMonths () {
        StatsService service = new StatsService();

        long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedCount = 5;
        int actualCount = service.higherAverage(sales);

        Assertions.assertEquals(expectedCount, actualCount);
    }
}
