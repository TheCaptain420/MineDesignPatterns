package Factory;

public class runAppMain {
    public static void main(String[] args) {


        InfantryUnit spearThrower = new SpearThrower();
        InfantryUnit rockHauler = new RockHauler();

        spearThrower.attack(rockHauler);
        spearThrower.attack(rockHauler);




    }

}
