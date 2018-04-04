package ru.learnTest.core.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by user on 04.04.2018.
 */
public class ContrpartyHelper {

    WebDriver driver;

    public ContrpartyHelper(WebDriver driver) {
        this.driver = driver;
    }


    public void clickCreateContpartyButton() {
        clickButton(By.xpath("//input[@value='Создать']"));
    }

    public void clickAddContrpartyButton() {
        clickButton(By.xpath("//input[@value='Создать']"));
    }

    public void fillContrparty(String description, String name, String account, String bankName, String bankAccount, String bankBik) {
        fillEdit(By.name("description"), description);
        fillEdit(By.name("name"), name);
        fillEdit(By.name("account"), account);
        fillEdit(By.name("bank_name"), bankName);
        fillEdit(By.name("bank_account"), bankAccount);
        fillEdit(By.name("bank_bic"), bankBik);
    }

    public void clickButton(By buttonLocator) {
        driver.findElement(buttonLocator).click();
    }

    public void fillEdit(By locator, String text) {
        //driver.findElement(locator).click();
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }
}
