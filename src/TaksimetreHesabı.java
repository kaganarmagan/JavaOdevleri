import java.util.Scanner;

public class TaksimetreHesabı {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double km,kmTl=2.20,tutar=10,hesap;


        System.out.println("Mesafeyi giriniz(km) :");
        km=input.nextDouble();

        tutar=tutar+km*kmTl; //açılış tutarı 10 TL olarak tanımlandı kullanım ücreti üstüne eklendi
        hesap=tutar>=20?tutar:20; //toplam tutarın 20 tlyi aşıp aşmadığı kontrol edildi

        System.out.println("Ödemeniz gereken tutar :" + hesap +" TL");

    }
}
