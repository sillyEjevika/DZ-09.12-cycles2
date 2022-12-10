public class Main {
    public static void main(String[] args) {
        // Задача №1
        System.out.println("Задача №1");
        int firstDeposit = 15000;
        int total = 0;
        int month = 0;
        while (total <= 2459000) {
            total = total + total / 100;
            total = total + firstDeposit;
            month = month + 1;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Итого накоплений " + total);
        System.out.println("Итого месяцев " + month);
        System.out.println("Итого лет " + month / 12);

        // Задача №2
        System.out.println("Задача №2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(" " + i);
        }
        System.out.println();
        for (int gg = 10; gg >= 1; gg--){
                System.out.print(" " + gg);
        }
        System.out.println();

        // Задача №3
        System.out.println("Задача №3");
        int population = 12_000_000;
        int bornPer1000 = 17;
        int diePer1000 = 8;
        int dif = bornPer1000 - diePer1000;
           for (int f = 1; f <= 10; f ++){
               population += population * dif/1000;
            System.out.println ("Год " + f + " ,численность населения составляет " + population + " человек");
        }
    }
}

