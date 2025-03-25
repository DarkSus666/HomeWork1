public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println();
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
        System.out.println();
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println();
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println();
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        int cashPerMonth = 29000;
        int totalCash = 0;
        for (int month = 1; month <= 12; month++) {
            totalCash += cashPerMonth;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalCash + " рублей");
        }
        System.out.println();
        double newTotalCash = 0;
        for (int month = 1; month <= 12; month++) {
            newTotalCash *= 1.01;
            newTotalCash += cashPerMonth;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + newTotalCash + " рублей");
        }
        System.out.println();
        int result;
        for (int i = 1; i <= 10; i++) {
            result = 2 * i;
            System.out.println("2*" + i + "=" + result);
        }
    }
}