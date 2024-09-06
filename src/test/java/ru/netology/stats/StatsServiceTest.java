package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {

    @Test
        //сумму всех продаж
    void testCalculateTotalSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService statsService = new StatsService();
        statsService.setSales(sales);
        Assertions.assertEquals(180, statsService.calculateTotalSales());
        service.printTotalSales();
    }

    @Test
        //средняя сумма продаж в месяц
    void testCalculateAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService statsService = new StatsService();
        statsService.setSales(sales);
        Assertions.assertEquals(15, statsService.calculateAverageSales(), 0);
        service.printAverageSales();
    }

    @Test
        //номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    void testGetMaxSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService statsService = new StatsService();
        statsService.setSales(sales);
        Assertions.assertEquals(5, statsService.getMaxSalesMonth());
        service.printMaxSalesMonth();
    }

    @Test
        //номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    void testGetMinSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService statsService = new StatsService();
        statsService.setSales(sales);
        Assertions.assertEquals(8, statsService.getMinSalesMonth());
        service.printMinSalesMonth();
    }

    @Test
        //количество месяцев, в которых продажи были ниже среднего
    void testCountMonthsBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService statsService = new StatsService();
        statsService.setSales(sales);
        Assertions.assertEquals(5, statsService.countMonthsBelowAverage());
        service.printMonthsBelowAverage();
    }

    @Test
        //количество месяцев, в которых продажи были выше среднего
    void testCountMonthsAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService statsService = new StatsService();
        statsService.setSales(sales);
        Assertions.assertEquals(7, statsService.countMonthsAboveAverage());
        service.printMonthsAboveAverage();
    }
}