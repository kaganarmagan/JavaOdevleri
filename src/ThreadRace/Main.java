package ThreadRace;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        ArrayList<Integer> evenNumbers=new ArrayList<>();
        ArrayList<Integer> oddNumbers=new ArrayList<>();
        for(int i=1;i<10001;i++){
            numbers.add(i);
        }
        ArrayList<Integer> sublist1=new ArrayList<>(numbers.subList(0,2500));
        ArrayList<Integer> sublist2=new ArrayList<>(numbers.subList(2500,5000));
        ArrayList<Integer> sublist3=new ArrayList<>(numbers.subList(5000,7500));
        ArrayList<Integer> sublist4=new ArrayList<>(numbers.subList(7500,10000));

        Thread t1=new Thread(new SeparatorThread(sublist1,oddNumbers,evenNumbers));
        t1.start();
        Thread t2=new Thread(new SeparatorThread(sublist2,oddNumbers,evenNumbers));
        t2.start();
        Thread t3=new Thread(new SeparatorThread(sublist3,oddNumbers,evenNumbers));
        t3.start();
        Thread t4=new Thread(new SeparatorThread(sublist4,oddNumbers,evenNumbers));
        t4.start();


    }
}
