package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class BagAndTravelFees {

    public BagAndTravelFees(){
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//a[@data-analytics-id='home-shop-5']")
    public WebElement BaggageTravelFeesPage;

    @FindBy(xpath = "//span[.='Baggage & Travel Fees']")
    public  WebElement BaggageAndTravelFeesCategory;


    @FindBy(xpath = "//a[@href='#baggageFees']")
    public  WebElement CheckedBaggageFees;

    @FindBy(xpath = "//h3[@style='text-align: center;']")
    public  WebElement Price1;

    @FindBy(xpath = "//span[@style='font-weight: normal;']")
    public  WebElement Price2;

//    @FindBy(xpath = "//span[@style='font-weight: normal;']")
//    public  WebElement TrackCheckedBaggage;


    @FindBy(xpath = "//span[@class='desktop-text']//a[@href='/us/en/baggage/checked-baggage/track-checked-baggage']")
    public  WebElement TrackCheckedBaggage;


    @FindBy(id="inputBagTagNumber")
    public  WebElement BagTagNumber;

    @FindBy(id="inputBagLastName")
    public  WebElement LastName;

    @FindBy(xpath = "//input[@type='submit']")
    public  WebElement CheckBoxStatus;


    @FindBy(xpath = "//div[@class='col-6 mt-1 errorText']//span")
    public  WebElement ErrorMessage;


    @FindBy(xpath = "//button [@role ='button']")
    public  WebElement MyTrip;

    @FindBy(id = "tripFinderHeader")
    public  WebElement FindYourTrip;

    @FindBy(xpath = "//div[@class='container globalanchorchk']//span[@class='desktop-text']//a")
    public List<WebElement> MoreOptions;

    @FindBy(xpath = "//div[@id='tabs']//a")
    public List<WebElement> FindMyTripOptions;


    // 20 minutes
    //span [@class='desktop-text']//a [@href='/us/en/baggage/checked-baggage/minute-bag-guarantee']

    public void clickOnProductLink(String product){
        String xpath = "//a[@href='#baggageFees']";
        Driver.getDriver().findElement(By.xpath(xpath)).click();

    }
}
