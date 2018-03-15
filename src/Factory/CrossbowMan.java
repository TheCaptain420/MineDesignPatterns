package Factory;

public class CrossbowMan extends InfantryUnit{
    public CrossbowMan(int range, int armor, int hits, int damage) {
        super(range, armor, hits, damage);
    }
    CrossbowMan(){super(20,5,5,10);}
}
