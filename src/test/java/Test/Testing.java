package Test;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Testing extends BaseTest {

    @BeforeMethod
    public void pageSetUp(){
        driver.manage().window().maximize();
        driver.navigate().to("https://www.dropbox.com/login");
    }

    @Test
    public void SignInPage() throws InterruptedException {
        Thread.sleep(3000);
        signInPage.InsertEmail();
        signInPage.InsertPassword();
        Thread.sleep(2000);
        signInPage.ClickOnSignIn();
    }

    @Test
    public void SignInWithGoogle() throws InterruptedException {

        Thread.sleep(10000);
        signInWithGooglePage.clickOnSignInLink();
        Set<String> windows =driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentid = it.next();
        String childid = it.next();
        driver.switchTo().window(childid);
        Thread.sleep(6000);
        signInWithGooglePage.InsertEmail();
        Thread.sleep(10000);
        signInWithGooglePage.ClickOnNext();
        signInWithGooglePage.Password();
        Thread.sleep(2000);
        signInWithGooglePage.ClickOnNext();

    }

    @Test
    public void AppleSignIn() throws InterruptedException {
        Thread.sleep(5000);
        signInWithAppleIDPage.ClickOnAppleLink();

        Set<String> windows =driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentid = it.next();
        String childid = it.next();
        driver.switchTo().window(childid);
        Thread.sleep(10000);
        signInWithAppleIDPage.AppleID();
        Thread.sleep(2000);
        signInWithAppleIDPage.ArrowClick();
        Thread.sleep(5000);
        signInWithAppleIDPage.InsertPassword();
        signInWithAppleIDPage.ArrowClick();
        Assert.assertTrue(signInWithAppleIDPage.getValidationMessage().isDisplayed());
    }

   @AfterMethod
   public void removeCookies(){
       driver.manage().deleteAllCookies();
   }



}
