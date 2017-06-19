package cucumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = { "pretty", "html:target/html" },
        glue = "cucumber/stepdefs",
        features = "src/test/java/cucumber/features/",
        tags = "~@skip1"
        
)
public class RunCucumberTests {
	
	@BeforeClass
	public static void setUp(){
		BaseTests.launchApplication();
	}

	@AfterClass
	public static void tearDown(){
		BaseTests.closeBrowser();
	}

}
