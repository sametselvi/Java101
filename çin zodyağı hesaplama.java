import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int year = 0, select;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your year of birth : ");

        year = input.nextInt();

        String burc = "";
        if (year > 1900 && year <= 2022) {
            if (year % 12 == 0) {
                burc = "Maymun";
            } else if (year % 12 == 1) {
                burc = "Horoz";
            } else if (year % 12 == 2) {
                burc = "Köpek";
            } else if (year % 12 == 3) {
                burc = "Domuz";
            } else if (year % 12 == 4) {
                burc = " Fare ";
            } else if (year % 12 == 5) {
                burc = "Öküz";
            } else if (year % 12 == 6) {
                burc = "Kaplan";
            } else if (year % 12 == 7) {
                burc = "Tavşan";
            } else if (year % 12 == 8) {
                burc = "Ejderha";
            } else if (year % 12 == 9) {
                burc = "Yılan";
            } else if (year % 12 == 10) {
                burc = "At";
            } else if (year % 12 == 11) {
                burc = "Koyun";
            }
            System.out.println("Burcunuz : " + burc);



        }else{
            System.out.println("HATALI BIR YIL GİRDİNİZ ! TEKRAR GİRİNİZ");
        }
    }


}

