package ru.learn.oop.humans2;

import ru.learn.oop.prototype.Ancient;
import ru.learn.oop.prototype.Primeval;

/**
 * Created by user on 03.04.2018.
 */
public class Human extends Primeval {

    public Human(String name, int health, int strength, int stamina) {
        super(name, health, strength, stamina);
        this.race = "human";
    }

    public void beat(Ancient target) {
        target.getDamage(strength / 10);
    }

    public void getDamage(int damage) {
        health -= damage;
    }


    @Override
    public String toString() {
        return "object Human { \r\n" +
                "\tname=\"" + name + "\"\r\n" +
                "\thealth=" + health + "\"\r\n" +
                "\tstrength=" + strength + "\"\r\n" +
                "\tstamina=" + stamina + "\"\r\n" +
                '}';
    }
}
