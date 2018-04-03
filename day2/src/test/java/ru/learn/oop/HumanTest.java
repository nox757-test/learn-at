package ru.learn.oop;

import org.junit.Assert;
import org.junit.Test;
import ru.learn.oop.humans.Human;
import ru.learn.oop.humans.Warrior;

/**
 * Created by user on 03.04.2018.
 */
public class HumanTest {

    @Test
    public void walkTest()  {
        Human test = new Human("Test", 100, 100, 50);
        Assert.assertEquals("Result Stamina is wrong", 50, test.getStamina());
        test.walk(10);
        Assert.assertEquals("Result after 10 km", 40, test.getStamina());
    }

    @Test
    public void beatTest() {
        Human test1 = new Human("Test", 100, 100, 50);
        Human test2 = new Human("Test", 100, 100, 50);
         test1.beat(test2);
         Assert.assertEquals(90, test2.getHealth());
    }

    @Test
    public void beatWarrior() {
        Human test1 = new Human("Test", 100, 100, 50);
        Warrior test2 = new Warrior("Test warr", 100, 100, 50, 100, 50);

        test2.beat(test2);
    }


}