package Factory;

public class CrossbowMan extends InfantryUnit{
    public CrossbowMan(int range, int armor, int hits, int damage,String name) {
        super(range, armor, hits, damage,name);
    }
    CrossbowMan(){super(20,5,5,10,"CrossbowMan");}
}
