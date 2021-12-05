package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RentACarPage {

    public RentACarPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Rent A Car']")
    public WebElement rentACar;

    @FindBy (id = "carPickUpLocation")
    public WebElement pickUpLocation;

//    @FindBy (id = "dropOffLocationChk")
//    public WebElement dropOffCheckBox;

//    @FindBy (id = "carDropOffLocation")
//    public WebElement dropOffLocation;


    @FindBy (id = "carPickUpDate")
    public WebElement pickUpDate;

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

}
