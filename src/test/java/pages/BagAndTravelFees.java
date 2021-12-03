package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BagAndTravelFees {

    public void BagAndTravelFeesPage(){
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//a[@data-analytics-id='home-shop-5']")
    public WebElement BaggageTravelFeesPage;

    @FindBy(xpath = "//a[@href='#baggageFees']")
    public  WebElement CheckedBaggageFees;
}