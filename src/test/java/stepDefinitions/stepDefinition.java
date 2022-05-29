package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {

    @Given("^User Is On Login Home Page$")
    public void user_is_on_login_home_page() throws Throwable {
      System.out.println("user_is_on_login_home_page");
    }

    @When("^User Enters User \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void user_enters_user_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println("user_enters the details as:: "+strArg1+" as USER_and_PASSWORD_as :: "+strArg2);
    }
    
    @When("^User Enters Users (.+) and Passwords (.+)$")
    public void user_enters_user_and_password(String username, String password) throws Throwable {
    	System.out.println("user_enters :: "+username+" as USER_and_PASSWORD_as :: "+password);
    }

    @Then("^Homepage Is Populated$")
    public void homepage_is_populated() throws Throwable {
    	System.out.println("homepage_is_populated");
    }

    @And("^Devices Gets Displayed$")
    public void devices_gets_displayed() throws Throwable {
    	System.out.println("devices_gets_displayed");
    }

}