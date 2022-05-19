import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sayıyı giriniz : ");

        int k;
        k= input.nextInt();


        int i =0;
        while ( i <=k){
            i ++;
            if ( i %2 ==0 ){
                System.out.println(i);
            }
        }


    }
}









