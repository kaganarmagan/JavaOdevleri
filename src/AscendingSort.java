import java.util.Scanner;

public class AscendingSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Birinci sayıyı giriniz :");
        num1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz :");
        num2 = input.nextInt();
        System.out.println("Üçüncü sayıyı giriniz :");
        num3 = input.nextInt();

        if (num1 > num2 && num2 > num3) {
            System.out.println("Sıralama :" + num3 + "," + num2 + "," + num1);
        } else if (num2 > num1 && num1 > num3) {
            System.out.println("Sıralama :" + num3 + "," + num1 + "," + num2);
        } else if (num3 > num2 && num2 > num1) {
            System.out.println("Sıralama :" + num1 + "," + num2 + "," + num3);
        } else if (num3 > num1 && num1 > num2) {
            System.out.println("Sıralama :" + num2 + "," + num1 + "," + num3);
        } else if (num2 > num3 && num3 > num1) {
            System.out.println("Sıralama :" + num1 + "," + num3 + "," + num2);
        } else {
            System.out.println("Sıralama :" + num2 + "," + num3 + "," + num1);
        }

    }
}
