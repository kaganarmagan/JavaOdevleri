package SportScheduling;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        ArrayList<String> teams=new ArrayList<>();
        GetFixtures fixture=new GetFixtures();
        teams.add("Fenerbahçe");
        teams.add("Galatasaray");
        teams.add("Beşiktaş");
        teams.add("Trabzonspor");
        teams.add("Başakşehir");
        teams.add("Bursaspor");
        //teams.add("Boluspor");
        Collections.shuffle(teams);   //Oluşturulan listeyi karıştırdım. Çünkü ArrayList lerr giriş sırasına göre index veriyor bu da her seferinde aynı fikstürü almamıza neden oluyor.


        fixture.get(teams);

    }
}
