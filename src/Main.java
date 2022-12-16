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
        System.out.println(year + findOutWhatYear(year));
    }

    public static String findOutWhatYear(int year) {
        String whatYear;
        if (year % 400 == 0) {
            whatYear = " год — високосный год";
        } else if (year % 4 == 0) {
            if (year % 100 == 0) {
                whatYear = " год — невисокосный год";
            } else {
                whatYear = " год — високосный год";
            }
        } else {
            whatYear = " год — невисокосный год";
        }
        return whatYear;
    }

    public static void task2() {
        System.out.println("Задача 2");
        byte clientOS = 0;
        int clientDeviceYear = LocalDate.now().getYear();
        System.out.println(findOutTheVersion(clientOS, clientDeviceYear));
    }

    public static String findOutTheVersion(int OS, int version) {
        String resultOS = "";
        String resultVersion = "";
        if (OS == 0) {
            resultOS = "Установите версию приложения для IOS по ссылке \n";
            if (version < 2015) {
                resultVersion = ("Советуем установить облегченную версию приложения для IOS по ссылке\n");
            }
        } else if (OS == 1) {
            resultOS = ("Установите версию приложения для Android по ссылке \n");
            if (version < 2015) {
                resultVersion = ("Советуем установить облегченную версию приложения для Android по ссылке\n");
            }
        }
        return resultOS + resultVersion;
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        String result = "Потребуется дней: ";
        System.out.println(result + needDays(deliveryDistance));
    }

    public static int needDays (int days) {
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
