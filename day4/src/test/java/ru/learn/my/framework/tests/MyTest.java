package ru.learn.my.framework.tests;

import org.junit.Test;
import ru.learn.my.framework.Logger;
import ru.learn.my.framework.MyCore;

/**
 * Created by user on 05.04.2018.
 */
public class MyTest extends MyCore {
    @Test
    public void test(){

        Logger.logTest("test");
        authHelper.login("testuser7", "12345777");
        mainMenuHelper.clickContrparty();
        contrpartyHelper.clickButtonAddNewContrparty();
        contrpartyHelper.fillContrparty("name1", "name org", "01234567890123456789", "name bank", "98765432109876543210", "987654321");
        contrpartyHelper.clickButtonCreateNewContrparty();
        mainMenuHelper.clickContrparty();
        contrpartyHelper.clickByContrparty("name1");
    }

    @Test
    public void testDocument() {
        Logger.logTest("test");
        authHelper.login("testuser7", "12345777");
        mainMenuHelper.clickDocument();
        documentHelper.choosePaymentToCreate("Платёж контрагенту");
        documentHelper.clickButtonAddNewPayment();
        documentHelper.fillContrpartyPayment(200.555, "test", "40702810100080000001", "name1" );

        documentHelper.clickButtonCreatePayment();
    }


}
