package pages;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.util.List;

public class VacationDealPage {
    public VacationDealPage() {PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-analytics-id='home-shop-1']")
    public WebElement vacationDealsButton;

    @FindBy(xpath = "//div[@class='subtitle']")
    public WebElement subtitle;


    @FindBy(linkText = "Join for free today.")
    public WebElement joinSkyMiles_forfree;



    @FindBy(id = "first_name" )
    public WebElement name;

    @FindBy(id = "last_name" )
    public WebElement lastname;

    @FindBy(id = "email" )
    public WebElement email;

    @FindBy(id = "postal_code" )
    public WebElement zipcode;

//    @FindAll(
//            {
//                    @FindBy(id = "first_name" ),
//                    @FindBy(id = "last_name" ),
//                    @FindBy(id = "email" ),
//                    @FindBy(id = "postal_code" ),
//            }
//    )
//    public List<WebElement> registrationFromVacationlink;

    @FindBy(id="month")
    public WebElement month;

    @FindBy(id="day")
    public WebElement day;

    @FindBy(id="year")
    public WebElement year;

    @FindBy(id="suffix")
    public WebElement suffix;

    @FindBy(id="country")
    public WebElement country;



    @FindBy(xpath= "//input[@type='submit']")
    public WebElement joinButton;

    @FindBy(xpath= " //input[@value='optin-age']")
    public WebElement checkbox1;

    @FindBy(xpath= "//label[@id='optin-enrollent']//input[@value='optin']")
    public WebElement checkbox2;

    @FindBy(xpath  =("//div[@class='container container-intro'] "))
    public WebElement welcomeText;

    @FindBy(xpath = "//span[@style='font-weight:600']")
    public WebElement numberText;

    @FindBy(xpath = " //div[@class='col-12 px-0 firstRow']//div[@class='row'] ")
    public WebElement promoText;

    @FindBy(xpath = " //span[@class='select-ui-wrapper dropdownSize'] ")
    public WebElement PromoCodeField;

    @FindBy( xpath = " //span[@class='select-ui-optionList-wrapper']")
    public List<WebElement> PromoCodeOption;

    @FindBy(xpath = " //input[@class='smallScreenInput'] ")
    public WebElement skyMylesNumber;

    @FindBy(xpath = "  //button[@class='button ui-link shopBtn cta-red'] ")
    public WebElement skyMylesbutton;





    public void getPromoOption(String promoUI) throws InterruptedException {

        while(PromoCodeOption.contains(promoUI)){
            System.out.println(PromoCodeOption);
            Driver.getDriver().navigate().forward();
            Thread.sleep(2000);
        }
    }

    public void putDOB(){
        new Select(new VacationDealPage().month).selectByIndex(11);
        new Select(new VacationDealPage().day).selectByIndex(11);
        new Select(new VacationDealPage().year).selectByIndex(11);
        new Select(new VacationDealPage().suffix).selectByIndex(1);


    }


    public void vacationDealsButtonClick(){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()", vacationDealsButton);

    }

    public void SkyMilesClick(){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click()", joinSkyMiles_forfree);

    }


}
