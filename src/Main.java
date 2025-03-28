public class Main {
    public static void main(String[] args) {
        int cashPerMonth = 15000;
        int totalCash = 0;
        int month = 0;
        while (totalCash < 2459000) {
            totalCash += cashPerMonth;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalCash + " рублей");
        }
        System.out.println();

        int num = 0;
        while (num < 10) {
            num++;
            System.out.print(num + " ");
        }
        System.out.println();
        for (num = 10; num > 0; num--) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();

        int people = 12_000_000;
        int born = 17;
        int death = 8;
        for (int year = 1; year <= 10; year++) {
            people += people * (born - death) / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + people);
        }
        System.out.println();

        int newTotalCash = 0;
        month = 0;
        while (newTotalCash < 12_000_000) {
            month++;
            newTotalCash += newTotalCash * 7 / 100;
            newTotalCash += cashPerMonth;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + newTotalCash + " рублей");
        }
        System.out.println();

        newTotalCash = 0;
        month = 0;
        while (newTotalCash < 12_000_000) {
            month++;
            newTotalCash += newTotalCash * 7 / 100;
            newTotalCash += cashPerMonth;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + newTotalCash + " рублей");
            }
        }
        System.out.println();

        newTotalCash = 0;
        int years = 9;
        for (month = 1; month <= years * 12; month++) {
            newTotalCash += newTotalCash * 7 / 100;
            newTotalCash += cashPerMonth;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + newTotalCash + " рублей");
            }
        }
        System.out.println();

        int friday = 3;
        int day = 1;
        if (friday == 7) {
            while (day <= 31) {
                if (day % 7 == 0) {
                    System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
                }
                day++;
            }
        } else {
            do {
                if (day % 7 == friday) {
                    System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
                }
                day++;
            } while (day <= 31);
        }
        System.out.println();

        int startCount = 2025 - 200;
        int finalCount = 2025 + 100;
        for (int comet = startCount; comet <= finalCount; comet++) {
            if (comet % 79 == 0) {
                System.out.println(comet);
            }
        }
    }
}