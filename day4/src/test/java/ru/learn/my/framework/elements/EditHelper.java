package ru.learn.my.framework.elements;

import org.openqa.selenium.By;
import ru.learn.my.framework.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Created by user on 05.04.2018.
 */
public class EditHelper {

    WebDriver driver;
    public EditHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void fillEdit(By elementLocator, String text){
        Logger.logElement("Enter field " + elementLocator.toString() + " by " + text);
        driver.findElement(elementLocator).click();
        driver.findElement(elementLocator).clear();
        driver.findElement(elementLocator).sendKeys(text);
    }


}
