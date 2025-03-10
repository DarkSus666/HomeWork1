public class Main {
    public static void main(String[] args) {
        // Задача 1:
        byte num1 = 13;
        short num2 = -187;
        int num3 = 5473889;
        long num4 = 300000000000L;
        float num5 = 187.463F;
        double num6 = 74.8465738324;
        System.out.println("Значение переменной num1 с типом byte равно " + num1);
        System.out.println("Значение переменной num2 с типом short равно " + num2);
        System.out.println("Значение переменной num3 с типом int равно " + num3);
        System.out.println("Значение переменной num4 с типом long равно " + num4);
        System.out.println("Значение переменной num5 с типом float равно " + num5);
        System.out.println("Значение переменной num6 с типом double равно " + num6);
        System.out.println();

        // Задача 2:
        float num7 = 27.12F;
        long num8 = 987678965549L;
        float num9 = 2.786F;
        short num10 = 569;
        short num11 = -159;
        short num12 = 27897;
        byte num13 = 67;

        //Задача 3:
        int ludmilaPavlovna = 23;
        int annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        int papers = 480;
        int papersToPupil = papers / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + papersToPupil + " листов бумаги");
        System.out.println();

        // Задача 4:
        int baseCount = 16;
        int basePeriod = 2;
        int bottlePerMinute = baseCount / basePeriod;
        int period1 = bottlePerMinute * 20;
        int period2 = bottlePerMinute * 24 * 60;
        int period3 = bottlePerMinute * 3 * 24 * 60;
        int period4 = bottlePerMinute * 30 * 24 * 60;
        System.out.println("За 20 минут машина произвела " + period1 + " штук бутылок");
        System.out.println("За сутки машина произвела " + period2 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + period3 + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + period4 + " штук бутылок");
        System.out.println();

        // Задача 5:
        int allColors = 120;
        int classes = allColors / 6;
        int brownColor = classes * 4;
        int whiteColor = classes * 2;
        System.out.println("В школе, где " + classes + " классов, нужно " + whiteColor + " банок белой краски и " + brownColor + " банок коричневой краски");
        System.out.println();

        // Задача 6:
        int bananas = 5;
        int milk = 200;
        int iceCream = 2;
        int eggs = 4;
        int countWeight = bananas * 80 + milk * 105 / 100 + iceCream * 100 + eggs * 70;
        double weightInKg = (double) countWeight / 1000;
        System.out.println("Спортзавтрак будет весить " + countWeight + " грамм, в килограммах это - " + weightInKg + " кг");

        // Задача 7:
        int overWeight = 7;
        int overWeightInGr = overWeight * 1000;
        int minLost = 250;
        int maxLost = 500;
        int days1 = overWeightInGr / minLost;
        int days2 = overWeightInGr / maxLost;
        int days3 = (days1 + days2) / 2;
        System.out.println("Если спортсмен будет терять по " + minLost + " грамм в день, то он похудеет на 7 кг за " + days1 + " дней");
        System.out.println("Если спортсмен будет терять по " + maxLost + " грамм в день, то он похудеет на 7 кг за " + days2 + " дней");
        System.out.println("В среднем для похудения ему понадобится  " + days3 + " дней");
        System.out.println();

        // Задача 8:
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        double mashaNew = masha * 1.1;
        double denisNew = denis * 1.1;
        double kristinaNew = kristina * 1.1;
        double mashaDiffYear = (mashaNew - masha) * 12;
        double denisDiffYear = (denisNew - denis) * 12;
        double kristinaDiffYear = (kristinaNew - kristina) * 12;
        System.out.println("Маша теперь получает " + mashaNew + " рублей. Годовой доход вырос на " + mashaDiffYear + " рублей");
        System.out.println("Денис теперь получает " + denisNew + " рублей. Годовой доход вырос на " + denisDiffYear + " рублей");
        System.out.println("Кристина теперь получает " + kristinaNew + " рублей. Годовой доход вырос на " + kristinaDiffYear + " рублей");
    }
}