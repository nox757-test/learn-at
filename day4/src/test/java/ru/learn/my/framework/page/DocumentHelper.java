package ru.learn.my.framework.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.learn.my.framework.Logger;
import ru.learn.my.framework.elements.ClickHelper;
import ru.learn.my.framework.elements.DropdownHelper;
import ru.learn.my.framework.elements.EditHelper;

/**
 * Created by user on 05.04.2018.
 */
public class DocumentHelper {
    private ClickHelper clickHelper;
    private EditHelper editHelper;
    private DropdownHelper dropdownHelper;

    public DocumentHelper(WebDriver driver) {
        this.clickHelper = new ClickHelper(driver);
        this.editHelper = new EditHelper(driver);
        this.dropdownHelper = new DropdownHelper(driver);
    }

    public void choosePaymentToCreate(String selected) {
        Logger.logPage("Choose method Payment to Contrparty");
        dropdownHelper.changeSelected(By.xpath("//form[@name=\"create_document\"]/select[@name=\"doc_type\"]"), selected);
    }

    public void clickButtonCreatePayment(){
        Logger.logPage("click button create");
        clickHelper.click(By.xpath("//input[@type='submit' and @value='Создать']"));
    }

    public void clickButtonAddNewPayment(){
        Logger.logPage("click button add payment");
        clickHelper.click(By.xpath("//input[@type='submit' and @value='Создать']"));
    }

    public void fillContrpartyPayment(double amountPayment,  String purpose, String payerAccount, String nameContrparty){
        Logger.logPage("Fill form");
        editHelper.fillEdit(By.name("number"), Double.toString(amountPayment));
        editHelper.fillEdit(By.name("purpose"), purpose);
        dropdownHelper.changeSelected(By.xpath("//select[@name='payer_account']"), payerAccount);
        dropdownHelper.changeSelected(By.xpath("//select[@name='payee_conterparty']"), nameContrparty);
    }

}
