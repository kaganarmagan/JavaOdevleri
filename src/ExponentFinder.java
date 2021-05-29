import java.util.Scanner;

public class ExponentFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int var, i, k = 4, l = 5;

        System.out.println("Lütfen bir sayı giriniz :");
        var = input.nextInt();
        if (var >= 1) {
            System.out.println("" + 1);

            for (i = 1; i < var; i++) {
                if (i % k == 0) {
                    System.out.println("" + i);
                    k *= 4;
                } else if (i % l == 0) {
                    System.out.println("" + i);
                    l *= 5;
                }
            }
        }else{
            System.out.println("Uygun bir sayı girmediniz.");
        }
    }
}
