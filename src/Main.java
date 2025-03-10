public class Main {
    public static void main(String[] args) {
        // Задача 1:
        int age = 30;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println();

        // Задача 2:
        /* Не совсем корректно условие выводимой фразы.
        Немного изменил текст, чтобы избежить повторения */
        int temp = 15;
        if (temp < 5) {
            System.out.println("Сегодня холодно. На улице " + temp + " градусов, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло. На улице " + temp + " градусов, можно идти без шапки");
        }
        System.out.println();

        // Задача 3:
        // При условии, что скорость 60 - допустима
        int speed = 79;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        System.out.println();

        // Задача 4:
        int personAge = 17;
        if (personAge >= 2 && personAge <= 6) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в детский сад");
        } else if (personAge >= 7 && personAge <= 17) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в школу");
        } else if (personAge >= 18 && personAge <= 24) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить на работу");
        }
        System.out.println();

        // Задача 5:
        int childAge = 6;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        } else if (childAge >= 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println();

        // Задача 6:
        int peopleInTrain = 40;
        if (peopleInTrain < 60) {
            System.out.println("В вагоне есть сидячее место");
        } else if (peopleInTrain >= 60 && peopleInTrain < 102) {
            System.out.println("В вагоне есть стоячее место");
        } else {
            System.out.println("Вагон полностью забит");
        }
        System.out.println();

        // Задача 7:
        // Использовал >=, так как нам важно само число, а не переменная его содержащая
        int one = 876;
        int two = 30;
        int three = 69;
        if (one >= two && one >= three) {
            System.out.println("Число " + one + " большее");
        } else if (two >= one && two >= three) {
            System.out.println("Число " + two + " большее");
        } else {
            System.out.println("Число " + three + " большее");
        }
    }
}