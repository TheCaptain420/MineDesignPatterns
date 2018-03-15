package Factory;

public class HumanInfantryFactory {
    public InfantryUnit createUnit(int techlevel){
      InfantryUnit character;
       if(techlevel==2) {
           return character = new SpearThrower();
       }
       if(techlevel==3){
           return character= new Archer();
       }
       if(techlevel==4){
           return character = new Musketeer();
       }
       if (techlevel==5){
           return character = new CrossbowMan();
       }
       if(techlevel>5){
           System.out.println("You have reached highest lvl of 5");
           return character = new CrossbowMan();
       }
       else {
           return character = new RockHauler();}
    }

}
