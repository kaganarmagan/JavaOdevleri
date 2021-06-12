import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class NumberGuessing {
    public static void main(String[] args) {
        Random rand = new Random();
        int k = rand.nextInt(100);
        int number;
        int attempts = 0;
        int[] inserts = new int[10];
        boolean isWin = false;
        boolean isWrong = false;
        Scanner input = new Scanner(System.in);

        while (attempts < 10) {
            System.out.print("Lütfen tahmininizi giriniz : ");
            number = input.nextInt();

            if (number < 0 || number > 99) {
                System.out.print("Yanlış bir sayı girdiniz.");
                if (isWrong) {
                    attempts++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (10 - attempts));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }
            if (number == k) {
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğiniz sayı : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz !");
                if (number > k) {
                    System.out.println(number + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(number + " sayısı, gizli sayıdan küçüktür.");
                }

                inserts[attempts++] = number;
                System.out.println("Kalan hakkınız : " + (10 - attempts));
            }
        }
        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(inserts));


            }
        }
    }
}


