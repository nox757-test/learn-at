package ru.learnTest.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

/**
 * Created by user on 04.04.2018.
 */
public class TestRecorder {
    private WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:/learn-at/drivers/chromedriver_2.37.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testUntitledTestCase() throws Exception {
        driver.get("http://192.168.14.7:8080/reckondemo/login.php");
        fillEdit(By.id("login"), "testuser7");
        fillEdit(By.id("password"), "12345777");
        clickButton(By.id("submit"));
        clickLink(By.id("contr_menu"));
        clickButton(By.xpath("//input[@value='Создать']"));
        fillEdit(By.name("description"), "name");
        fillEdit(By.name("name"), "name org");
        fillEdit(By.name("account"), "012345678901234567890");
        fillEdit(By.name("bank_name"), "name bank");
        fillEdit(By.name("bank_account"), "98765432109876543210");
        fillEdit(By.name("bank_bic"), "987654321");
        fillEdit(By.name("account"), "01234567890123456789");
        clickButton(By.xpath("//input[@value='Создать']"));
    }

    private void clickLink(By linkLocator) {
        driver.findElement(linkLocator).click();
    }

    private void clickButton(By buttonLocator) {
        driver.findElement(buttonLocator).click();
    }

    private void fillEdit(By locator, String text) {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}
