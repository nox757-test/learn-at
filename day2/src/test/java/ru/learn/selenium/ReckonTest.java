package ru.learn.selenium;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReckonTest {
    private WebDriver driver;
    private boolean acceptNextAlert = true;
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
        driver.findElement(By.id("login")).click();
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys("testuser7");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("12345777");
        driver.findElement(By.id("submit")).click();
        driver.findElement(By.id("contr_menu")).click();
        driver.findElement(By.xpath("//input[@value='Создать']")).click();
        driver.findElement(By.name("description")).click();
        driver.findElement(By.name("description")).clear();
        driver.findElement(By.name("description")).sendKeys("testing contragent1");
        driver.findElement(By.name("name")).clear();
        driver.findElement(By.name("name")).sendKeys("testing name1");
        driver.findElement(By.name("account")).clear();
        driver.findElement(By.name("account")).sendKeys("12345678901234567890");
        driver.findElement(By.name("bank_name")).clear();
        driver.findElement(By.name("bank_name")).sendKeys("bank");
        driver.findElement(By.name("bank_account")).clear();
        driver.findElement(By.name("bank_account")).sendKeys("09876543210987654321");
        driver.findElement(By.name("bank_bic")).clear();
        driver.findElement(By.name("bank_bic")).sendKeys("123456789");
        driver.findElement(By.xpath("//input[@value='Создать']")).click();
        driver.findElement(By.xpath("//div[@id='conterparty_list']/table/tbody/tr[2]/td/div/a/h3")).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
