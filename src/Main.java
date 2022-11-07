import java.sql.SQLOutput;

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
            System.out.println("New Values: dog="+dog+" cat="+cat+" paper="+paper);

        // Third task
        System.out.println(ANSI_RED + "Third task" + ANSI_RESET);
            dog = dog - 3.5;
            cat = cat - 1.6;
            paper = paper - 7639;
            System.out.println("New Values: dog="+dog+" cat="+cat+" paper="+paper);
    }
}