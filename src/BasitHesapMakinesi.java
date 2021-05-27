import java.util.Scanner;

public class BasitHesapMakinesi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double num1, num2;
        String islem;

        System.out.println("Yapmak istediğiniz işlemi seçiniz :");
        islem = input.nextLine();

        System.out.println("Birinci sayıyı giriniz");
        num1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        num2 = input.nextInt();

        switch (islem) {
            case "*" -> System.out.println("İşlem sonucunuz :" + (num1 * num2));
            case "/" -> System.out.println("İşlem sonucunuz :" + (num2==0?"Sıfıra bölünemez!":num1/num2));
            case "+" -> System.out.println("İşlem sonucunuz :" + (num1 + num2));
            case "-" -> System.out.println("İşlem sonucunuz :" + (num1 - num2));
            default -> System.out.println("İşlem algılanamadı");
        }


    }
}
