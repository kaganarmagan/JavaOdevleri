import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double armut,elma,domates,muz,patlican,total;

        System.out.println("Armut Kaç Kilo ? :");
        armut= input.nextDouble()*2.14;

        System.out.println("Elma Kaç Kilo ? :");
        elma= input.nextDouble()*3.67;

        System.out.println("Domates Kaç Kilo ? :");
        domates= input.nextDouble()*1.11;

        System.out.println("Muz Kaç Kilo ? :");
        muz= input.nextDouble()*0.95;

        System.out.println("Patlıcan Kaç Kilo ? :");
        patlican= input.nextDouble()*5.00;

        total=armut+elma+domates+muz+patlican;
        System.out.println("Toplam Tutar :"+total+" TL");

    }
}
