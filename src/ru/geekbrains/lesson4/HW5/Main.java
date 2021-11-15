package ru.geekbrains.lesson4.HW5;

import java.util.concurrent.CyclicBarrier;

public class Main {
    public static final int CARS_COUNT = 4;

    public static void main(String[] args) {
        System.out.println("Объявление ===ПОДГОТОВКА===");

        CyclicBarrier barrier = new CyclicBarrier(Main.CARS_COUNT + 1);

    }

}
