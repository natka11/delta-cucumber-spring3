package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HelpCenterPage {

    public HelpCenterPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(linkText = "Need Help?")
    public WebElement needHelpLink;

    @FindBy(linkText = "Help Center")
    public WebElement HelpCenterLink;

    @FindBy(xpath = " //div[@class=' introDescText'] ")
    public WebElement actualContent;

    @FindBy(xpath = " //b[.='Prepare for Travel'] ")
    public WebElement text1;

    @FindBy(xpath = " //b[.='Manage Your Trip'] ")
    public WebElement text2;

    @FindBy(xpath = " //b[.='Day of Travel'] ")
    public WebElement text3;












}
