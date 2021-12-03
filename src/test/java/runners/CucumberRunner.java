package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
      tags ="@flightStatus",
        features = "src/test/resources",
        glue = "stepDefinitions",
       stepNotifications = true
   //,dryRun = true   // dryRun scans the resources folder and generates step definition snippets
        // used for generating snippets quickly
        ,snippets = CucumberOptions.SnippetType.UNDERSCORE  // generates Camel Case Style Snippets
//        ,plugin = {
//        "pretty",  // displays more detailed output on the console
//        "html:target/cucumber-built-in-report.html", // generates built in html report at the given the path
//        "json:target/cucumber.json"
//}

)

public class CucumberRunner {

}
