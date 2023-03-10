package utilities;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {

    protected Actions actions = new Actions(Driver.getDriver());
    public ReUsableMethods reUsableMethods =new ReUsableMethods();


    @BeforeMethod
    public void setup(){
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Proje nin asıl linki Configurations.properties dosyasına eklenir ve her testten önce proje sayfası açılması için bu metod içine eklenir.
        // Ancak yaptığımız örnek testlerden dolayı birçok farklı link ile çalışıyoruz. Sabit bir proje linkimiz olmadığı için aşağıdaki kod satırı yoruma alınmıştır.
        //Driver.getDriver().get(ConfigReader.getProperty("projectUrl")); // bir çok projede çalıştığımız için gidilecek url yi kendimiz yazdık .



    }

    @AfterClass

    public void tearDown(){

       // Driver.closeDriver();

    }


}
