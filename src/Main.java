import java.time.LocalDate;

public class Main {
    public static void printLeapYear(int year) {
        if (year > 1584 && year % 4 == 0) {
            if (year % 400 != 0 && year % 100 == 0) {
                System.out.println(year + " год - невисокосный год");
            } else {
                System.out.println(year + " год - високосный год");
            }
        } else {
            System.out.println(year + " год - невисокосный год");
        }
    }

    public static void checkVersionApp(int oS, int year) {
        int currentYear = LocalDate.now().getYear();
        if (oS == 0) {
            if (year < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (oS == 1) {
            if (year < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static int calculateDaysDelivery(int distance) {
        int days;
        if (distance <= 20) {
            days = 1;
        } else if (distance <= 60) {
            days = 2;
        } else if (distance <= 100) {
            days = 3;
        } else {
            days = -1;
        }
        return days;
    }

    public static void main(String[] args) {
        int year = 2096;
        printLeapYear(year);

        int clientOS = 1;
        int clientDeviceYear = 2025;
        checkVersionApp(clientOS, clientDeviceYear);

        int deliveryDistance = 400;
        int deliveryDays = calculateDaysDelivery(deliveryDistance);
        if (deliveryDays >= 0) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }
    }
}