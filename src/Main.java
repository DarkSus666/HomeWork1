public class Main {
    public static void main(String[] args) {
        int[] paysMonth = {15000, 37000, 25000, 54000, 48000};
        int sum = 0;
        for (int i : paysMonth) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();

        int[] paysWeek = {1200, 6800, 2500, 1800, 3900};
        int max = -1;
        int min = 10000000;
        for (int i : paysWeek) {
            if (i <= min) {
                min = i;
            }
            if (i >= max) {
                max = i;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей");
        System.out.println();

        int[] paysNewMonth = {65877, 93083, 13909, 57418, 35025};
        double newSum = 0;
        for (int i : paysNewMonth) {
            newSum += i;
        }
        double mid = newSum / paysNewMonth.length;
        System.out.println("Средняя сумма трат за месяц составила " + mid + " рублей");
        System.out.println();

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char temp;
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        for (char i : reverseFullName) {
            System.out.print(i);
        }
    }
}