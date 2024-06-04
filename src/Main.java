import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DrunkedWalk dw = new DrunkedWalk();

        System.out.println("Level size:");
        int lvlsize = sc.nextInt();

        System.out.println("How many steps?:");
        int steps = sc.nextInt();

        dw.lvlGenerator(lvlsize, steps);
    }
}