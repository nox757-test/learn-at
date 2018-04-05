package ru.learn.my.framework.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.learn.my.framework.elements.ClickHelper;
import ru.learn.my.framework.elements.EditHelper;

/**
 * Created by user on 05.04.2018.
 */
public class AuthHelper {

    private EditHelper editHelper;
    private ClickHelper clickHelper;

    public AuthHelper(WebDriver driver) {
        this.editHelper = new EditHelper(driver);
        this.clickHelper = new ClickHelper(driver);
    }

    public void login(String login, String pass) {
        editHelper.fillEdit(By.id("login"), login);
        editHelper.fillEdit(By.id("password"), pass);
        clickHelper.click(By.id("submit"));
    }
}
