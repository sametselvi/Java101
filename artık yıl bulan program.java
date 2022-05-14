import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int year ;
        String yıl = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen yılı giriniz : ");

        year = input.nextInt();

        if (year % 4 == 0) {
            yıl = "Artık yıl";
        } else if (year % 100 == 0 && year % 4 == 0) {
            yıl = "Artık yıl";
        } else {
            yıl = "Artık yıl değildir.";



        }
        System.out.println(yıl);
    }
}