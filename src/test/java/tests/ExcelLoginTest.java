package tests;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ExcelPages;
import pages.TableTestPage;
import utilities.Driver;
import utilities.TestBase;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelLoginTest extends TestBase {

    /*Soru 1: NEGATİF SENARYO
Kullanıcı https://www.browserstack.com/users/sign_up sayfasına gider
Kullanıcı Cookies seçeneğini Accept All seçeneği ile kabul eder.
Kullanıcı Proje içerisindeki EXCEL dosyasından aldığı kullanıcı adı ve soyadını Full name TextBox’ına yazar.
Kullanıcı Proje içerisindeki EXCEL dosyasındaki GEÇERSİZ EMAİLLER Sheet’inden aldığı kullanıcı email adresini Business Email TextBox’ına yazar.
Kullanıcı password textbox kutusuna tıklar.
INVALID olarak girilen MAIL adresini yarattığı hata mesajı “Invalid Email” validate(assert) edilir.
======================================================================================================
Soru 2: NEGATİF SENARYO
Kullanıcı https://www.browserstack.com/users/sign_up  sayfasına gider
Kullanıcı Cookies seçeneğini Accept All seçeneği ile kabul eder.
Kullanıcı Proje içerisindeki EXCEL dosyasından aldığı kullanıcı adı ve soyadını Full name TextBox’ına yazar.
Kullanıcı Proje içerisindeki EXCEL dosyasındaki GEÇERLİ EMAİLLER Sheet’inden aldığı kullanıcı email adresini Business Email TextBox’ına yazar.
Kullanıcı password textbox kutusuna EXCEL dosyasındaki GEÇERSİZ PASSWORD Sheetinden aldığı 6 karakterden kısa password’ü yazar.
Kullanıcı “I agrre…” Checkbox’ına tıklar.
INVALID olarak girilen PASSWORD’ün  yarattığı hata mesajı “At least 6 characters” validate(assert) edilir.
========================================================================================================
Soru 3: POZİTİF SENARYO
Kullanıcı https://www.browserstack.com/users/sign_up  sayfasına gider
Kullanıcı Cookies seçeneğini Accept All seçeneği ile kabul eder.
Kullanıcı Proje içerisindeki EXCEL dosyasından aldığı kullanıcı adı ve soyadını Full name TextBox’ına yazar.
Kullanıcı Proje içerisindeki EXCEL dosyasındaki GEÇERLİ EMAİLLER Sheet’inden aldığı kullanıcı email adresini Business Email TextBox’ına yazar.
Kullanıcı password textbox kutusuna EXCEL dosyasındaki GEÇERLİ PASSWORD Sheetinden aldığı şifreyi yazar.
Kullanıcı “I agrre…” Checkbox’ına tıklar.
Kullanıcı “Sign me up” butonuna tıklar.
Başarılı bir şekilde kayıt yapıldığı Validate edilir.
==========================================================================================================
*/


    SoftAssert softAssert = new SoftAssert();
    TableTestPage tableTestPage = new TableTestPage();

    ExcelPages excelPages= new ExcelPages();

    @Test
    public void QuestionOne() throws IOException, InterruptedException {

        String path ="src/test/resources/userinformation.xlsx";
        FileInputStream fis = new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fis);


        Driver.getDriver().get("https://www.browserstack.com/users/sign_up");
        excelPages.AcceptAll.click();

        String name = workbook.getSheet("Sheet1").getRow(1).getCell(0).toString();
        System.out.println(name );
        excelPages.username.sendKeys(name);
        Driver.wait(2);

        String invalidemail = workbook.getSheet("Sheet1").getRow(1).getCell(1).toString();
        System.out.println(invalidemail);
        excelPages.emailbox.sendKeys(invalidemail);
        Driver.wait(2);

        String invalidpassword =workbook.getSheet("Sheet1").getRow(1).getCell(2).toString();
        System.out.println(invalidpassword);
        excelPages.password.sendKeys(invalidpassword);
        Driver.wait(2);

        Assert.assertTrue(excelPages.alertpassword.isDisplayed());











    }



}
