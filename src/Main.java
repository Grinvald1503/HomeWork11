import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2021;
        findOutWhatYear(year);
    }

    public static void findOutWhatYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        byte clientOS = 0;
        int clientDeviceYear = LocalDate.now().getYear();
        findOutTheVersion(clientOS, clientDeviceYear);
    }

    public static void findOutTheVersion(int oS, int version) {
        if (oS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
            if (version < 2015) {
                System.out.println("Советуем установить облегченную версию приложения для IOS по ссылке");
            }
        } else if (oS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (version < 2015) {
                System.out.println("Советуем установить облегченную версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 30;
        String result = "Потребуется дней: ";
        System.out.println(result + needDays(deliveryDistance));
    }

    public static int needDays(int days) {
        int day;
        int dayAdded = (days - 20) / 40 + 1;
        int daysForDelivery = dayAdded + 1;
        if (days <= 20) {
            day = 1;
        } else {
            day = daysForDelivery;
        }
        return day;
    }
}
