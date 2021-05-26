import java.util.Scanner;

public class BodyMass {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        double height,weight,bmi;

        System.out.println("Kilonuzu giriniz :");
        weight= inp.nextDouble();

        System.out.println("Boyunuzu (metre cinsinden) giriniz :");
        height= inp.nextDouble();

        bmi=weight/(height*height);

        System.out.println("Vücut Kitle İndeksiniz :"+bmi);

    }
}
