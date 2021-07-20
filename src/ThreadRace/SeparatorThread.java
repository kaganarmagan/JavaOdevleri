package ThreadRace;

import java.util.ArrayList;

public class SeparatorThread implements Runnable{
    private ArrayList<Integer> array;
    private ArrayList<Integer> odd;
    private ArrayList<Integer> even;

    public SeparatorThread(ArrayList<Integer> array, ArrayList<Integer> odd, ArrayList<Integer> even) {
        this.array = array;
        this.odd = odd;
        this.even = even;
    }

    @Override
    public void run() {
        for (Integer a:this.array
             ) {
            if(a%2==1){
                this.odd.add(a);
                System.out.println(Thread.currentThread().getName()+" tek listesine ekledi => "+a);
            }else{
                this.even.add(a);
                System.out.println(Thread.currentThread().getName()+" çift listesine ekledi => "+a);
            }
        }
    }

    public ArrayList<Integer> getArray() {
        return array;
    }

    public void setArray(ArrayList<Integer> array) {
        this.array = array;
    }

    public ArrayList<Integer> getOdd() {
        return odd;
    }

    public void setOdd(ArrayList<Integer> odd) {
        this.odd = odd;
    }

    public ArrayList<Integer> getEven() {
        return even;
    }

    public void setEven(ArrayList<Integer> even) {
        this.even = even;
    }
}
