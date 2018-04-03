package ru.learn.oop.humans2;

import ru.learn.oop.aliens.Orc;
import ru.learn.oop.humans2.Human;
import ru.learn.oop.humans.Mage;
import ru.learn.oop.prototype.Ancient;

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
        this.race = "human-warrior";
    }

    @Override
    public void beat(Ancient target){
        super.beat(target);
    }

    @Override
    public void getDamage(int damage) {
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
