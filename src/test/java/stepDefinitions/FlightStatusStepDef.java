package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

import org.openqa.selenium.Keys;
import pages.FlightStatusPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.SeleniumUtils;

public class FlightStatusStepDef {


    @Given("I am on home page")
    public void i_am_on_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }


    @When("I click on Flight Status link")
    public void iClickOnFlightStatusLink() {
        new FlightStatusPage().flightStatus.click();
    }
    @Then("I should verify that I lend on \"Flight Status\"page")
    public void i_should_verify_that_i_lend_on_flight_status_page() {
   assertTrue(new FlightStatusPage().searchByDateLbl.isDisplayed());
    }




    @Then("I should be able to select valid date on a calendar")
    public void iShouldBeAbleToSelectValidDateOnACalendar() {
        new FlightStatusPage().calendar.click();
        new FlightStatusPage().selectDate();
    }

    @Then("Selected date should be displayed")
    public void selectedDateShouldBeDisplayed() {
        assertTrue(new FlightStatusPage().date.isDisplayed());
    }



    @Then("I should be able to enter valid flight number")
    public void iShouldBeAbleToEnterValidFlightNumber() {

        new FlightStatusPage().enterFlightNo.sendKeys("326");
    }


    @And("Flight number should be displayed")
    public void flightNumberShouldBeDisplayed() {
        assertTrue(new FlightStatusPage().enterFlightNo.isDisplayed());
    }

    @Then("I am able to leave flight number info field empty")
    public void iAmAbleToLeaveFlightNumberInfoFieldEmpty() {
        new FlightStatusPage().enterFlightNo.sendKeys(""+ Keys.ENTER);

    }

    @Then("error msg should appear")
    public void errorMsgShouldAppear() {
        assertTrue(new FlightStatusPage().FLIGHT_NUM_REQD.isDisplayed());
    }

    @Then("Enter valid departure city")
    public void enterValidDepartureCity() {
        new FlightStatusPage().departCity.sendKeys("LAX");
    }

    @Then("Departure city info should be displayed")
    public void departureCityInfoShouldBeDisplayed() {
        assertTrue(new FlightStatusPage().departCity.isDisplayed());
    }

    @Then("Enter invalid departure city")
    public void enterInvalidDepartureCity() {
        new FlightStatusPage().departCity.sendKeys("788"+Keys.ENTER);
    }

    @Then("invalid airport msg should be displayed")
    public void invalidAirportMsgShouldBeDisplayed() {
        assertTrue(new FlightStatusPage().departureError.isDisplayed());
    }

    @Then("Enter valid arrival city")
    public void enterValidArrivalCity() {
        new FlightStatusPage().arrivalCity.sendKeys("JFK");
    }

    @Then("Arrival city info should be displayed")
    public void arrivalCityInfoShouldBeDisplayed() {
        assertTrue(new FlightStatusPage().arrivalCity.isDisplayed());
        
    }

    @Then("Enter invalid arrival city")
    public void enterInvalidArrivalCity() {
        new FlightStatusPage().arrivalCity.sendKeys("6789"+Keys.ENTER);
    }

    @Then("Search error msg should be displayed")
    public void searchErrorMsgShouldBeDisplayed() {
        assertTrue(new FlightStatusPage().arrivalError.isDisplayed());

    }


}
