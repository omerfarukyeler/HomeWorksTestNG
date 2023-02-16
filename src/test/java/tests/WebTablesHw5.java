package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TableTestPage;
import utilities.Driver;
import utilities.TestBase;

import java.util.List;

public class WebTablesHw5 extends TestBase {


    /*Soru 1
    1.Kullanıcı  https://the-internet.herokuapp.com/tables adresine gider.
    2.Kullanıcı Tablonun 4’üncü satır 5’üncü sütundaki verinin doğruluğunu kontrol eder.

    ====================================================================================

    Soru2
    1.Kullanıcı  https://the-internet.herokuapp.com/tables adresine gider.
    2.Birinci tablonun tüm başlıklarının ikinci tablonun tüm başlıkları ile aynı olduğunu doğrular.
     */

    TableTestPage tableTestPage= new TableTestPage();//TableTestPage classını çağırdık.
    @Test
    public void TableTest1() {

        Driver.getDriver().get("https://the-internet.herokuapp.com/tables");
        String ActualValue = tableTestPage.Table1FourthRowFifthColumn.getText();
        String ExpectedValue = "http://www.timconway.com";
        System.out.println(ActualValue);
        Assert.assertEquals(ActualValue, ExpectedValue);
    }
    @Test
    public void TableTest2() throws InterruptedException {

        Driver.getDriver().get("https://the-internet.herokuapp.com/tables");
        List<WebElement> TableOne= Driver.getDriver().findElements(By.xpath("(//body//table//thead//tr)[1]"));
        List<WebElement> TableSecond=Driver.getDriver().findElements(By.xpath("(//body//table//thead//tr)[2]"));
        for (WebElement tablo1:TableOne) {
            System.out.println(tablo1.getText());
            String ExpectedValue =tablo1.getText();
            for (WebElement tablo2 :TableSecond) {

                System.out.println(tablo2.getText());

                String ActualValue =tablo2.getText();

                Assert.assertEquals(ActualValue,ExpectedValue);
            }



        }

    Driver.wait(2);
    }
     @Test

    public void Test3(){

        Driver.getDriver().get("https://the-internet.herokuapp.com/tables");
        String ExpectedValue ="$100.00";
        String ActualValue =tableTestPage.Table2ThirthRowFourthColumn.getText();

        Assert.assertEquals(ActualValue,ExpectedValue);


    }







    }







