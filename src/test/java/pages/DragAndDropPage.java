package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DragAndDropPage  {

    public DragAndDropPage() {PageFactory.initElements(Driver.getDriver(),this);}



    @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[4]")
    public WebElement acceptAllCookiesButton;

    @FindBy(xpath="(//a[@class='button button-orange'])[5]")
    public WebElement clickBankbutton;

    @FindBy(xpath = "(//li[@class='placeholder'])[1]")
    public WebElement dragleftAccountbutton;

    @FindBy(xpath="(//a[@class='button button-orange'])[6]")
    public WebElement getClickSalesButton;

    @FindBy(xpath = "(//div[@class='ui-widget-content'])[4]")
    public WebElement dragRightAccountbutton;

    @FindBy(xpath = "(//a[@class='button button-orange'])[2]")
    public WebElement click5000left;

    @FindBy(xpath = "//ol[@class='field13 ui-droppable ui-sortable']")
    public WebElement dragDebitAmmount;

    @FindBy(xpath = "(//a[@class='button button-orange'])[4]")
    public WebElement click5000right;

    @FindBy(xpath = "(//ol[@class='field13 ui-droppable ui-sortable'])[2]")
    public WebElement dragCreditAmmount;




}
