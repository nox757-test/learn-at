package ru.learnTest.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.learnTest.core.ReckonCore;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

/**
 * Created by user on 04.04.2018.
 */
public class TestContragent2 {
    private StringBuffer verificationErrors = new StringBuffer();
    private ReckonCore core;
    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:/learn-at/drivers/chromedriver_2.37.exe");
//                        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        core = new ReckonCore(new ChromeDriver());
    }

    @Test
    public void testUntitledTestCase() throws Exception {
        core.auth("testuser7", "12345777");
        core.selectMenuConterparty();
        core.clickAddContrpartyButton();
        core.fillContrparty("name", "name org", "01234567890123456789", "name bank", "98765432109876543210", "987654321");
        core.clickCreateContpartyButton();
    }

    @After
    public void tearDown() throws Exception {
        core.shutDown();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}
