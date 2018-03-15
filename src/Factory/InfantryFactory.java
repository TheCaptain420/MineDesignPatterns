package Factory;

public class InfantryFactory {
    int techlevel=0;

    InfantryFactory(int techlvl){this.techlevel = techlvl;}

    public InfantryUnit createUnit(){
      InfantryUnit character;
       if(this.techlevel==2) {
           return character = new SpearThrower();
       }
       if(this.techlevel==3){
           return character= new Archer();
       }
       if(this.techlevel==4){
           return character = new Musketeer();
       }
       if (this.techlevel==5){
           return character = new CrossbowMan();
       }
       if(this.techlevel>5){
           System.out.println("You have reached highest lvl of 5");
           return character = new CrossbowMan();
       }
       else {
           return character = new RockHauler();}
    }



    public int getTechlevel() {
        return techlevel;
    }

    public void setTechlevel(int techlevel) {
        this.techlevel = techlevel;
    }
}
