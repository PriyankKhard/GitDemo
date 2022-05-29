package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Feature",
		glue = "stepDefinitions")
public class testRunner extends AbstractTestNGCucumberTests
{

}
