package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import pages.HelpCenterPage;
import utilities.Driver;

public class HelpCenterStepDefs {

    @When("On home page I click on the NeedHelp? link and on the Help Center link")
    public void on_home_page_i_click_on_the_need_help_link_and_on_the_help_center_link() {
        HelpCenterPage helpcenter = new HelpCenterPage();
        helpcenter.needHelpLink.click();
        helpcenter.HelpCenterLink.click();
        System.out.println(Driver.getDriver().getTitle());


    }



    @Then("On the Help Center page I verify content {string}")
    public void on_the_help_center_page_i_verify_content(String contentHelpCenterUI) {
        Driver.getDriver().get("https://www.delta.com/us/en/need-help/overview");
        Assert.assertEquals(Driver.getDriver().getTitle(),"Help Center : Get Help with Reservations, Baggage & More : Delta Air Lines");

       Assert.assertTrue(new HelpCenterPage().actualContent.isDisplayed());

       String expected = "We want you to get where you're going faster. Review our most popular ways to quickly manage your trip yourself, maintain your SkyMiles® account, explore helpful policy details and, if needed, find out how to contact us. ";
       String uitext = contentHelpCenterUI;

       SoftAssertions softAssertions = new SoftAssertions();
       softAssertions.assertThat(expected.toLowerCase().equals(uitext.toLowerCase()));
       softAssertions.assertAll();


    }
        @Then("On the Help Center page I verify visibility of {string}, {string}, {string}")
        public void on_the_help_center_page_i_verify_visibility_of(String string, String string2, String string3) {

            Assert.assertTrue(new HelpCenterPage().text1.isDisplayed());
            Assert.assertTrue(new HelpCenterPage().text2.isDisplayed());
            Assert.assertTrue(new HelpCenterPage().text3.isDisplayed());
    }
}
