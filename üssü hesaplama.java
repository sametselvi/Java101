import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int n, r;
        int total = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Üssü alınacak sayı : ");
        n = input.nextInt();

        System.out.print("Üs alınacak sayı : ");
        r = input.nextInt();

        for (int i = 1; i <= r; i++) {
            total *= n;

        }
        System.out.print("Cevap : " + total);


    }
}










