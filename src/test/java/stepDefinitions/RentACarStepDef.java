package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BookingPage;
import pages.FlightStatusPage;
import pages.RentACarPage;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RentACarStepDef {


    @Given("I am on the Home page")
    public void i_am_on_th_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }


    @When("I click on rent a car link")
    public void iClickOnRentACarLink() {
        new RentACarPage().rentACar.click();
    }
    @Then("I should verify that I lend on Car Search page")
    public void i_should_verify_that_i_lend_on_car_search_page() {
        assertEquals("Car Search: Delta Air Lines",Driver.getDriver().getTitle());
    }


}
