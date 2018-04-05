package ru.learn.my.framework;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.learn.my.framework.page.AuthHelper;
import ru.learn.my.framework.page.ContrpartyHelper;
import ru.learn.my.framework.page.DocumentHelper;
import ru.learn.my.framework.page.MainMenuHelper;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

/**
 * Created by user on 05.04.2018.
 */
public class MyCore {

    protected WebDriver driver;
    public MainMenuHelper mainMenuHelper;
    public AuthHelper authHelper;
    public ContrpartyHelper contrpartyHelper;
    public DocumentHelper documentHelper;

    @Before
    public void setUp() throws Exception {
        Logger.logCore("Init");
        System.setProperty("webdriver.chrome.driver", "D:/learn-at/drivers/chromedriver_2.37.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        this.init();
        driver.get("http://192.168.14.7:8080/reckondemo/login.php");
    }

    private void init() {
        contrpartyHelper = new ContrpartyHelper(driver);
        mainMenuHelper = new MainMenuHelper(driver);
        authHelper = new AuthHelper(driver);
        documentHelper = new DocumentHelper(driver);
    }

    @After
    public void tearDown() throws Exception {
        Logger.logCore("Finish");
        Thread.sleep(2000);
        this.shutDown();
    }

    private void shutDown() {
        driver.quit();
    }
}
