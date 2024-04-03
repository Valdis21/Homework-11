public class Main {

    public static void checkYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год явлается високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void recommendationVersion(int clientOS, int year) {
        if (clientOS == 0 && year >= 2023) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && year < 2024) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }

    public static int countingDays(int distance) {
        int day = 0;
        if (distance <= 20) {
            day++;
        } else if (distance <= 60) {
            day = day + 2;
        } else if (distance <= 100) {
            day = day + 3;
        }
        return day;
    }

    public static void main(String[] args) {
        // Задача 1
        int someYear = 2024;
        checkYear(someYear);

        // Задача 2
        int os = 0;
        int clientDeviceYear = 2022;
        recommendationVersion(os, clientDeviceYear);

        // Задача 3
        int deliveryDistante = 95;
        if (countingDays(deliveryDistante) != 0) {
            System.out.println("Потребуется дней доставки: " + countingDays(deliveryDistante));
        } else {
            System.out.println("Доставки нет.");
        }
    }
}
