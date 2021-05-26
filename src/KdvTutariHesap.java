import java.util.Scanner;

public class KdvTutariHesap {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double fiyat,sonuc;

        System.out.println("Fiyat giriniz :");
        fiyat=input.nextDouble();

        sonuc=fiyat>=1000? fiyat*1.08:fiyat*1.18;

        System.out.println("Kdv'siz fiyat :"+fiyat+" TL");
        System.out.println("Kdv'li fiyat :"+sonuc+" TL" );
        System.out.println("Kdv tutarı :"+(sonuc-fiyat) +" TL");
        System.out.println(fiyat>=1000?"KDV Oranı :8%":"KDV Oranı :18%");



    }
}
