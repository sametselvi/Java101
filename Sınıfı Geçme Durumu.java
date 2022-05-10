import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math, physics, turkish, chemistry, music;


        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz : ");
        math = input.nextInt();


        System.out.println("Fizik notunuzu giriniz : ");

        physics = input.nextInt();


        System.out.println("Türkçe notunuzu giriniz : ");
        turkish = input.nextInt();

        System.out.println("Kimya notunuzu giriniz : ");

        chemistry = input.nextInt();

        System.out.println("Müzik notunuzu giriniz : ");

        music = input.nextInt();

        double average, genelOrt;
        average = 0;

        if (music > 0 && music < 100) {
             average += music;

        }
        if (chemistry > 0 && chemistry < 100) {
             average += chemistry;
        }
        if (turkish > 0 && turkish < 100) {
             average += turkish;
        }
        if (physics > 0 && physics < 100) {
            average += physics;
        }
        if (math > 0 && math < 100) {
            average += math;

        }
        average = average /5;


        if(average > 55){
            System.out.println("Tebrikler sınıfı geçtiniz : "  + average);
        }else{
            System.out.println("Seneye görüşmek üzere : " + average);
        }
    }
}




