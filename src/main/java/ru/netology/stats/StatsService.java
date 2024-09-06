package ru.netology.stats;

public class StatsService {

    private int[] sales;

    public void setSales(int[] sales) {
        this.sales = sales;
    }

    // сумму всех продаж
    public int calculateTotalSales() {
        int totalSales = 0;
        for (int sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }
    
    // среднюю сумму продаж в месяц
    public int calculateAverageSales() {
        return calculateTotalSales() / sales.length;
    }

    // номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public int getMaxSalesMonth() {
        int maxIndex = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[maxIndex] < sales[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    public int getMinSalesMonth() {
        int minIndex = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[minIndex] > sales[i]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    // количество месяцев, в которых продажи были ниже среднего
    public int countMonthsBelowAverage() {
        int average = calculateAverageSales();
        int belowAverageCount = 0;
        // Перебираем все продажи
        for (int sale : sales) {
            if (sale < average) {
                belowAverageCount++;
            }
        }
        return belowAverageCount;
    }

    // количество месяцев, в которых продажи были выше среднего
    public int countMonthsAboveAverage() {
        int average = calculateAverageSales();
        int aboveAverageCount = 0;
        for (int sale : sales) {
            if (sale >= average) {
                aboveAverageCount++;
            }
        }
        return aboveAverageCount;
    }

    public void printTotalSales() {
        System.out.println("Общая сумма продаж: " + calculateTotalSales());
    }

    public void printAverageSales() {
        System.out.println("Средняя сумма продаж в месяц: " + calculateAverageSales());
    }

    public void printMaxSalesMonth() {
        System.out.println("Номер месяца с максимальными продажами: " + getMaxSalesMonth());
    }

    public void printMinSalesMonth() {
        System.out.println("Номер месяца с минимальными продажами: " + getMinSalesMonth());
    }

    public void printMonthsBelowAverage() {
        System.out.println("Количество месяцев с продажами ниже среднего: " + countMonthsBelowAverage());
    }

    public void printMonthsAboveAverage() {
        System.out.println("Количество месяцев с продажами выше среднего: " + countMonthsAboveAverage());
    }
}