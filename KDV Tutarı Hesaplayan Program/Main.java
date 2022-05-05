import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tutar, sonuc, kdvoranı = 0.18, kdv2oranı = 0.08, uygulama1, uygulama2, toplam1, toplam2;

        Scanner inp = new Scanner(System.in);

        System.out.println("Fiyat tutarini giriniz : ");
        tutar = inp.nextDouble();
        // Tutar uygulama1 0- 1000 arası büyükse uygulama2 uygulanacak.
         uygulama1 = tutar * kdvoranı;
         uygulama2 = tutar * kdv2oranı;
         toplam1 = tutar + uygulama1;
         toplam2 = tutar + uygulama2;

        sonuc = (tutar >= 1000) ? toplam2 : toplam1;
        System.out.println("KDV'li tutar" + sonuc);

















    }
}
