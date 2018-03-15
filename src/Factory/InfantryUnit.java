package Factory;

public class InfantryUnit {
    //variables
    int range;
    int armor;
    int hits;
    int damage;
    String name;

    //const
    public InfantryUnit(int range, int armor, int hits, int damage , String name){
        this.range = range;
        this.armor = armor;
        this.hits = hits;
        this.damage = damage;
        this.name = name;
    }

    //Func takedmg
    public void takeDamage(int damage){
        int reduction = (int) (Math.random()*armor);

        if(damage>reduction){
            hits -= damage-reduction;
        }
        System.out.println("Reduction : "+ reduction+ "\n Damage : "+ damage );
        System.out.println(name +" has  "+ hits +" hits.");

    }

    //Func til at angribe et eller andet
    public void attack(InfantryUnit unit){
        if(unit.hits>0) {
            int attackDamage = (int) (Math.random() * damage) + 1;
            unit.takeDamage(attackDamage);
            System.out.println(unit.name +" dealt " + attackDamage + " dmg.");
        }else{
            System.out.println("The "+ unit.name+" has died.");
        }

    }

}
