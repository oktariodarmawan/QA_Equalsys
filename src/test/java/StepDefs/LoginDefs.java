package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.LoginPage;
import utility.BrowserDriver;

public class LoginDefs extends BrowserDriver {

    @Given("User navigates to the login page")
    public void user_navigates_to_the_login_page() {
    LoginPage.logos();
    }

    @And("User enters the valid email")
    public void user_enters_the_valid_email()  {
        LoginPage.inputEmail("oktariodarmawan@gmail.com");

    }

    @And("User enters the valid password")
    public void user_enters_the_valid_password(){
        LoginPage.inputPassword("kevinkevin123!");

    }

    @When("User click the Login button")
    public void user_click_the_login_button(){
        LoginPage.clickLoginButton();
    }

    @Then("User gets the alert message")
    public void user_gets_the_alert_message() {
        LoginPage.errormessagedisplay();
    }

    @And("User enters empty password")
    public void userEntersEmptyPassword() {
        LoginPage.emptyPassword();
    }

    @Then("User gets the Required password message")
    public void userGetsTheRequiredPasswordMessage() {
        LoginPage.requiredPasswordMessage();
    }

    @And("User enters the empty email")
    public void userEntersTheEmptyEmail() {
        LoginPage.inputEmail("");
    }
    @When("User cannot click the Login button")
    public void userCantClickLoginButton(){
        LoginPage.cantClickLoginButton();
    }

    @Then("User gets the required email message and required password message")
    public void userGetsTheRequiredEmailMessageAndRequiredPasswordMessage() {
        LoginPage.requiredEmailMessage();
        LoginPage.requiredPasswordMessage();
    }

    @And("User enters the invalid email format")
    public void userEntersTheInvalidEmailFormat() {
        LoginPage.inputEmail("kevinoktario");

    }

    @And("User enters valid password")
    public void userEntersValidPassword() {
        LoginPage.inputPassword("KevinKevin123");
    }

    @Then("User gets the Required invalid email message")
    public void userGetsTheRequiredValidEmailMessage() {
        LoginPage.invalidFormatMessage();
    }
}
