package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class NeedCenterPage {

    public NeedCenterPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(linkText = "Need Help?")
    public WebElement needHelpLink;

    @FindBy(linkText = "Help Center")
    public WebElement HelpCenterLink;











}
