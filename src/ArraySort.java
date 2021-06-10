import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int k=input.nextInt();

        int []  list=new int[k];

        System.out.println("Dizinin elemanlarını giriniz :");

        for(int i=0;i<list.length;i++){
            System.out.print((i+1)+". Elemanı : ");
            list[i]= input.nextInt();
        }
        Arrays.sort(list);
        System.out.print("Sıralama : ");
        for(int i:list){
            System.out.print(i+" ");
        }



    }






}
