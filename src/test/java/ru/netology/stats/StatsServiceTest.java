package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldSum() {
        StatsService manager = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.sum(sales);
        int expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldFindAverage() {
        StatsService manager = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.average(sales);
        int expected = 15;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldFindMax() {
        StatsService manager = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.maxi(sales);
        int expected = 8;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldFindMin() {
        StatsService manager = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.mini(sales);
        int expected = 9;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldCountMin() {
        StatsService manager = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.countMin(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldCountMax() {
        StatsService manager = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.countMax(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);


    }
}
