package Factory;

public class FactoryFactory {
    public InfantryFactory createInfantryFactory(int race,int techlvl){
        if(race==1 ){
            return new HumanInfantryFactory(techlvl);
        }if(race==2){
            return new OrcInfantryFactory(techlvl);
        }else{return null;}

    }

}
