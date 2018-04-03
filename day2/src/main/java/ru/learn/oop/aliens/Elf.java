package ru.learn.oop.aliens;

import ru.learn.oop.prototype.Primeval;

/**
 * Created by user on 03.04.2018.
 */
public class Elf  extends Primeval{

    protected int agility;

    public Elf(String name, int health, int strength, int stamina, int agility) {
        super(name, health, strength, stamina);
        this.agility = agility;
        this.race = "elf";
    }

    @Override
    public void getDamage(int damage) {

    }
}
