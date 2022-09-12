package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInWithAppleIDPage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement SignInAppleIDLink;
    WebElement AppleID;
    WebElement Arrow;
    WebElement Password;
    WebElement ValidationMessage;


    public SignInWithAppleIDPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getSignInAppleIDLink() {
        return driver.findElement(By.xpath("//*[@id=\"login-or-register-page-content\"]/div/div[3]/div/div[1]/div[2]/div/div/div[2]/button"));
    }

    public WebElement getAppleID() {
        return driver.findElement(By.id("account_name_text_field"));
    }

    public WebElement getArrow() {
        return driver.findElement(By.cssSelector(".shared-icon.icon_sign_in"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.id("password_text_field"));
    }

    public WebElement getValidationMessage() {
        return driver.findElement(By.id("errMsg"));
    }

    public void ClickOnAppleLink(){
        this.getSignInAppleIDLink().click();
    }

    public void AppleID(){
        this.getAppleID().sendKeys("marapetro41@gmail.com");
    }

    public void ArrowClick(){
        this.getArrow().click();
    }

    public void InsertPassword(){
        this.getPassword().sendKeys("Sifra123");
    }


}
