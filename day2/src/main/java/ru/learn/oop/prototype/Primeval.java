package ru.learn.oop.prototype;

/**
 * Created by user on 03.04.2018.
 */
public abstract class Primeval implements Ancient {

    protected String race;

    public String getRace() {
        return race;
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

    protected String name;
    protected int health;
    protected int strength;
    protected int stamina;     // усталость

    protected final int maxHealth;
    protected final int maxStrength;
    protected final int maxStamina;

    protected final int staminaWalkModifier = 1;
    protected final int staminaCaloriesGrow = 100;
    protected final int healthCaloriesGrow = 100;



    public Primeval(String name, int health, int strength, int stamina) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.stamina = stamina;
        maxHealth = health;
        maxStamina = stamina;
        maxStrength = strength;
    }

    public void walk(int km) {
        if(stamina > 0) {
            stamina -= staminaWalkModifier * km;
        } else {
            stamina = 0;
        }

    }

    public void eat(int calories) {
        stamina += (calories / staminaCaloriesGrow);
        health += (calories / healthCaloriesGrow);
    }

    public void sleep() {
        this.stamina = maxStamina;
    }

    public void beat(Ancient target) {
        target.getDamage(this.strength);
    }

    public void getDamage(int damage) {
        health -= damage;
    }
}
