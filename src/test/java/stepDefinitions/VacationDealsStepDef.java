package stepDefinitions;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.VacationDealPage;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.util.Arrays;
import java.util.List;

import static utilities.SeleniumUtils.switchToWindow;

public class VacationDealsStepDef {



    @When("On home page I click on Vacation Deals link")
    public void on_home_page_i_click_on_vacation_deals_link() throws InterruptedException {

        new VacationDealPage().vacationDealsButtonClick();

//        String windowHandle1 = Driver.getDriver().getWindowHandle();
//        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
//        for (String windowHandle : windowHandles) {
//            if(!windowHandle.equals(windowHandle1)){
//                Driver.getDriver().switchTo().window(windowHandle);
//            }
//        }
        // System.out.println(Driver.getDriver().getTitle());

        switchToWindow("VACATIONING TODAY MEANS MORE : Delta Vacations");
        Assert.assertTrue(Driver.getDriver().getTitle().equals("VACATIONING TODAY MEANS MORE : Delta Vacations"));

    }

    @Then("On the Vacation page there is a subtitle and title are displayed")
    public void on_the_vacation_page_there_is_a_subtitle_and_title_are_displayed() {

        String expectedText = "LIMITED-TIME OFFER FOR SKYMILES® MEMBERS:";
        String actualText = new VacationDealPage().subtitle.getText();

        Assert.assertEquals(expectedText, actualText);
        Assert.assertTrue(new VacationDealPage().joinSkyMiles_forfree.isDisplayed());
    }


    @When("On the Vacation page click on Join SkyMiles link and verify title")
    public void on_the_vacation_page_click_on_join_sky_miles_link_and_verify_title() {
        new VacationDealPage().vacationDealsButtonClick();
        switchToWindow("VACATIONING TODAY MEANS MORE : Delta Vacations");

        new VacationDealPage().SkyMilesClick();

//                String windowHandle1 = Driver.getDriver().getWindowHandle();
//        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
//        for (String windowHandle : windowHandles) {
//            if(!windowHandle.equals(windowHandle1)){
//                Driver.getDriver().switchTo().window(windowHandle);
//            }
//        }
//
//         System.out.println(Driver.getDriver().getTitle());

        switchToWindow("Delta - Join SkyMiles");
        Assert.assertEquals(Driver.getDriver().getTitle(),"Delta - Join SkyMiles");
   }


    @Then("On Join SkyMiles page verify functions of putting data for registration of a new customer")
    public void on_join_sky_miles_page_verify_functions_of_putting_data_for_registration_of_a_new_customer() throws InterruptedException {

        Assert.assertTrue(Driver.getDriver().getTitle().equals("Delta - Join SkyMiles"));

        Faker faker = new Faker();

        new VacationDealPage().name.sendKeys( faker.name().firstName());
        new VacationDealPage().lastname.sendKeys(faker.name().lastName());
        new VacationDealPage().email.sendKeys(faker.internet().safeEmailAddress());
        new VacationDealPage().putDOB();
        new VacationDealPage().checkbox1.click();

       Thread.sleep(1000);
        new VacationDealPage().zipcode.sendKeys(faker.address().zipCode());
        new Select(new VacationDealPage().country).selectByVisibleText("United States");
        new VacationDealPage().checkbox2.click();
        new VacationDealPage().joinButton.click();

        //System.out.println(Driver.getDriver().getTitle());
      //  System.out.println(new VacationDealPage().welcomeText.getText());
        System.out.println(" Your SkyMiles Number is: " + new VacationDealPage().numberText.getText());
        Assert.assertTrue(new VacationDealPage().welcomeText.isDisplayed());
    }


    @When("On the Vacation page click on {string} and {string} \\(required fields)")
    public void on_the_vacation_page_click_on_and_required_fields(String promocode, String string2)  throws InterruptedException {

        new VacationDealPage().vacationDealsButtonClick();
        switchToWindow("VACATIONING TODAY MEANS MORE : Delta Vacations");

//        List<String> strings = Arrays.asList(new VacationDealPage().promoText.getText());
//        System.out.println(strings);

        new VacationDealPage().PromoCodeField.click();
//        new VacationDealPage().PromoCodeOption.isEnabled();
//        new VacationDealPage().PromoCodeOption.sendKeys(promocode);

        System.out.println(new VacationDealPage().PromoCodeOption.getText());

        new VacationDealPage().PromoCodeOption.sendKeys(promocode);

        List<String> strings = Arrays.asList(new VacationDealPage().PromoCodeOption.getText());



      //  new VacationDealPage().PromoCodeOption.click();



        Thread.sleep(2000);


    }


    @Then("Verify the new page with deals")
    public void verify_the_new_page_with_deals() {

    }

}
