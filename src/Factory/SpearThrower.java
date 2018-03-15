package Factory;

public class SpearThrower extends InfantryUnit {


    public SpearThrower(int range, int armor, int hits, int damage) {
        super(range, armor, hits, damage);
    }

    SpearThrower(){super(10,5,5,15);}

}
