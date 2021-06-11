import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Matris satır sayısını giriniz : ");
        int  n=input.nextInt();
        System.out.print("Matris sütun sayısını giriniz : ");
        int  k=input.nextInt();

        int [][] matrix=new int[n][k];
        int[][]transpose=new int[k][n];

        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(i+1+". satır "+(j+1)+". sütun sayısını giriniz : ");
                matrix[i][j]=input.nextInt();
            }
        }

        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                transpose[j][i]=matrix[i][j];
            }
        }

        System.out.println("Matris :");
        for (int[] row:matrix){
            for (int col : row) {
                System.out.print(col + "    ");
            }
            System.out.println();
        }

        System.out.println("Transpoze :");
        for (int[] row:transpose){
            for (int col : row) {
                System.out.print(col + "    ");
            }
            System.out.println();
        }

    }
}
