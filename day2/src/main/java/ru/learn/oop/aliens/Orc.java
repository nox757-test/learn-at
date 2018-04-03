package ru.learn.oop.aliens;

import ru.learn.oop.prototype.Primeval;

/**
 * Created by user on 03.04.2018.
 */
public class Orc  extends Primeval{


    public Orc(String name, int health, int strength, int stamina) {
        super(name, health, strength, stamina);
        this.race = "orc";
    }
}
