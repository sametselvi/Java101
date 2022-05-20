public class Main {


    public static void main(String[] args) {
        int k = 999;

        for (int number = 1; number <= k; number++) {
            int tempNumber = number;
            int basValue;
            int basPow;
            int result = 0, basNumber = 0;

            while (tempNumber != 0) {
                tempNumber /= 10;
                basNumber++;

            }
            tempNumber = number;
            while (tempNumber != 0) {
                basValue = tempNumber % 10;
                basPow = 1;
                for (int i = 1; i <= basNumber; i++) {
                    basPow *= basValue;
                }
                result += basPow;
                tempNumber /= 10;


            }
            if (result == number) {
                System.out.println(number + "sayısı Armstrong sayıdır . ");


            }
        }
    }
}
