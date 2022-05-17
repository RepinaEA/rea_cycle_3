import ru.netology.stats.StatsService;

public class Main {

    public static void main(String[] args) {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        int sum = service.sum(sales);
        System.out.println("Сумма всех продаж: " + sum);

        int average = service.average(sales);
        System.out.println("Средняя сумма продаж: " + average);

        int maxi = service.maxi(sales);
        System.out.println("Месяц с максимальными продажами: " + maxi);

        int mini = service.mini(sales);
        System.out.println("Месяц с минимальными продажами: " + mini);

        int countMin = service.countMin(sales);
        System.out.println("Количество месяцев с продажами ниже среднего: " + countMin);

        int countMax = service.countMax(sales);
        System.out.println("Количество месяцев с продажами выше среднего: " + countMax);


    }


}
