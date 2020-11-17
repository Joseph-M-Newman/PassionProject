package Object;

import java.util.ArrayList;

public class Player {
    double health;
    double baseMelee;
    double baseDefense;
    double baseMage;
    String name = "";
    public ArrayList<Sword> swords = new ArrayList<>();

    public Player(){
        this.health = 10;
        this.baseMelee = 1;
        this.baseMage = 1;
        this.baseDefense = 1;
        this.name = "";
    }

    public Player(double health, double baseMelee, double baseDefense, double baseMage,String name) {
        this.health = health;
        this.baseMelee = baseMelee;
        this.baseDefense = baseDefense;
        this.baseMage = baseMage;
        this.name = name;
    }
//----------- getters and setters -----------
    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getBaseMelee() {
        return baseMelee;
    }

    public void setBaseMelee(double baseMelee) {
        this.baseMelee = baseMelee;
    }

    public double getBaseDefense() {
        return baseDefense;
    }

    public void setBaseDefense(double baseDefense) {
        this.baseDefense = baseDefense;
    }

    public double getBaseMage() {
        return baseMage;
    }

    public void setBaseMage(double baseMage) {
        this.baseMage = baseMage;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //----------- getters and setters -----------

    //dmg calcuations
    public void takeDamage(double damage){
        this.health -= damage;
    }

    public void AttackTarget(Enemy e){

    }


}
