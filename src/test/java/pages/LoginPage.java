package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.time.Duration;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoginPage extends BrowserDriver {

    public static String emailField = "//*[@id='userName']";
    public static String passwordField = "//*[@id='password']";
    public static String loginBtn = "//*[@id='btnLogin']";
    public static String errorMessage = "//p[@class='label label-danger']";
    public static String advansysLogo = "//img[@clas='logo-login']";
    public static String requiredPasswordText = "//small[@class='help-block' and @data-fv-for='password']";
    public static String requiredEmailText = "//small[@class='help-block' and @data-fv-for='username']";
    public static String invalidFormatText = "//small[@class='help-block' and @data-fv-validator='emailAddress']";

    public static String forgotPasswordButton = "//a[@class='forgot-password']";

    public static void inputEmail(String email) {
        WebElement element = driver.findElement(By.xpath(emailField));
        driver.findElement(By.xpath(emailField)).sendKeys(email);

        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(d -> element.isDisplayed());
    }

    public static void inputPassword(String password){
        driver.findElement(By.xpath(passwordField)).sendKeys(password);
    }

    public static void clickLoginButton(){
        WebElement element = driver.findElement(By.xpath(loginBtn));
        driver.findElement(By.xpath(loginBtn)).click();
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(d -> element.isDisplayed());
    }

    public static void errormessagedisplay(){
        WebElement element = driver.findElement(By.xpath(errorMessage));
        driver.findElement(By.xpath(errorMessage));
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(d -> element.isDisplayed());
    }

    public static void logos(){
        WebElement element = driver.findElement(By.xpath(advansysLogo));
         driver.findElement(By.xpath(advansysLogo));

        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(d -> element.isDisplayed());
         assertTrue("element tidak terlihat ", element.isDisplayed());
    }

    public static void requiredPasswordMessage(){
        WebElement element = driver.findElement(By.xpath(requiredPasswordText));
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d -> element.isDisplayed());
        assertTrue("element tidak terlihat ", element.isDisplayed());
    }

    public static void requiredEmailMessage(){
        WebElement element = driver.findElement(By.xpath(requiredEmailText));
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d -> element.isDisplayed());
        assertTrue("element tidak terlihat ", element.isDisplayed());
    }

    public static void invalidFormatMessage(){
        WebElement element = driver.findElement(By.xpath(invalidFormatText));
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d -> element.isDisplayed());
        assertTrue("element tidak terlihat ", element.isDisplayed());
    }

    public static void cantClickLoginButton(){
        WebElement element = driver.findElement(By.xpath(loginBtn));
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d -> element.isDisplayed());
        assertFalse("Element seharusnya tidak dapat diklik", element.isEnabled());

    }
    public static void emptyPassword(){
        WebElement element = driver.findElement(By.xpath(passwordField));
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d -> element.isDisplayed());
        driver.findElement(By.xpath(passwordField)).sendKeys(Keys.TAB);
    }

    public static void clickForgotPassword()  {

        WebElement element = driver.findElement(By.xpath(forgotPasswordButton));
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d -> element.isDisplayed());
        driver.findElement(By.xpath(forgotPasswordButton)).click();
        driver.findElement(By.xpath(forgotPasswordButton)).click();


    }

}
