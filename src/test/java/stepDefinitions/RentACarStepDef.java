package stepDefinitions;

import com.sun.org.apache.bcel.internal.generic.Select;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.FlightStatusPage;
import pages.RentACarPage;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RentACarStepDef {


    @Given("I am on the Home page")
    public void i_am_on_the_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }


    @When("I click on rent a car link")
    public void iClickOnRentACarLink() {
        new RentACarPage().rentACar.click();
    }
    @Then("I should verify that I land on \"Car Search\" page")
    public void i_should_verify_that_i_land_on_car_search_page() {
        assertEquals("Car Search: Delta Air Lines",Driver.getDriver().getTitle());
    }

    @Then("Enter a valid pick-up location")
    public void enterAValidPickUpLocation() {

        new RentACarPage().pickUpLocation.sendKeys("WAS" + Keys.ARROW_DOWN + Keys.ENTER);
    }

    @And("pick-up location info should be displayed")
    public void pickUpLocationShouldBeDisplayed() {
        assertEquals("WASHINGTON DC",new RentACarPage().pickUpLocation.getAttribute("value"));

    }

    @Then("Select a valid pick-up date on a calendar")
    public void selectAValidPickUpDateOnACalendar() {
        new RentACarPage().selectPickUpDate();;

    }

    @And("pick-up date info should be displayed")
    public void pickUpDateShouldBeDisplayed() {
        assertEquals("12/15/2021",new RentACarPage().pickUpDate.getAttribute("value"));

    }

    @Then("Select a valid drop-off date on a calendar")
    public void selectAValidDropOffDateOnACalendar() {
        new RentACarPage().selectDropOffDate();;

    }

    @And("drop-off date info should be displayed")
    public void dropOffDateShouldBeDisplayed() {
        assertEquals("01/15/2021",new RentACarPage().pickUpDate.getAttribute("value"));

    }

    @Then("Select a valid pick-up time")
    public void selectAValidPickUpTime() {
        new RentACarPage().selectPickUpTime(1);


    }

    @And("pick-up time info should be displayed")
    public void pickUpTimeShouldBeDisplayed() {
        assertEquals("10:30 AM",new RentACarPage().pickUpTime.getAttribute("value"));

    }

    @Then("Select a valid drop-off time")
    public void selectAValidDropOffTime() {

        new RentACarPage().selectDropOffTime(3);

    }

    @And("drop-off time info should be displayed")
    public void dropOffTimeShouldBeDisplayed() {
        assertEquals("11:30 AM",new RentACarPage().dropOffTime.getAttribute("value"));

    }

    @Then("Select a valid age")
    public void selectAValidAge() {

        new RentACarPage().selectAge(6);

    }

    @And("age info should be displayed")
    public void ageShouldBeDisplayed() {
        assertEquals("24",new RentACarPage().age.getAttribute("value"));

    }

    @When("I click on book a car button")
    public void iClickOnBookACarButton() {
        new RentACarPage().bookACarButton.click();
    }
    @Then("I should verify that I land on \"Car Booking\" page")
    public void i_should_verify_that_i_land_on_car_booking_page() {
        assertEquals("Car Search Results: Delta Air Lines",Driver.getDriver().getTitle());
    }


}
