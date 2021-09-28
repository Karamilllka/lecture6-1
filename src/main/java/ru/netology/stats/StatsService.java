package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int average(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int maxMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int moreAverage(int[] sales) {
        int moreAversge = 0;
        for (int sale : sales) {
            if (sale > average(sales)) {
                moreAversge = moreAversge + 1;

            }

        }
        return moreAversge;
    }

    public int lessAverage(int[] sales) {
        int lessAversge = 0;
        for (int sale : sales) {
            if (sale < average(sales)) {
                lessAversge = lessAversge + 1;

            }

        }
        return lessAversge;
    }

}
