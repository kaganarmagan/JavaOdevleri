import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int year;

        System.out.println("Yıl Giriniz :");
        year= input.nextInt();

        if (year%100==0){
            if (year%400==0){
                System.out.println(year+" bir artık yıldır !");
            }else{
                System.out.println(year+" bir artık yıl değildir !");
            }
        }else if(year%4==0){
            System.out.println(year+" bir artık yıldır !");
        }else{
            System.out.println(year+" bir artık yıl değildir !");
        }
    }
}
