import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {

    public static void main(String[] args) {
        int mat, fiz, kim, tr, mus, tar;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunu giriniz :");
        mat = input.nextInt();

        System.out.println("Fizik notunu giriniz :");
        fiz = input.nextInt();

        System.out.println("Kimya notunu giriniz :");
        kim = input.nextInt();

        System.out.println("Türkçe notunu giriniz :");
        tr = input.nextInt();

        System.out.println("Müzik notunu giriniz :");
        mus = input.nextInt();

        System.out.println("Tarih notunu giriniz :");
        tar = input.nextInt();

        double notOrtalamasi = (tar + mat + fiz + kim + tr + mus) / 6;


        String sinifGecme = notOrtalamasi >=60? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println("Ortalamanız :" + notOrtalamasi);
        System.out.println(sinifGecme);

    }
}