package Factory;

public class Musketeer extends InfantryUnit {
    public Musketeer(int range, int armor, int hits, int damage, String name) {
        super(range, armor, hits, damage, name);

    }
    Musketeer(){super(1,20,100,5,"Musketeer");}
}
