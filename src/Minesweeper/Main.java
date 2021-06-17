package Minesweeper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean f=true;
        int k=0;
        int n=0;
        do {
            System.out.print("Oyun alanı sütun sayısını yazınız : ");
            n = input.nextInt();
            if(n>0&&n<100){
                f=false;
            }else{
                System.out.println("Yanlış bir sayı girdiniz.");

            }
        }while (f);
        f=true;
        do {
            System.out.print("Oyun alanı satır sayısını yazınız : ");
            k=input.nextInt();

            if(k>0&&k<100){
                f=false;
            }else{
                System.out.println("Yanlış bir sayı girdiniz.");

            }
        }while (f);

        MineSweeper mine=new MineSweeper(n,k);
        mine.run();
    }
}
