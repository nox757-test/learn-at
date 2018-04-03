package ru.learn.oop.humans;

/**
 * Created by user on 03.04.2018.
 */
public class Mage extends Human {

    private int mana;

    public Mage(String name, int health, int strength, int stamina, int mana) {
        super(name, health, strength, stamina);
        this.mana = mana;
    }

    @Override
    public void beat(Human target){
        super.beat(target);
    }

    public void castFireball(Human target) {
        if(mana > 20) {
            this.mana -= 20;
            target.getDamage(100);
        } else {
            System.out.println("No mana :(");
        }
    }
}
