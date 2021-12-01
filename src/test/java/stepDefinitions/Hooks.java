package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.Driver;

import java.time.Duration;

public class Hooks {

//     Hook methods run before and after each scenario
   @Before
    public void setupScenario(){
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10)) ;
        Driver.getDriver().manage().window().maximize();
    }


    @Before ("@db")
    public void setupScenarioForDb(){
        System.out.println("Database Connection established");

    }

    @After
    public void tearDownScenario(){

        Driver.quitDriver();
    }

    @After ("@db")
    public void tearDownScenarioDB(){
        System.out.println("Close the db connection");

    }



}
