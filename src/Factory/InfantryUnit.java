package Factory;

public class InfantryUnit {
    //variables
    int range;
    int armor;
    int hits;
    int damage;

    //const
    public InfantryUnit(int range, int armor, int hits, int damage){
        this.range = range;
        this.armor = armor;
        this.hits = hits;
        this.damage = damage;
    }

    //Func takedmg
    public void takeDamage(int damage){
        int reduction = (int) (Math.random()*armor);

        if(damage>reduction){
            hits -= damage-reduction;
        }
        System.out.println("Reduction : "+ reduction+ "\n Damage : "+ damage );
        System.out.println("Unit has  "+ hits +" hits.");
    }

    //Func til at angribe et eller andet
    public void attack(InfantryUnit unit){
        int attackDamage = (int) (Math.random()*damage)+1;
        unit.takeDamage(attackDamage);
        System.out.println("Unit dealt "+attackDamage +" dmg.");
    }

}
