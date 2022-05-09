import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);

        System.out.print("Ilk sayıyı giriniz : ");

        n1 = input.nextInt();

        System.out.println("Ikinci sayiyi giriniz : ");

        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Cıkarma\n3-Carpma\n4-Bolme");
        System.out.println("Seciniz : ");

        select = input.nextInt();


        switch (select) {
            case 1:
                System.out.println("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Cıkarma : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Carpma : " + (n1 - n2));
                break;
            case 4:
                if (n2 != 0) {

                    System.out.println("Bolme : " + (n1 / n2));
                } else {
                    System.out.println("Bolunemez");
                }
                break;

            default:
                System.out.println("Hatali giris yaptiniz. Tekrar deneyiniz.");
        }
    }
}