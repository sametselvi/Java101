import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int kg;

        double boy;

        Scanner inp = new Scanner(System.in);

        System.out.println("Lutfen kilonuzu giriniz : ");

        kg = inp.nextInt();

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");

        boy = inp.nextDouble();

        double vki = kg / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz : " + vki);

























    }
}
