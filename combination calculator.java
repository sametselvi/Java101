import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Kombinasyon için küme sayısını giriniz : ");
        int n = input.nextInt();
        int totalN = 1 , totalX =1;
        int total;
        int subtractionF;


        for (int i = 1; i <= n; i++) {
            totalN = totalN * i;
        }


        System.out.print("Almak istediğiniz kombinasyon miktarını giriniz :  ");

        int r = input.nextInt();
        int totalR = 1;

        for (int i = 1; i <= r; i++){
            totalR =totalR * i;
        }

        subtractionF = n -r ;

        for (int i = 1; i <= subtractionF; i++){
            totalX = totalX * i;

        }
        total = totalN /(totalR *(totalX));

        System.out.print("Kombinasyon sonucu : " + total);








    }
}










