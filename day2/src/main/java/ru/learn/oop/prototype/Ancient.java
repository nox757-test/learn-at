package ru.learn.oop.prototype;

/**
 * Created by user on 03.04.2018.
 */
public interface Ancient {
    public void walk(int km);
    public void eat(int colories);
    public void sleep();
    public void beat(Ancient target);
    public void getDamage(int damage);
}
