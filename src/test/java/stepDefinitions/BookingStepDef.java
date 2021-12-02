package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

import org.openqa.selenium.Keys;
import pages.BookingPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.util.List;

public class BookingStepDef {

    BookingPage bookingPage;
    String actual;
    String expected;
    String departureCity1;
    String pageSource;
    String expectedMsg1;
    String emptyDepartureCity;
    String destinationCity;


    @Given("When I am on home page")
    public void whenIAmOnHomePage() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @When("I click on {string} link")
    public void i_click_on_link(String bookingLink) {
      bookingPage=new BookingPage();
        actual = bookingLink;
     bookingPage.bookingClick();
    }


    @Then("I should verify that link is correct")
    public void i_should_verify_that_link_is_correct() {
     expected = "BOOK";
    }
    @Then("I should be able to enter my booking information")
    public void i_should_be_able_to_enter_my_booking_information() {
        assertEquals("Airline Tickets & Flights: Book Direct with Delta Air Lines - Official Site",Driver.getDriver().getTitle());
        assertTrue(bookingPage.book.isEnabled());
        assertEquals(expected,actual);

    }




    @Then("I should be able to enter valid departure city name")
    public void i_should_be_able_to_enter_valid_departure_city_name() {
     new BookingPage().enterDepartureCity();


    }

    @Then("Departure city should appear in departure field.")
    public void departure_city_should_appear_in_departure_field() {
   assertTrue(new BookingPage().departureCity.isDisplayed());

    }

    @Then("I should be able to enter valid destination city name")
    public void i_should_be_able_to_enter_valid_destination_city_name() {
        new BookingPage().destinationCity.sendKeys("JFK"+Keys.ENTER);



    }
    @Then("Destination city should appear in destination field.")
    public void destination_city_should_appear_in_destination_field() {
       assertTrue(new BookingPage().departureCity.isDisplayed());

    }



    @Then("I am able to select trip type.")
    public void iAmAbleToSelectTripType() {
        bookingPage=new BookingPage();
        bookingPage.tripType.sendKeys(Keys.PAGE_DOWN,Keys.ENTER);
       String actual= bookingPage.tripType.getText();
       String expexted = bookingPage.roundTrip.getText();
    }


    @Then("My selected trip type should appear on booking page.")
    public void mySelectedTripTypeShouldAppearOnBookingPage() {
        String actual= bookingPage.tripType.getText();
        String expexted = bookingPage.roundTrip.getText();
        assertEquals(expected,actual);

    }


    @Then("I should be able leave  departure city field empty")
    public void iShouldBeAbleLeaveDepartureCityFieldEmpty() {
        new BookingPage().departureCity.click();
        new BookingPage().searchDepartureCity.clear();
        new BookingPage().searchDepartureCity.sendKeys("");
        new BookingPage().submitClick();
    }
    @Then("The error message should be there")
    public void theErrorMessageShouldBeThere() {
        assertTrue(new BookingPage().errorMsgDC.isDisplayed());

    }



}
