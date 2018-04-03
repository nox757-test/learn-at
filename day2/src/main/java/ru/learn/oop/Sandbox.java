package ru.learn.oop;

import org.junit.Test;
import ru.learn.oop.aliens.Orc;
import ru.learn.oop.humans2.Human;
import ru.learn.oop.humans.Mage;

/**
 * Created by user on 03.04.2018.
 */
public class Sandbox {

    @Test
    public void testMethod() {
        ru.learn.oop.humans.Human human = new ru.learn.oop.humans.Human("Vasya", 100, 100, 50);

        ru.learn.oop.humans.Human human1 = new ru.learn.oop.humans.Human("Petyay", 100, 100, 50);

        human.walk(10);
        System.out.println(human.getStamina());
        human.eat(1000);
        System.out.println(human.getStamina());

//        System.out.println(human.toString());
//        System.out.println(human1.toString());
    }

    @Test
    public void testMethod1() {
        Mage mage = new Mage("Test mage", 100, 50, 10, 40);
        ru.learn.oop.humans.Human human1 = new ru.learn.oop.humans.Human("Petyay", 100, 100, 50);
        mage.beat(human1);
    }

    @Test
    public void testMethod2() {
        Orc orc = new Orc("Test org", 100, 50, 10);
        Human human1 = new Human("Petyay", 100, 100, 50);
        human1.beat(orc);
    }
}
