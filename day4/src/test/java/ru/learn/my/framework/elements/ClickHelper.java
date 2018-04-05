package ru.learn.my.framework.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.learn.my.framework.Logger;

/**
 * Created by user on 05.04.2018.
 */
public class ClickHelper {
    WebDriver driver;

    public ClickHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By linkLocator) {
        Logger.logElement("Click " + linkLocator.toString());
        driver.findElement(linkLocator).click();
    }


}
