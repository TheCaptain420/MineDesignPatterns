package Factory;

public class RockHauler extends InfantryUnit {
    public RockHauler(int range, int armor, int hits, int damage,String name) {
        super(range, armor, hits, damage,name);
    }

    public RockHauler(){super(5,5,10,1,"RockHauler");}
}
