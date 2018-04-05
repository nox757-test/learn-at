package ru.learn.my.framework.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.learn.my.framework.Logger;
import ru.learn.my.framework.elements.ClickHelper;
import ru.learn.my.framework.elements.EditHelper;

/**
 * Created by user on 05.04.2018.
 */
public class ContrpartyHelper {
    private ClickHelper clickHelper;
    private EditHelper editHelper;

    public ContrpartyHelper(WebDriver driver) {
        this.clickHelper = new ClickHelper(driver);
        this.editHelper = new EditHelper(driver);
    }

    //("name", "name org", "01234567890123456789", "name bank", "98765432109876543210", "987654321");
    public void fillContrparty(String name, String nameOrg, String account, String bank, String bankAccount, String bik) {
        Logger.logPage("fill contrapaty info");
        editHelper.fillEdit(By.name("description"), name);
        editHelper.fillEdit(By.name("name"), nameOrg);
        editHelper.fillEdit(By.name("account"), account);
        editHelper.fillEdit(By.name("bank_name"), bank);
        editHelper.fillEdit(By.name("bank_account"), bankAccount);
        editHelper.fillEdit(By.name("bank_bic"), bik);
    }

    public void clickButtonAddNewContrparty() {
        Logger.logPage("click to button Add new Contrparty ");
        clickHelper.click(By.xpath("//input[@value='Создать']"));
    }
    public void clickButtonCreateNewContrparty() {
        Logger.logPage("click to button create contrparty");
        clickHelper.click(By.xpath("//input[@value='Создать']"));
    }

    public void clickByContrparty(String name) {
        Logger.logPage("click to contrparty with name " + name);
        clickHelper.click(By.xpath(String.format("//div[@id = \"conterparty_list\"]/table/tbody/tr/td/div/a/h3[text()=\"%s\"]", name)));
    }
}
