import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,total=0;


        while(true){
            System.out.println("Lütfen sayı giriniz :");
            num= input.nextInt();

            if(num/10<1){
                System.out.println("Toplam :"+total);
                break;
            }else if(num%4==0){
                total+=num;
            }
        }





    }
}
