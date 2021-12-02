package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FlightStatusPage {
    public FlightStatusPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "FLIGHT STATUS")
    public WebElement flightStatus;

    @FindBy (id = "searchBydateLbl")
    public WebElement searchByDateLbl;

    @FindBy (xpath = "//a[@data-date='12/06/2021|M, Dec 6|6 December 2021, Monday']")
    public WebElement date;



    @FindBy (id = "calDepartLabelCont")
    public WebElement calendar;



    @FindBy(id="flightNo")
    public WebElement enterFlightNo;



    @FindBy (id="errorMassage")
    public WebElement errorMsg;

    @FindBy (id="btn-flight-sts-submit")
    public WebElement submitBtn;

    @FindBy (id="flightStatusWidgetForm-error")
    public WebElement FLIGHT_NUM_REQD;

    @FindBy (id="departcitylink")
    public WebElement departCity;


    @FindBy (id="arrivalcitylink")
    public WebElement arrivalCity;



    @FindBy(xpath="//div[@id='search-error']")
    public WebElement departureError;

    @FindBy(id="search-error")
    public WebElement arrivalError;







    @FindBy (id="btn-book-submit")
    public WebElement submit;



    public void bookingClick(){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()",flightStatus);

    }

    public void submitClick(){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()",submit);

    }

    public void selectDate(){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()",date);

    }







}
