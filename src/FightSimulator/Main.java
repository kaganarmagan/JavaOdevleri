package FightSimulator;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Fighter mike=new Fighter("Mike Tyson",18,105,101,20);
        Fighter evan=new Fighter("Evander Holyfield",15,102,98,25);

        Ring match=new Ring(mike,evan,85,110);
        match.run();


    }
}
