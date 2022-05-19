import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int k;
        int total =0;


        Scanner input = new Scanner(System.in);


        do{
            System.out.print("Lütfen sayı girin : ");

            k = input.nextInt();
            if(k % 4 ==0){
                total += k;
            }



        }while( k % 2 ==0);
        System.out.println("Total : " + total);






    }
}









