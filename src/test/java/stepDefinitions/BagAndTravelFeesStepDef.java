package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.BagAndTravelFees;
//import pages.BookingPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.util.List;
import java.util.Locale;
import java.util.Map;

public class BagAndTravelFeesStepDef {

    String twoOption;

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("I click on Updated Bag & Travel Fees")
    public void i_click_on_updated_bag_travel_fees() {

        SeleniumUtils.scroll(0, 600);
        new BagAndTravelFees().BaggageTravelFeesPage.click();
    }

    @Then("I should land on the Updated Bag & Travel Fees Page")
    public void i_should_land_on_the_updated_bag_travel_fees_page() {

        String expected = "Baggage & Travel Fees";
        Assert.assertEquals(expected, new BagAndTravelFees().BaggageAndTravelFeesCategory.getText());

    }

    @When("I click on {string}")
    public void iClickOn(String option) {
        twoOption = option;
        new BagAndTravelFees().clickOnProductLink(option);

    }

    @Then("The price for the first standard checked bag should be {double}")
    public void the_price_for_the_first_standard_checked_bag_should_be(Double expectedPrice1) {

        Double actualPrice = Double.valueOf(new BagAndTravelFees().Price1.getText().substring(1, 3));
        Assert.assertEquals(expectedPrice1, actualPrice);

    }

    @Then("The price for the second standard checked bag should be {double}")
    public void the_price_for_the_second_standard_checked_bag_should_be(Double expectedPrice2) {

        Double actualPrice = Double.valueOf(new BagAndTravelFees().Price2.getText().substring(1, 3));
        Assert.assertEquals(expectedPrice2, actualPrice);
    }

    @When("I click on Track Checked Baggage page")
    public void i_click_on_track_checked_baggage_page() {

        SeleniumUtils.scroll(0, 600);
        // new BagAndTravelFees().TrackCheckedBaggage.click();
        SeleniumUtils.jsClick(new BagAndTravelFees().TrackCheckedBaggage);
    }

    @Then("I should be able to search by BTN and enter the BagTagNumber and enter LastName")
    public void i_should_be_able_to_search_by_and_enter_the_and_enter(List<Map<String, String>> dataTable) {


        SeleniumUtils.scroll(0, 500);
        new BagAndTravelFees().BagTagNumber.sendKeys(dataTable.get(0).get("BagTagNumber"));
        new BagAndTravelFees().LastName.sendKeys(dataTable.get(0).get("LastName"));
    }

     @Then("I should have an error message because I entered invalid information")
     public void i_should_have_an_error_message_because_invalid_information(){

            new BagAndTravelFees().CheckBoxStatus.click();
            String expected = "To continue, please correct";
            String pageSource = Driver.getDriver().getPageSource();
            Assert.assertTrue(pageSource.contains(expected));
    }
    @When("I click on My Trip button")
    public void i_click_on_my_trip_button() {

        SeleniumUtils.jsClick(new BagAndTravelFees().MyTrip);
    }

    @Then("I should land on find my trip page")
    public void i_should_land_on_find_my_trip_page() {

        String expected = "Find Your Trip";
        String actualMessage = new BagAndTravelFees().FindYourTrip.getText();
        Assert.assertEquals(expected.toUpperCase(Locale.ROOT), actualMessage);

    }

    @Then("The MORE option category should include")
    public void the_more_option_category_should_include(List<String> expectedOption) {

        List<String> actualOption = SeleniumUtils.getElementsText(new BagAndTravelFees().MoreOptions);

        Assert.assertEquals(expectedOption, actualOption);
    }

        @Then("The find my trip options should be the following")
        public void the_find_my_trip_options_should_be_the_following(List<String> expectedTripOption) {

         List<String> actualOptions = SeleniumUtils.getElementsText(new BagAndTravelFees().FindMyTripOptions);

         Assert.assertEquals(expectedTripOption, actualOptions);
        }
    }

