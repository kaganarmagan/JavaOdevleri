package ActionGame.Tool;

public class Tool {
    private int money;
    private int feature;
    private String name;

    public Tool(int money, int feature, String name) {
        this.money = money;
        this.feature = feature;
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getFeature() {
        return feature;
    }

    public void setFeature(int feature) {
        this.feature = feature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
