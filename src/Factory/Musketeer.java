package Factory;

public class Musketeer extends InfantryUnit {
    public Musketeer(int range, int armor, int hits, int damage) {
        super(range, armor, hits, damage);

    }
    Musketeer(){super(1,20,100,5);}
}
