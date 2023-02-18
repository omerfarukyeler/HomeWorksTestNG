package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DragAndDropPage;
import utilities.Driver;
import utilities.TestBase;

public class DragAndDropHw6 extends TestBase {

    DragAndDropPage dragAndDropPage = new DragAndDropPage();
    SoftAssert softAssert = new SoftAssert();


    @Test

    public void draganddrop() throws InterruptedException {

        Driver.getDriver().get("https://demo.guru99.com/test/drag_drop.html");
        Driver.getDriver().switchTo().frame("gdpr-consent-notice");//id ile frame geçildi.
        dragAndDropPage.acceptAllCookiesButton.click();//cookies kabul edildi.
        actions.clickAndHold(dragAndDropPage.clickBankbutton).moveToElement(dragAndDropPage.dragleftAccountbutton).release().build().perform();
        actions.clickAndHold(dragAndDropPage.getClickSalesButton).moveToElement(dragAndDropPage.dragRightAccountbutton).release().build().perform();
        actions.clickAndHold(dragAndDropPage.click5000left).moveToElement(dragAndDropPage.dragDebitAmmount).release().build().perform();
        actions.clickAndHold(dragAndDropPage.click5000right).moveToElement(dragAndDropPage.dragCreditAmmount).release().build().perform();
        Driver.wait(3);

        WebElement dataAccount1 = Driver.getDriver().findElement(By.xpath("(//li[@data-id='2'])[3]"));
        WebElement dataAccount2 = Driver.getDriver().findElement(By.xpath("(//li[@data-id='2'])[4]"));
        WebElement dataAccount3 = Driver.getDriver().findElement(By.xpath("//div[@class='table4_result']"));
        String actualData1 = dataAccount1.getText();
        String actualData2 = dataAccount2.getText();
        String actualData3 = dataAccount3.getText();
        String expectedData1 = "5000";
        String expectedData2 = "5000";
        String expectedData3 = "Perfect!";

        softAssert.assertEquals(actualData1, expectedData1, "Data1 hata verdi");
        softAssert.assertEquals(actualData2, expectedData2, "Data2 hata verdi");

        softAssert.assertAll();

        Assert.assertEquals(actualData3, expectedData3);

    }





}