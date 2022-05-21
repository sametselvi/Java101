import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please click any button for diamond. : ");
        int n = input.nextInt();

        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= (5 - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");

            }
            System.out.println();

        }
        for (int a = 1; a <= 4; a++) {
            for (int l = 1; l <= (a); l++) {
                System.out.print(" ");
            }
            for (int f = 1; f <= (9 - 2 * a); f++) {
                System.out.print("*");

            }
            System.out.println();


        }

    }
}