import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;

        Scanner input = new Scanner(System.in);

        System.out.println("Armut kilo miktarini giriniz : ");

        armutKilo = input.nextInt();

        double armutFiyat = armut * armutKilo;

        System.out.println("Elma kilo miktarini giriniz : ");
        elmaKilo = input.nextInt();

        double elmaFiyat = elma * elmaKilo;

        System.out.println("Domatesinizin kilo miktarini giriniz : ");

        domatesKilo = input.nextInt();

        double domatesFiyat = domates * domatesKilo;

        System.out.println("Muzun kilosunu giriniz : ");

        muzKilo = input.nextInt();
        double muzFiyat = muz * muzKilo;

        System.out.println("Patlicanin kilosunu giriniz : ");

        patlicanKilo = input.nextInt();

        double patlicanFiyat = patlican * patlicanKilo;

        double total = patlicanFiyat + muzFiyat + domatesFiyat + elmaFiyat + armutFiyat;

        System.out.println("Manavdaki toplam ücret tutarı : " + total + "TL");





































    }
}
