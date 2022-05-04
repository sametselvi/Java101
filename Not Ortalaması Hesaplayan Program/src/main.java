import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuzu giriniz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuzu giriniz : ");
        muzik = inp.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double sonuc = toplam / 6;

        System.out.println("Ortalamanız : " + sonuc);

        String str = sonuc >= 60.0 ? "Gecti" : "Kaldı";

        System.out.println(str);

    }
}





