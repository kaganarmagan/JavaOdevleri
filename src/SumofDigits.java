import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0, num, d;

        System.out.println("Lütfen sayıyı giriniz :");
        num = input.nextInt();

        while (num != 0) {
            d = num % 10;
            num /= 10;
            total += d;
        }
        System.out.println("Basamaklar toplamı :" + total);
    }
}