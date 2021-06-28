package ActionGame.Characters;

import ActionGame.Inventory;

import java.util.Scanner;

public class Player {
    static Scanner input=new Scanner(System.in);
    Inventory inventory;
   private int ID;
    private int damage;
   private int health;
   private int money;
   private String name;
private String charName;


    public Player(Inventory inventory, int damage, int health, int money, String charName,String name,int id) {
        this.ID=id;
        this.inventory = inventory;
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.charName = charName;
        this.name=name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getDamage() {
        return damage+this.inventory.getWeapon().getFeature();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public static Player selectChar(){
        System.out.print("Karakterinizin adını giriniz : ");
        String name=input.next();

        Player[] array={new Samurai(name),new Archer(name),new Knight(name)};
        while (true){
            System.out.println("=============================================");
            for (Player charP:array)
                System.out.println(charP.getID()+"-"+charP.getCharName()+"  "+"hasar:"+ charP.getDamage()+"\tsağlık:"+ charP.getHealth()+"\tpara:"+ charP.getMoney());

            System.out.print("""
            =============================================
            Oynamak istediğiniz karakteri seçiniz : """);
            int choice= input.nextInt();

            if(choice==1||choice==2||choice==3){
                switch (choice){
                    case 1:
                        return array[0];
                    case 2:
                        return array[1];
                    case 3:
                        return array[2];
                }
            }else{
                System.out.println("Yanlış bir değer girdiniz");
            }
        }
    }
}
