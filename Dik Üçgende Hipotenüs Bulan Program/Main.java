import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        double c, u, d;

        Scanner input = new Scanner(System.in);
        System.out.println("1.kenari giriniz : ");
        a = input.nextInt();
        System.out.println("2.kenari giriniz : ");
        b = input.nextInt();
        System.out.println("3. kenari giriniz : ");
        c = input.nextDouble();

        u = (a + b + c) / 2;
        //d alana eşittir.

        d = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Alani : " + d);


















    }
}
