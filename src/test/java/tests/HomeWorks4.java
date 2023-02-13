package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.TestBase;

import java.util.Set;

public class HomeWorks4  extends TestBase {

    @Test

    public void test4 () throws InterruptedException {
        WebElement cookies = Driver.getDriver().findElement(By.id("sp-cc-accept"));//cookies onay verildi.
        cookies.click();
        Thread.sleep(2000);


        WebElement howerover =Driver.getDriver().findElement(By.id("nav-link-accountList-nav-line-1"));//ekrana tıklamadan kaldı.
        actions.moveToElement(howerover).perform();
        Thread.sleep(3000);

        WebElement findagift =Driver.getDriver().findElement(By.xpath("//span[@class='nav-text']"));//find a gift e tıklandı.
        findagift.click();
        Thread.sleep(2000);

        WebElement giftsforeveryone =Driver.getDriver().findElement(By.xpath("(//h2[@class='ktemvl-1 hSsmQw'])[2]"));//giftsforeveryone yazısı getirildi.
        String gifts=giftsforeveryone.getText();
        System.out.println(gifts);
        Thread.sleep(2000);

        ((JavascriptExecutor)Driver.getDriver()).executeScript("window.open('https://www.ebay.com/', '_blank');");//tarayıcı da yeni bir sekme açıldı .
        Thread.sleep(2000);

        Set<String> handles = Driver.getDriver().getWindowHandles();//yinelemelere izin vermeden her pencerenin bir adı olur.
        Driver.getDriver().switchTo().window(handles.toArray()[1].toString());//1 nolu indisteki siteyi açar
        Driver.wait(2);

        WebElement searchEbay = Driver.getDriver().findElement(By.xpath("//input[@type='text']"));//search bulundu
        searchEbay.sendKeys(gifts);//gifts i gönderdik.
        Driver.wait(2);

        WebElement searchbutton =Driver.getDriver().findElement(By.xpath("//input[@type='submit']"));
        searchbutton.click();
        Driver.wait(2);

        WebElement firstprice =Driver.getDriver().findElement(By.xpath("//span[@class='ITALIC']"));
        String firstpricepage =firstprice.getText();
        System.out.println(firstpricepage);

        Assert.assertTrue(firstpricepage.contains("2.12"));//içindeki değeri kontorl ettik.
        Driver.wait(2);














    }



}
