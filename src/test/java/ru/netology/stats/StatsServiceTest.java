package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {

    @Test
        //сумму всех продаж
    void testCalculateTotalSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        service.setSales(sales);
        int expectedTotalSales = 180;
        Assertions.assertEquals(expectedTotalSales, service.calculateTotalSales());
        service.printTotalSales();
    }

    @Test
        //средняя сумма продаж в месяц
    void testCalculateAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        service.setSales(sales);
        int expectedAverageSales = 15;
        Assertions.assertEquals(expectedAverageSales, service.calculateAverageSales(), 0.0000000001);
        service.printAverageSales();
    }

    @Test
        //номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    void testGetMaxSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        service.setSales(sales);
        int expectedMaxSalesMonth = 5;
        Assertions.assertEquals(expectedMaxSalesMonth, service.getMaxSalesMonth());
        service.printMaxSalesMonth();
    }

    @Test
        //номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    void testGetMinSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        service.setSales(sales);
        int expectedMinSalesMonth = 8;
        Assertions.assertEquals(expectedMinSalesMonth, service.getMinSalesMonth());
        service.printMinSalesMonth();
    }

    @Test
        //количество месяцев, в которых продажи были ниже среднего
    void testCountMonthsBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        service.setSales(sales);
        int expectedMonthsBelowAverage = 5;
        Assertions.assertEquals(expectedMonthsBelowAverage, service.countMonthsBelowAverage());
        service.printMonthsBelowAverage();
    }

    @Test
        //количество месяцев, в которых продажи были выше среднего
    void testCountMonthsAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        service.setSales(sales);
        int expectedMonthsAboveAverage = 7;
        Assertions.assertEquals(expectedMonthsAboveAverage, service.countMonthsAboveAverage());
        service.printMonthsAboveAverage();
    }
}