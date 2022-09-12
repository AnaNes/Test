package Base;

import Pages.SignInPage;
import Pages.SignInWithAppleIDPage;
import Pages.SignInWithGooglePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {

public WebDriver driver;
public WebDriverWait wdwait;
public SignInWithAppleIDPage signInWithAppleIDPage;
public SignInWithGooglePage signInWithGooglePage;
public SignInPage signInPage;


@BeforeClass
    public void setUp(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
    signInPage = new SignInPage(driver,wdwait);
    signInWithAppleIDPage = new SignInWithAppleIDPage(driver,wdwait);
    signInWithGooglePage = new SignInWithGooglePage(driver,wdwait);


}

    public void vissibilityWait(WebElement element){
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }




    @AfterClass
    public void tearDown(){
        //driver.quit();
        //driver.close();
    }


}
