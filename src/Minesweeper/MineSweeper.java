package Minesweeper;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    boolean f=true;
    int win;
    int col;
    int row;
    String[][] board;
    String[][] duplicate;
    int [] bomb;
    MineSweeper(int col,int row){
        this.col=col;
        this.row=row;
        this.board=new String[this.row][this.col];
        this.duplicate=new String[this.row][this.col];
        this.bomb=new int[this.row*this.col];
        this.win=this.col*this.row;
        Random rand = new Random();
        for (String[] strings : this.board) {
            Arrays.fill(strings, "-");
        }   // boardu oluşturan loop

        int c= 1;
        for(int i=0;i<this.bomb.length;i++) {
            this.bomb[i] = c;
            c++;
        }// sıralı bomba arrayi oluşturan loop


        for (int i = 0; i < this.bomb.length; i++) {
            int randomIndexToSwap = rand.nextInt(this.bomb.length);
            int temp = this.bomb[randomIndexToSwap];
            this.bomb[randomIndexToSwap] = this.bomb[i];
            this.bomb[i] = temp;
        }//bomba arrayini rasgele dağıtan loop
        c=0;
        for(int i=0;i<this.duplicate.length;i++){
            for(int j=0;j<this.duplicate[i].length;j++){
                if(this.bomb[c]%4==0){
                    this.duplicate[i][j]="*";
                }else{
                    this.duplicate[i][j]="-";
                }
                c++;
            }
        }//kontrol arrayini oluşturan loop
    }
    void run(){// oyunun oynandığı scope

        System.out.println("===========================");
        System.out.println("Mayınların Konumu");
        printBoard(this.duplicate);
        System.out.println("===========================");
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz !");
        printBoard(this.board);
        do {


            int k=getNumber(this.row,"Satır Giriniz : ");
            int b=getNumber(this.col,"Sütun Giriniz : ");
            if(this.board[b][k].equals("-")) {
                this.win--;
            }
            isOver(k,b);
            mineCount(k,b);
            isWin();
            printBoard(this.board);
            System.out.println("===========================");
        }while(f);


    }

    void isOver(int b,int k){// manyına denk gelindiğini anlayan method
        if(this.duplicate[b][k].equals("*")){
            System.out.println("Game Over!!");
            this.board[b][k]="*";
            printBoard(this.board);
            System.out.println("===========================");
            System.exit(0);
        }

    }


    boolean isWin(){ //oyunun sonlandığını anlayan loop
        if(this.win==(this.row*this.col/4)){
            System.out.println("Oyunu Kazandınız !");
            return this.f=false;
        }
        return true;
    }

    int getNumber(int k,String r){ // satır ve sütun numarası alan method
        boolean a=true;
        Scanner input=new Scanner(System.in);
        int l=0;
        while(a) {
            System.out.print(r);
            l = input.nextInt();
            if(l>=k||l<0){
                System.out.println("Yanlış bir sayı girdiniz.");
            }else{
                a=false;
            }
        }
        return l;
    }

    void printBoard(String[][] a){ //boardun ilk durumunu gösteren method
        for (String[] b:a){
            for (String c:b){
                System.out.print(c +" ");
            }
            System.out.println();

        }
    }

    void mineCount(int a ,int k){ //seçilen bölüm mayınsızsa etrafında kaç mayın olduğunu hesaplayan method
        int c=0;
        if((a-1)>-1){
            if(this.duplicate[a - 1][k].equals("*")){
                c++;
            }if((k-1)>-1){
                if(this.duplicate[a - 1][k-1].equals("*")) {
                    c++;
                }

            }if((k+1)<this.row){
                if(this.duplicate[a-1][k+1].equals("*")){
                    c++;
                }
            }
        }if((a+1)<this.row){
            if(this.duplicate[a +1][k].equals("*")){
                c++;
            }if((k-1)>-1){
                if(this.duplicate[a +1][k-1].equals("*")) {
                    c++;
                }

            }if((k+1)<this.row){
                if(this.duplicate[a+1][k+1].equals("*")){
                    c++;
                }
            }
        }if((k-1)>-1){
            if(this.duplicate[a ][k-1].equals("*")) {
                c++;
            }

        }if((k+1)<this.row){
            if(this.duplicate[a][k+1].equals("*")){
                c++;
            }
        }this.board[a][k]=c+"";


    }


}
