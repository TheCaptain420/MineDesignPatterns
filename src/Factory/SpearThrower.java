package Factory;

public class SpearThrower extends InfantryUnit {


    public SpearThrower(int range, int armor, int hits, int damage,String name) {
        super(range, armor, hits, damage,name);
    }

    SpearThrower(){super(10,5,5,15,"SpearThrower");}

}
