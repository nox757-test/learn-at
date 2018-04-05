package ru.learn.my.framework.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ru.learn.my.framework.Logger;

/**
 * Created by user on 05.04.2018.
 */
public class DropdownHelper {
    WebDriver driver;

    public DropdownHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void changeSelected(By elementLocator, String selected) {
        Logger.logElement("change select " + elementLocator.toString() + " by " + selected);
        Select dropdown = new Select(driver.findElement(elementLocator));
        dropdown.selectByVisibleText(selected);
    }
}
