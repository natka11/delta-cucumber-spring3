package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        tags = "@test", //@second and @temp , @second or @temp, not @temp, @test or @temp and @second,  (@test or @temp) and @second
        features = "src/test/resources",
        glue = "stepDefinitions",
        stepNotifications = true
    //  ,dryRun = true   // dryRun scans the resources folder and generates step definition snippets
        // used for generating snippets quickly
        ,snippets = CucumberOptions.SnippetType.CAMELCASE  // generates Camel Case Style Snippets
)

public class CucumberRunner {

}
