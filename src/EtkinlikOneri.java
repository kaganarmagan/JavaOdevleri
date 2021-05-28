import java.util.Scanner;

public class EtkinlikOneri {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double sicaklik;

        System.out.println("Hava sıcaklığını giriniz :");
        sicaklik= input.nextDouble();

        if (sicaklik<5){
            System.out.println("Kayak yapabilirsiniz.");
        }else if (sicaklik>=5&&sicaklik<=15){
            System.out.println("Sinemaya gidebilirsiniz.");
        }if (sicaklik>=10&&sicaklik<=25){
            System.out.println("Pikniğe gidebilirsiniz.");
        }else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }

}
