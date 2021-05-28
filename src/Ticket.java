import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double  distance,total;
        int type, age;
        boolean a = true, t = true,d=true;


        System.out.println("Mesafeyi giriniz(km) :");
        distance = input.nextDouble();
        distance=distance*0.10;
        if (distance < 0 ) { //mesafenin eksi girilmemesini takip eden scope
            System.out.println("Hatalı veri girdiniz!");
            System.exit(0);
        }

        System.out.println("Yaşınızı giriniz :");
        age = input.nextInt();
        if (age < 0||age>110 ) { //yaşın eksi girilmemesini takip eden scope
            System.out.println("Hatalı veri girdiniz!");
            System.exit(0);
        }

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        type = input.nextInt();
        if(!(type==1||type==2)){     // yolculuk tipi bölümüne 1 veya 2 yazılmasını takip eden scope
            System.out.println("Hatalı Veri Girdiniz!");
            System.exit(0);
        }

        if (age<12){  //yaş kategorisini takip eden scope
            total=distance-(distance*0.50);
        }else if(age < 24){
            total=distance-(distance*0.10);
        }else if(age>=65){
            total=distance-(distance*0.30);
        }else{
            total=distance;
        }

        if(type==2){   //yolculuk tipi seçiminin işlemini yapan scope
            total=2*(total-(total*0.2));
        }
        System.out.println("Toplam Tutar ="+total+" TL");
    }
}
