import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, nPassword;
        int select = 1;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı Adini giriniz : ");
        userName = inp.nextLine();

        System.out.print("Sifrenizi giriniz : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız ! ");
        } else {
            System.out.println("Bilgileriniz yanlış ! ");
            System.out.println("Şifrenizi sıfırlamak icin 1 e tıklayınız.");

            select = inp.nextInt();
            if (select != 1) {
                System.out.println("Lütfen şifreyi değiştirmek için 1 tuşunu giriniz !");
            }else{
                System.out.println("Yeni şifrenizi giriniz ! ");

            }


            switch (select) {
                case 1 :
                    Scanner input=new Scanner(System.in);
                    nPassword = input.nextLine();
                    if (!nPassword.equals("java123")) {
                        System.out.println("Şifre oluşturuldu !");
                    }else{
                        System.out.println("Sifreniz hatali, lütfen farkli  sifre giriniz !");

                    }break;


            }


        }


    }
}
