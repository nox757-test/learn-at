package ru.learnTest.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.learnTest.core.pages.ContrpartyHelper;

import java.io.IOException;

/**
 * Created by user on 04.04.2018.
 */
public class ReckonCore {

    private final ContrpartyHelper contrpartyHelper;
    protected WebDriver driver;
//    protected Properties properties =  new Properties();


    public ReckonCore(WebDriver driver) throws IOException {
//        FileInputStream fis = new FileInputStream("D:\\learn-at\\testProject\\day3\\src\\Project.properties");
//        properties.load(fis);
//        System.out.println( properties.getProperty("webdriver.chrome.driver"));
        //System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver"));
        this.driver = driver;
        contrpartyHelper = new ContrpartyHelper(driver);
    }

    public void selectMenuConterparty() {
        clickLink(By.id("contr_menu"));
    }

    public void auth(String userLogin, String password) {
        driver.get("http://192.168.14.7:8080/reckondemo/login.php");
        contrpartyHelper.fillEdit(By.id("login"), userLogin);
        contrpartyHelper.fillEdit(By.id("password"), password);
        contrpartyHelper.clickButton(By.id("submit"));
    }

    private void clickLink(By linkLocator) {
        driver.findElement(linkLocator).click();
    }

    public void shutDown() {
        driver.quit();
    }
}
