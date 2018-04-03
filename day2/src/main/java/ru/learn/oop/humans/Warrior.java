package ru.learn.oop.humans;

import ru.learn.oop.aliens.Orc;

/**
 * Created by user on 03.04.2018.
 */
public class Warrior extends Human {

    private int armor;
    private int sword;

    public Warrior(String name, int health, int strength, int stamina, int armor, int sword) {
        super(name, health, strength, stamina);
        this.armor = armor;
        this.sword = sword;
    }

    @Override
    public void beat(Human target){
        System.out.println("beat human");
    }
    public void beat(Orc target) {
        System.out.println("beat orc");
    }
    public void beat(Mage target){
        System.out.println("beat mage");
    }

    public void beat(Warrior target){
        System.out.println("beat warrior");
        super.beat(target);
    }

    @Override
    protected void getDamage(int damage) {
        System.out.println("damage warrior");
        int damageArmor = (this.armor > 0) ? damage / 4 : damage;
        if(armor - damageArmor > 0) {
            armor -= damageArmor;
        } else {
            this.health -= damageArmor;
            this.armor = 0;
        }
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", armor=" + armor +
                ", health=" + health +
                ", sword=" + sword +
                ", strength=" + strength +
                ", stamina=" + stamina +
                '}';
    }
}
