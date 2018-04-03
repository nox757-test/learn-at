package ru.learn.oop.humans;

/**
 * Created by user on 03.04.2018.
 */
public class Human {
    protected String name;
    protected int health;
    protected int strength;
    protected int stamina;     // усталость

    protected final int staminaWalkModifier = 1;
    protected final int staminaCaloriesGrow = 100;
    protected final int healthCaloriesGrow = 100;

    protected final int maxHealth;
    protected final int maxStrength;
    protected final int maxStamina;


    public Human(String name, int health, int strength, int stamina) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.stamina = stamina;
        this.maxHealth = health;
        this.maxStrength = strength;
        this.maxStamina = stamina;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getStamina() {
        return stamina;
    }

    public void walk(int km) {
        stamina = stamina - (staminaWalkModifier * km);
    }

    public void eat(int calories) {
        stamina += (calories / staminaCaloriesGrow);
        health += (calories / healthCaloriesGrow);
    }

    public void beat(Human target) {
        target.getDamage(strength / 10);
    }

    protected void getDamage(int damage) {
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
