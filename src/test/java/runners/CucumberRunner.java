package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
      tags = "@booking",
        features = "src/test/resources",
        glue = "stepDefinitions"
       // stepNotifications = true
   //  ,dryRun = true   // dryRun scans the resources folder and generates step definition snippets
        // used for generating snippets quickly
        ,snippets = CucumberOptions.SnippetType.UNDERSCORE  // generates Camel Case Style Snippets

)

public class CucumberRunner {

}
