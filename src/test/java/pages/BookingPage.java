package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class BookingPage {

    public BookingPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//a[@id='headPrimary1']")
    public WebElement book;

    @FindBy (id = "fromAirportName")
    public WebElement departureCity;

    @FindBy (xpath = " //input[@id='search_input']")
    public WebElement searchDepartureCity;



    @FindBy (id = "toAirportName")
    public WebElement destinationCity;

    @FindBy(xpath="//span[@class='select-ui-wrapper ng-tns-c1-4'][1]")
    public WebElement tripType;

    @FindBy(id="selectTripType-val")
    public WebElement roundTrip;



    @FindBy (id="fromAirportName-error")
    public WebElement errorMsgDC;

    @FindBy (xpath = "//input[@class='form-control mr-0 input-mobile-tab-class airport-search ng-pristine ng-valid ng-touched']")
    public WebElement enterCity;






    @FindBy (id="btn-book-submit")
    public WebElement submit;



    public void bookingClick(){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()",book);

    }

    public void submitClick(){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()",submit);

    }

    public void enterDepartureCity(){
//        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
//        js.executeScript("arguments[0].click()",departureCity);
//        js.executeScript("searchDepartureCity.value='YVR';");

        departureCity.sendKeys("YVR"+Keys.ENTER);

    }







    }



