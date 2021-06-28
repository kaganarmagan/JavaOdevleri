package ActionGame.Characters;

import ActionGame.Inventory;

public class Archer extends Player{
    public Archer( String name) {
        super(new Inventory(), 7, 18, 20, "Okçu", name,2);
    }
}
