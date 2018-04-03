package ru.learn.oop.aliens;

import ru.learn.oop.prototype.Primeval;

/**
 * Created by user on 03.04.2018.
 */
public class Dwarf extends Primeval{
    private final String race = "dwarf";

    public Dwarf(String name, int health, int strength, int stamina) {
        super(name, health, strength, stamina);
    }

}
