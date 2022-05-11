import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen 1. sayıyı giriniz : ");

        a = input.nextInt();

        System.out.print("Lütfen 2.sayıyı giriniz : ");

        b = input.nextInt();

        System.out.print("Lütfen 3.sayıyı giriniz : ");

        c = input.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println(" a < b < c' dir.");
            }else{
                System.out.println(" a < c < b");
            }
        } else if ((b < a) &&( b < c)) {
            if (a < c) {
                System.out.println("b < a < c' dir.");
            }else{
                System.out.println("b < c < a' dir.");
            }
        }else{
            if (a <b) {
                System.out.println("c < a < b'dir.");
            }else{
                System.out.println("c < a < b'dir.");
            }
        }


    }
}








