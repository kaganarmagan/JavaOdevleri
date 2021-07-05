package SportScheduling;


import java.util.ArrayList;

public class GetFixtures {
    private boolean isAway=false;

    public void get(ArrayList<String> teams){
        System.out.println("Takımlar");
        for (String team:teams
        ) {
            System.out.println("- "+team);
        }
        if(teams.size()%2==1){ //Takım sayısının tek mi çift mi olduğunu sorgulayan scope.
            teams.add("Bay");
        }
        int totalRounds = teams.size() - 1;//Bir yarı içinde kaç hafta oynanacağını belirleyen integer.

        int matchPerRound=teams.size()/2; // Bir haftada oynana maç sayısı.

        ArrayList<String> dublicate=(ArrayList<String>) teams.clone();;//round-robin scheduling algoritması için dizinin ilk takımını çıkarıyoruz. geri kalan takımlar saat yönünde yer değiştirerek maçlarını yapıyor
        dublicate.remove(0);

        int teamsSize=dublicate.size();

        for(int day=0;day< totalRounds;day++){ //İlk yarı maçları.
            System.out.println("\n"+(day+1)+". Hafta");
            int teamIdx=day%teamsSize;
            if(isAway()){
                System.out.println(dublicate.get(teamIdx)+" vs "+teams.get(0));
                for (int idx=1;idx<matchPerRound;idx++){
                    int firstTeam=(day+idx)%teamsSize;
                    int secondTeam=(day+teamsSize-idx)%teamsSize;
                    System.out.println(dublicate.get(firstTeam)+" vs "+dublicate.get(secondTeam));
                }
            }else{
                System.out.println(teams.get(0)+" vs "+dublicate.get(teamIdx));
                for (int idx=1;idx<matchPerRound;idx++){
                    int firstTeam=(day+idx)%teamsSize;
                    int secondTeam=(day+teamsSize-idx)%teamsSize;
                    System.out.println(dublicate.get(secondTeam)+" vs "+dublicate.get(firstTeam));
                }
            }
        }for(int day=0;day< totalRounds;day++){ //İkinci yarı maçları.
            System.out.println("\n"+(day+1+totalRounds)+". Hafta");
            int teamIdx=day%teamsSize;
            if(isAway()){
                System.out.println(dublicate.get(teamIdx)+" vs "+teams.get(0));
                for (int idx=1;idx<matchPerRound;idx++){
                    int firstTeam=(day+idx)%teamsSize;
                    int secondTeam=(day+teamsSize-idx)%teamsSize;
                    System.out.println(dublicate.get(firstTeam)+" vs "+dublicate.get(secondTeam));
                }
            }else{
                System.out.println(teams.get(0)+" vs "+dublicate.get(teamIdx));
                for (int idx=1;idx<matchPerRound;idx++){
                    int firstTeam=(day+idx)%teamsSize;
                    int secondTeam=(day+teamsSize-idx)%teamsSize;
                    System.out.println(dublicate.get(secondTeam)+" vs "+dublicate.get(firstTeam));
                }
            }
        }
    }

    private boolean isAway(){
        this.isAway=!this.isAway;
        return this.isAway;
    }

}
