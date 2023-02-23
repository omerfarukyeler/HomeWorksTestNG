package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DragAndDropPage;
import pages.TableTestPage;
import utilities.Driver;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class ListTestHw6  extends TestBase {

    /*===============================================================================
    1)https://the-internet.herokuapp.com/tables  sayfasına gidiniz.
    *2)1.Tablonun 4 üncü sütunudaki tüm değerleri bir listeye alınız. (Başına $ işareti olmadan double değer  olarak.)
    *3)Değerler içinden 50.00’den fazla olanları ayrı bir listeye ekleyiniz.
    *4)Bu liste içinde 100.00 değeri olup olmadığını doğrulayınız. (Assertion)
    ===================================================================================
    */
    DragAndDropPage dragAndDropPage = new DragAndDropPage();
    SoftAssert softAssert = new SoftAssert();
    TableTestPage tableTestPage = new TableTestPage();


    @Test

    public void listtest(){

        Driver.getDriver().get("https://the-internet.herokuapp.com/tables  ");

        List<Double> data = new ArrayList<Double>();// yeni liste oluşturuldu

        for(int i=1 ;i<5;i++){

            WebElement listone =Driver.getDriver().findElement(By.xpath(reUsableMethods.findLocationOfElementsTableCell(i)));//for döngüsüyle tablodan bilgiler alındı.
            String data1 =listone.getText().toString().replace("$","");// $ işareti kaldırıldı.
            System.out.println( data1);

            Double data2=Double.valueOf(data1);//yeni oluşturulan data2nin içine data1 eklendi.
            if(data2>50.000){
                data.add(data2);}//50.000 büyük değerler bulunup datanın içine eklendi
            }

        System.out.println("==============================================");
        System.out.println("data:"+data);

        Assert.assertTrue(data.contains(100.00));//datanın 100.00 değeri olup olmadığı kntrol edildi.
    }
}
