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

        InfantryFactory huham1 = new HumanInfantryFactory(0);
        InfantryFactory huham2 = new HumanInfantryFactory(2);
        InfantryFactory orcam1 = new OrcInfantryFactory(1);

        InfantryUnit hC1 = huham2.createUnit();
        InfantryUnit hC2 = huham1.createUnit();
        InfantryUnit oC1 = orcam1.createUnit();

        while((hC1.hits>0) && (oC1.hits>0)) {
            hC1.attack(oC1);
            oC1.attack(hC1);
            System.out.println("----");
        }

    }

}
