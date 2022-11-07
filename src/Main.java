public class Main {
    public static void main(String[] args) {
          final String ANSI_RED = "\u001B[31m"; // Красный цвет в консоле
          final String ANSI_RESET = "\u001B[0m";// Черный цвет в консоле

      /*First task*/
        System.out.println(ANSI_RED + "First task" + ANSI_RESET);
            var dog = 8.0;
            var cat = 3.6;
            var paper = 763789;
            System.out.println("dog="+dog+" cat="+cat+" paper="+paper);
        /*End First task*/

        // Second task
        System.out.println(ANSI_RED + "Second task" + ANSI_RESET);
             dog = dog +4;
             cat = cat +4;
             paper = paper +4;
            System.out.println("dog="+dog+" cat="+cat+" paper="+paper);

        // Third task
        System.out.println(ANSI_RED + "Third task" + ANSI_RESET);
            dog = dog - 3.5;
            cat = cat - 1.6;
            paper = paper - 7639;
            System.out.println("dog="+dog+" cat="+cat+" paper="+paper);

            //Fourth task
        System.out.println(ANSI_RED + "Fourth task" + ANSI_RESET);
            var friend = 19;
            System.out.println(friend);
            friend += 2;
            System.out.println(friend);
            friend /=7;
            System.out.println(friend);

            //Fifth task
        System.out.println(ANSI_RED + "Fifth task" + ANSI_RESET);
        var frog = 3.5;
        System.out.println(frog);
        frog *=10;
        System.out.println(frog);
        frog /=3.5;
        System.out.println(frog);
        frog+=4;
        System.out.println(frog);

            //Sixth task
        System.out.println(ANSI_RED + "Fifth task" + ANSI_RESET);
        var fighter1Weight = 78.2;
        var fighter2Weight = 82.7;
        var bothFighersWeight = fighter2Weight + fighter1Weight;
        System.out.println("Вес обоих бойцов: "+bothFighersWeight+" кг.");
        var differenceWeight = fighter1Weight - fighter2Weight;
        System.out.println("Разница 2х бойцов: "+differenceWeight+" кг.");

          // Seventh task
        System.out.println(ANSI_RED + "Seventh task" + ANSI_RESET);
        differenceWeight = fighter2Weight-fighter1Weight;
        System.out.println("Разница в весе бойцов (-) " + differenceWeight + " кг.");
        differenceWeight= fighter2Weight % fighter1Weight;
        System.out.println("Разница в весе бойвов (%) " + differenceWeight + " ))_кг.");
    }
}