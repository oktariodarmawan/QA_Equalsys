package pages;

import com.twocaptcha.captcha.ReCaptcha;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utility.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;
import com.twocaptcha.TwoCaptcha;


import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ForgotPassword extends BrowserDriver {

    public static String emailField = "//input[@class='form-control field-username']";
    public static String requiredEmailText = "//small[@class='help-block' and @data-fv-validator='notEmpty']";
    public static String invalidEmailText = "//small[@class='help-block' and @data-fv-validator='emailAddress']";
    public static String reCapthafield = "//*[@id='recaptcha']/div/div/iframe";
    public static String submitButton = "//button[@class='btn btn-lg btn-primary btn-block mt20']";
    public static String emailIsnotRegisteredText= "//p[@class='label label-danger']";

    public static String captchaBox = "//span[@id='recaptcha-anchor']";




    public static void inputValidEmail(String email){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe("https://qa.eqlsys.site/#forgot_password"));
        driver.findElement(By.xpath(emailField)).sendKeys(email);
    }

    public static void checkRecaptha() {

        System.out.println("Please solve the captha manually, after that wait until 30 seconds and automation will run again");
        WebElement element = driver.findElement(By.xpath(submitButton));
        String framename = driver.findElement(By.tagName("iframe")).getAttribute("name");
        driver.switchTo().frame(framename);
        driver.findElement(By.xpath("//span[@id='recaptcha-anchor']")).click();driver.switchTo().defaultContent();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }


    public static void clickSubmitButton(){
        WebElement element = driver.findElement(By.xpath(submitButton));
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d -> element.isDisplayed());
        driver.findElement(By.xpath(submitButton)).click();

    }

    public static void emailIsNotRegisteredMessage(){
        WebElement element = driver.findElement(By.xpath(emailIsnotRegisteredText));
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(d -> element.isDisplayed());
    }

    public static void inputInvalidEmail(String email){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe("https://qa.eqlsys.site/#forgot_password"));
        driver.findElement(By.xpath(emailField)).sendKeys(email);
    }

    public static void cannotClickSubmitButton(){
        WebElement element = driver.findElement(By.xpath(submitButton));
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d -> element.isDisplayed());
        assertFalse("Element seharusnya tidak dapat diklik", element.isEnabled());
    }

    public static void invalidEmailFormatMessage(){
        WebElement element = driver.findElement(By.xpath(invalidEmailText));
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d -> element.isDisplayed());
    }

    public static void emailIsRequiredMessage(){
        WebElement element = driver.findElement(By.xpath(requiredEmailText));
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d -> element.isDisplayed());
    }

    public static void doesNotClickCaptha(){
        String framename = driver.findElement(By.tagName("iframe")).getAttribute("name");
        driver.switchTo().frame(framename);
        driver.switchTo().defaultContent();
        
    }

    public static void userInputEmptyEmailAddress(String email){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe("https://qa.eqlsys.site/#forgot_password"));
        driver.findElement(By.xpath(emailField)).sendKeys(email);
    }
    public static void clickCapthaWithoutEmail() throws InterruptedException{
        System.out.println("Please solve the captha manually, after that wait until 30 seconds and automation will run again");
        String framename = driver.findElement(By.tagName("iframe")).getAttribute("name");
        driver.switchTo().frame(framename);
        driver.findElement(By.xpath("//span[@id='recaptcha-anchor']")).click();
        driver.switchTo().defaultContent();
        Thread.sleep(Duration.ofSeconds(30));
    }

}
