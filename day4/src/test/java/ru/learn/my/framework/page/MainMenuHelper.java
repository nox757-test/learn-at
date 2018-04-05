package ru.learn.my.framework.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.learn.my.framework.Logger;
import ru.learn.my.framework.elements.ClickHelper;

/**
 * Created by user on 05.04.2018.
 */
public class MainMenuHelper {

    private ClickHelper linkHelper;

    public MainMenuHelper(WebDriver driver) {
        this.linkHelper = new ClickHelper(driver);
    }

    public void clickContrparty(){
        Logger.logPage("click on contrparty");
        linkHelper.click(By.id("contr_menu"));
    }

    public  void clickDocument() {
        Logger.logPage("click on Document");
        linkHelper.click(By.id("doc_menu"));
    }




}
