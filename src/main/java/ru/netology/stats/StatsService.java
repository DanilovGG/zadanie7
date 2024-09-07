package ru.netology.stats;

public class StatsService {

    // сумму всех продаж
    public static long calculateTotalSales(long[] sales) {
        int totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }
    
    // среднюю сумму продаж в месяц
    public static long calculateAverageSales(long[] sales) {
        return calculateTotalSales(sales) / sales.length;
    }

    // номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public static int getMaxSalesMonth(long[] sales) {
        int maxIndex = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[maxIndex] < sales[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    public static int getMinSalesMonth(long[] sales) {
        int minIndex = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[minIndex] > sales[i]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    // количество месяцев, в которых продажи были ниже среднего
    public static int countMonthsBelowAverage(long[] sales) {
        long average = calculateAverageSales(sales);
        int belowAverageCount = 0;
        // Перебираем все продажи
        for (long sale : sales) {
            if (sale < average) {
                belowAverageCount++;
            }
        }
        return belowAverageCount;
    }

    // количество месяцев, в которых продажи были выше среднего
    public static int countMonthsAboveAverage(long[] sales) {
        long average = calculateAverageSales(sales);
        int aboveAverageCount = 0;
        for (long sale : sales) {
            if (sale >= average) {
                aboveAverageCount++;
            }
        }
        return aboveAverageCount;
    }
}