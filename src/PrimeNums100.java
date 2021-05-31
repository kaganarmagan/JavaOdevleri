public class PrimeNums100 {
    public static void main(String[] args) {
        int k= 100;
        for(int i=2;i<k;i++){
            int c=0;
            for (int t=2;t<=i;t++){
                if(i%t==0){
                    c++;
                }
            }
            if(c==1){
                System.out.print(i+" ");
            }
        }
    }
}
