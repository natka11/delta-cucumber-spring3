package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class RentACarPage {

    public RentACarPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Rent A Car']")
    public WebElement rentACar;

    @FindBy (id = "carPickUpLocation")
    public WebElement pickUpLocation;

    @FindBy (id = "carPickUpDate")
    public WebElement pickUpDate;

    @FindBy (xpath = "//a[@class='ui-state-default'][text()='15'][1]")
    public WebElement pickUpDateChoice;

    @FindBy (xpath = "//a[@class='ui-state-default'][text()='15'][2]")
    public WebElement dropOffDateChoice;

    @FindBy (id = "carDropOffDate")
    public WebElement dropOffDate;

    @FindBy(id="carPickUpTime-button")
    public WebElement pickUpTime;


    @FindBy (id="carDropOffTime-button")
    public WebElement dropOffTime;

    @FindBy (id="carAge-button")
    public WebElement age;

    @FindBy (id="btnSubmit")
    public WebElement bookACarButton;

    public void rentACarClick(){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()",rentACar);

    }

    public void bookACarClick(){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()",bookACarButton);

    }

    public void selectPickUpDate(){
        new RentACarPage().pickUpDate.click();
        new RentACarPage().pickUpDateChoice.click();

    }

    public void selectDropOffDate(){
        new RentACarPage().dropOffDate.click();
        new RentACarPage().pickUpDateChoice.click();

    }

    public void selectPickUpTime(int index){
        Select select = new Select(pickUpTime);
        select.selectByIndex(index);

    }

    public void selectDropOffTime(int index){
        Select select = new Select(dropOffTime);
        select.selectByIndex(index);
    }

    public void selectAge(int index){
        Select select = new Select(age);
        select.selectByIndex(index);

    }

}
