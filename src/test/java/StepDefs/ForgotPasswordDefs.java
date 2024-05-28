package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ForgotPassword;
import pages.LoginPage;
import utility.BrowserDriver;

public class ForgotPasswordDefs extends BrowserDriver {

    @Given("User navigates to the forgot password page")
    public void userNavigatesToTheForgotPasswordPage() throws InterruptedException {
        LoginPage.inputEmail("oktariodarmawan@gmail.com");
        LoginPage.clickForgotPassword();
    }

    @And("User input valid email")
    public void userInputValidEmail() {
        ForgotPassword.inputValidEmail("oktariodarmawan@gmail.com");
    }

    @And("User check the recaptha")
    public void userCheckTheRecaptha() throws InterruptedException {
        ForgotPassword.checkRecaptha();
    }

    @When("User click submit button")
    public void userClickSubmitButton() {
        ForgotPassword.clickSubmitButton();
    }

    @Then("User get email is not registered message")
    public void userGetEmailIsNotRegisteredMessage() {
        ForgotPassword.emailIsNotRegisteredMessage();
    }

    @And("User input invalid email")
    public void userInputInvalidEmail() {
    ForgotPassword.inputInvalidEmail("kevinoktario");
    }

    @Then("User gets invalid email format message")
    public void userGetsInvalidEmailFormatMessage(){
    ForgotPassword.invalidEmailFormatMessage();
    }

    @Then("User get email is not registered message and invalid email message")
    public void userGetEmailIsNotRegisteredMessageAndInvalidEmailMessage() {
    }

    @And("User input empty email")
    public void userInputEmptyEmail() {
        ForgotPassword.userInputEmptyEmailAddress("");
    }

    @And("User check the recaptha without email")
    public void userCheckTheCpatchaWithoutEmail()throws InterruptedException{
    ForgotPassword.clickCapthaWithoutEmail();
    }

    @Then("User gets email is required message")
    public void userGetsEmailIsRequiredMessage() {
   ForgotPassword.emailIsRequiredMessage();
    }

    @And("User does not check the recaptha")
    public void userDoesNotCheckTheRecaptha(){
    ForgotPassword.doesNotClickCaptha();
    }

    @When("User cannot click submit button")
    public void userCannotClickSubmitButton() {
    ForgotPassword.cannotClickSubmitButton();
    }

}
