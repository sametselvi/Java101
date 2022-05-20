import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        int number ;
        int  value , total =0;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayıyı giriniz : ");
        number = input.nextInt();

        int tempNumber = number;

        while ( tempNumber != 0){
            value = tempNumber % 10;


            total += value;



            tempNumber /=10;
        }
        System.out.print(total);




    }
}
