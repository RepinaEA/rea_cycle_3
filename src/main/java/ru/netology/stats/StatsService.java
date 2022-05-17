package ru.netology.stats;

public class StatsService {

    public int sum(int[] sales) {  // сумма всех продаж

        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return (sum);
    }

    public int average(int[] sales) { //средняя сумма продаж

        int sum = sum(sales);

        int average = sum / sales.length;
        return average;
    }

    public int maxi(int[] sales) {  //номер месяца с максимальными продажами
        int maxi = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxi]) {
                maxi = i;
            }
        }
        return maxi + 1;
    }

    public int mini(int[] sales) {  //номер месяца с минимальными продажами
        int mini = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[mini]) {
                mini = i;
            }
        }
        return mini + 1;
    }

    public int countMin(int[] sales) {  //количество месяцев с продажами ниже среднего
        int countMin = 0;
        int average = average(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                countMin++;
            }
        }
        return (countMin);
    }

    public int countMax(int[] sales) {  //количество месяцев с продажами выше среднего
        int countMax = 0;
        int average = average(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                countMax++;
            }
        }
        return (countMax);
    }
}

