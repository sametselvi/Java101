import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;

        double pi = 3.14;
        double a;



       Scanner input = new Scanner(System.in);

        System.out.println("Dairenin yari capini giriniz : ");


        r = input.nextInt();

        System.out.println("Dairenin merkez acisi olcusunu giriniz: ");

        a = input.nextDouble();




        double alan = (pi * (r * r)*a) / 360;



        System.out.println("Dairenin Alanı : " + alan);






















    }
}
