import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int age, km, select;
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the total km : ");
        km = input.nextInt();

        System.out.print("Please enter your age : ");
        age = input.nextInt();


        System.out.println("Please enter the  type of passenger(1-One way 2- Round Trip)");
        select = input.nextInt();
        double nPayment = 0.10, ticketPrice, p1, p2, p3, p4, p5, p6, p7, p8, total = 0;
        double age1 = 0.50, age2 = 0.10, age3 = 0.30, roundTrip = 0.20;

        ticketPrice = km * nPayment;
        p1 = ticketPrice - (ticketPrice * age1);
        // For  children whose age are below the 12

        p2 = ticketPrice - (ticketPrice * age2);
        //      12<  A person age is < 24

        p3 = ticketPrice - (ticketPrice * age3);

        //     A person age > 65


        p4 = p1 - (p1 * roundTrip);
        p5 = 2 * p4;
        //   Round Trip for  children whose age are below the 12
        p6 = 2 * (p2 - (p2 * roundTrip));
        //   Round Trip   12<  A person age is < 24
        p7 = 2 * (p3 - (p3 * roundTrip));
        //   Round Trip  A person age > 65
        p8 = 2* (ticketPrice - (ticketPrice * roundTrip));
        // Normal person flight ticket fee

        String totalExpenses = "Turkish Lira";


        switch (select) {
            case 1:
                if (age > 0 && km > 0) {

                    if (age > 0 && age < 12) {
                        total = p1;

                    } else if (age > 12 && age < 24) {

                        total = p2;


                    } else if (age > 65) {
                        total = p3;
                    } else {
                        total = ticketPrice;


                    }

                } else {
                    isError = true;

                }
                break;
            case 2:
                if (age > 0 && km > 0) {
                    if (age > 0 && age < 12) {
                        total = p5;
                    } else if (age > 12 && age < 24) {

                        total = p6;
                    } else if (age > 65) {
                        total = p7;
                    } else {
                        total = p8;
                    }
                    break;
                }
            default:
                isError = true;

        }
        if (isError) {
            System.out.println("The given information is wrong, please try again! ");

        } else {
            System.out.println(total + totalExpenses);

        }
    }
}
