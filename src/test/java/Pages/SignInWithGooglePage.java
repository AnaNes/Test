package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInWithGooglePage {

    public WebDriver driver;
    public WebDriverWait webDriverWait;
    WebElement SignInWithGooglelink;
    WebElement AddAnotherEmail;
    WebElement NextButton;
    WebElement InsertPassword;
    WebElement AcceptCookies;


    public SignInWithGooglePage(WebDriver driver, WebDriverWait webDriverWait) {
        this.driver = driver;
        this.webDriverWait = webDriverWait;
    }

    public WebElement getAcceptCookies() {
        return driver.findElement(By.xpath("//*[@id=\"_evidon-accept-button\"]"));
    }

    public WebElement getSignInWithGooglelink() {
        return driver.findElement(By.xpath("//*[@id=\"login-or-register-page-content\"]/div/div[3]/div/div[1]/div[2]/div/div/div[1]/button/div[2]"));
    }


    public WebElement getAddAnotherEmail() {
        return driver.findElement(By.id("identifierId"));
    }
        public WebElement getNextButton () {
            return driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span"));
        }

        public WebElement getInsertPassword () {
            return driver.findElement(By.cssSelector(".whsOnd.zHQkBf"));
        }

        public void AcceptCookies(){
        this.getAcceptCookies().click();
        }


        public void clickOnSignInLink () {
            this.getSignInWithGooglelink().click();
        }


        public void InsertEmail () {
            this.getAddAnotherEmail().click();
            this.getAddAnotherEmail().sendKeys("marapetro41@gmail.com");
        }

        public void ClickOnNext () {
            this.getNextButton().click();
        }

        public void Password () {
            this.getInsertPassword().clear();
            this.getInsertPassword().sendKeys("Sifra123");
        }
    }

