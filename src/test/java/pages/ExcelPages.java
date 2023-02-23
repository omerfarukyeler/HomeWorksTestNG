package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ExcelPages {

    public ExcelPages(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id="accept-cookie-notification")
    public WebElement AcceptAll;

    @FindBy(id="user_full_name")
    public  WebElement username ;

    @FindBy (id="user_email_login")
    public WebElement emailbox;

    @FindBy (id="user_password")
    public WebElement password;

    @FindBy (xpath = "//span[@aria-live='polite']")
    public WebElement alertpassword;

}
