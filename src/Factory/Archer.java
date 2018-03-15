package Factory;

public class Archer extends InfantryUnit {
    public Archer(int range, int armor, int hits, int damage,String name) {
        super(range, armor, hits, damage,name);
    }
    Archer(){
        super(10,10,10,10,"Archer");
    }
}
