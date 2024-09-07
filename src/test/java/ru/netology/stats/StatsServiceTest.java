package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    void testCalculateTotalSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService statsService = new StatsService();
        long result = statsService.calculateTotalSales(sales);
        Assertions.assertEquals(180, result);
        System.out.println("Общая сумма продаж: " + result);
    }

    @Test
    void testCalculateAverageSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService statsService = new StatsService();
        long result = statsService.calculateAverageSales(sales);
        Assertions.assertEquals(15, result, 0);
        System.out.println("Средняя сумма продаж в месяц: " + result);
    }

    @Test
    void testGetMaxSalesMonth() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService statsService = new StatsService();
        int result = statsService.getMaxSalesMonth(sales);
        Assertions.assertEquals(5, result);
        System.out.println("Месяц с максимальной продажей: " + result + "-й");
    }

    @Test
    void testGetMinSalesMonth() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService statsService = new StatsService();
        int result = statsService.getMinSalesMonth(sales);
        Assertions.assertEquals(8, result);
        System.out.println("Месяц с минимальной продажей: " + result + "-й");
    }

    @Test
    void testCountMonthsBelowAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService statsService = new StatsService();
        int result = statsService.countMonthsBelowAverage(sales);
        Assertions.assertEquals(5, result);
        System.out.println("Количество месяцев с продажами ниже средней: " + result);
    }

    @Test
    void testCountMonthsAboveAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService statsService = new StatsService();
        int result = statsService.countMonthsAboveAverage(sales);
        Assertions.assertEquals(7, result);
        System.out.println("Количество месяцев с продажами выше средней: " + result);
    }
}