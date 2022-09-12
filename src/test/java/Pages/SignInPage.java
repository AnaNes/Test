package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {


    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement EmailAddress;
    WebElement Password;
    WebElement SignInButton;

    public SignInPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getEmailAddress() {
        return driver.findElement(By.className("text-input-input"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.cssSelector(".text-input-input.password-input"));
    }

    public WebElement getSignInButton() {
        return driver.findElement(By.cssSelector(".login-button.signin-button.button-primary"));
    }

    public void InsertEmail(){
       // this.getEmailAddress().clear();
        this.getEmailAddress().sendKeys("maropetro41@gmail.com");
    }

    public void InsertPassword(){
        this.getPassword().clear();
        this.getPassword().sendKeys("Sifra123");
    }

    public void ClickOnSignIn(){
        this.getSignInButton().click();
    }
}
