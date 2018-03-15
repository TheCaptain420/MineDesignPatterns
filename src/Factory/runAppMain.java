package Factory;

public class runAppMain {
    public static void main(String[] args) {

        /*
        InfantryUnit spearThrower = new SpearThrower();
        InfantryUnit rockHauler = new RockHauler();

        while((spearThrower.hits>0) && (rockHauler.hits>0)) {
            spearThrower.attack(rockHauler);
            rockHauler.attack(spearThrower);
            System.out.println("----");
        }*/

        HumanInfantryFactory huham1 = new HumanInfantryFactory();
        HumanInfantryFactory huham2 = new HumanInfantryFactory();

        InfantryUnit pC = huham1.createUnit(1);
        InfantryUnit oC = huham2.createUnit(2);

        while((pC.hits>0) && (oC.hits>0)) {
            pC.attack(oC);
            oC.attack(pC);
            System.out.println("----");
        }

    }

}
