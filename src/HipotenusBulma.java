import java.util.Scanner;
import java.lang.Math;

public class HipotenusBulma {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double kenarA,kenarB,kenarC,cevre,uParam,alan;

        System.out.println("Birinci kenar uzunluğunu giriniz :");
        kenarA= input.nextDouble();

        System.out.println("İkinci kenar uzunluğunu giriniz :");
        kenarB= input.nextDouble();

        System.out.println("Üçüncü kenar uzunluğunu giriniz :");
        kenarC= input.nextDouble();

        //kenarC=Math.sqrt(kenarB*kenarB+kenarA*kenarA); Ödev 3 kenarı da kullanıcıdan alın dediği için yorum satırına aldım

        cevre=kenarA+kenarB+kenarC;

        uParam=cevre/2;
        alan=Math.sqrt(uParam*(uParam-kenarA)*(uParam-kenarB)*(uParam-kenarC));

        System.out.println("Üçgenin alanı :"+alan);










    }
}
