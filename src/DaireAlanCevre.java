import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double radius,pi=3.14,alan,cevre,dilimAlan,angle;

        System.out.println("Dairenin yarıçapını giriniz :");
        radius=input.nextDouble();

        System.out.println("Merkez açısının ölçüsünü giriniz :");
        angle=input.nextDouble();


        cevre=pi*2*radius;
        alan=pi*radius*radius;
        dilimAlan=alan*angle/360;
        System.out.println("Dairenin cevresi :"+cevre);
        System.out.println("Dairenin alanı :"+alan);
        System.out.println("Daire diliminin alanı :"+dilimAlan);


    }
}
