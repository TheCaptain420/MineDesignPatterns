package Factory;

public class RockHauler extends InfantryUnit {
    public RockHauler(int range, int armor, int hits, int damage) {
        super(range, armor, hits, damage);
    }

    public RockHauler(){super(5,5,100,1);}
}
