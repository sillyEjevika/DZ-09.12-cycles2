public class Main {
    public static void main(String[] args)
    {
        // Задача №1
        System.out.println("Задача №1");
        int firstDeposit = 15000;
        int total = 0;
        int month = 0;
        while (total <= 2459000) {
            total = total + total / 100;
            total = total + firstDeposit;
            month = month + 1;
            System.out.println("Месяц " +  month + " , сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Итого накоплений " + total);
        System.out.println("Итого месяцев " + month);
        System.out.println("Итого лет " + month/12);

        // Задача №2
        System.out.println("Задача №2");
        int i = 1;
        while (i<10) {
            System.out.print(" " + i);
        }
        int k = 1;
        for (int k = 10; k >= 1; a--) ;{
            System.out.print(" " + a);
        }
            System.out.println(a);
            System.out.println(i);
        }

}

