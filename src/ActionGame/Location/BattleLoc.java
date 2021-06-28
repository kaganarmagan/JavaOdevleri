package ActionGame.Location;

import ActionGame.Characters.Player;
import ActionGame.Obstacle.Obstacle;

import java.util.Random;

public abstract class BattleLoc extends Location {
    Random random=new Random();
    private Obstacle[] obstacles;
    public BattleLoc(Player player, String name){
        super(player,name);

    }

    public Obstacle[] getObstacles() {
        return obstacles;
    }

    public void setObstacles(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }
    public boolean isDead() {
        return player.getHealth() < 1;
    }
    public boolean doContinue() {
        System.out.println("========================");
        System.out.print("\tSavaş zorlaşıyor!\n1-Devam 0-Kaç :");
        int k= input.nextInt();
        return k == 0;
    }
    void combat(Obstacle o){
        boolean whoStarts=random.nextBoolean();
        while (player.getHealth() > 0 && o.getHealth() > 0) {
            System.out.println("======== YENİ ROUND ===========");

            if(whoStarts) {
                o.setHealth(o.getHealth()- player.getDamage());
                if (isWin(o)) {
                    break;
                }
                player.setHealth(player.getHealth()-(o.getDamage() - player.getInventory().getArmor().getFeature()));

            }else{
                player.setHealth(player.getHealth()-(o.getDamage() - player.getInventory().getArmor().getFeature()));
                if (isWin(o)){
                    break;
                }
                o.setHealth(o.getHealth()- player.getDamage());


            }
            if (isWin(o)){
                break;
            }
            printScore(o);

        }
    }

    boolean isWin(Obstacle o) {
        if (o.getHealth() == 0) {
            System.out.println("Savaşı Kazanan : " + player.getName());
            return true;
        } else if (player.getHealth() == 0){
            System.out.println("Savaşı Kazanan : " + o.getName());
            return true;
        }

        return false;
    }
    void printScore(Obstacle o) {
        System.out.println("------------");
        System.out.println(player.getName() + " Kalan Can \t:" + player.getHealth());
        System.out.println(o.getName() + " Kalan Can \t:" + o.getHealth());
    }
}
