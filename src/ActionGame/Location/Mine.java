package ActionGame.Location;

import ActionGame.Characters.Player;
import ActionGame.Obstacle.*;
import ActionGame.Tool.*;


public class Mine extends BattleLoc {
    Obstacle[] snakes;
    private final Weapon[] weapons={new Rifle(),new Sword(),new Gun()};
    private final Armor[] armors={new HeavyArmor(),new MedArmor(),new LightArmor()};
    public Mine(Player player) {
        super(player, "Maden");
        this.snakes = new Obstacle[random.nextInt(5) + 1];
        for (int i = 0; i < snakes.length; i++) {
            int damage = (random.nextInt(4) + 3);
            snakes[i] = new Snake(damage);
        }
    }

    @Override
    public boolean onLocation() {
        System.out.println("===========================================");
        System.out.println("Bölge düşmanı :" + snakes[0].getName() + "(1-5)" +
                "\n\thasar  : " + snakes[0].getDamage() +
                "\n\tsağlık : " + snakes[0].getHealth() +
                "\n\tödül   : Altın/Zırh/Silah ");

        System.out.print("1-Savaş 0-Çıkış  :");

        while (true) {
            int k = input.nextInt();
            switch (k) {
                case 0:
                    return true;
                case 1: {
                    for (Obstacle snake : snakes) {
                        combat(snake);
                        if (isDead()) {
                            return false;
                        }
                        takeReward();

                        System.out.println("==============================");
                        System.out.println("Silahınız :"+player.getInventory().getWeapon().getName()+"\tZırhınız :"+player.getInventory().getArmor().getName()+"\t\tHasar :"+player.getDamage()+"\t\tSağlık :"+player.getHealth()+"\t\tPara :"+player.getMoney());
                        if (doContinue()) {
                            return true;
                        }

                    }

                    return true;
                }
                default:
                    System.out.println("Yanlış bir değer girdiniz.");
                    break;
            }

        }
    }

    private void takeReward() {
        int k=random.nextInt(101);
        int l=random.nextInt(101);
        if(k<16){
            if (l<21){
                doWant(weapons[0]);
            }else if(l<51){
                doWant(weapons[1]);
            }else{
                doWant(weapons[2]);
            }
        }else if(k<31){
            if (l<21){
                doWant(armors[0]);
            }else if(l<51){
                doWant(armors[1]);
            }else{
                doWant(armors[2]);
            }
        }else if(k<56){
            if (l<21){
                player.setMoney(player.getMoney()+10);
            }else if(l<51){
                player.setMoney(player.getMoney()+5);
            }else{
                player.setMoney(player.getMoney()+1);
            }
        }

    }
    public void doWant(Weapon a){
        System.out.print(a.getName()+" kazandınız kullanmak ister misiniz ?\n1-Evet 0-Hayır :");
        int k=input.nextInt();
        if (k==1){
            player.getInventory().setWeapon(a);
        }
    }
    public void doWant(Armor a){
        System.out.print(a.getName()+" kazandınız kullanmak ister misiniz ?\n1-Evet 0-Hayır :");
        int k=input.nextInt();
        if (k==1){
            player.getInventory().setArmor(a);
        }
    }
    public boolean isFinished(Obstacle o){
        return snakes[snakes.length - 1] == o;
    }
}
