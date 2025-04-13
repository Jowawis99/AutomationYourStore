package pages;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

    protected static WebDriver driver;
    protected static WebDriverWait wait;

    static {
     WebDriverManager.chromedriver().setup();
     ChromeOptions options = new ChromeOptions();
     options.addArguments("--headless=new");
     driver = new ChromeDriver(options);
     wait = new WebDriverWait(driver, Duration.ofSeconds(15));
 }

   public BasePage(WebDriver driver) {
       BasePage.driver = driver;
   }

   public static void navigateTo(String url) {
       driver.manage().window().maximize();
       driver.get(url);
   }

   public static void closeBrowser(){
        driver.quit();
   }

   private WebElement Find(String locator){
         return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
   }

   public void clickElement(String locator){
        try {
        Find(locator).click();
     } catch (StaleElementReferenceException e) {
               Find(locator).click();
     }
   }

   public void write(String locator, String keyToSend){
        Find(locator).clear();
        Find(locator).sendKeys(keyToSend);
   }

   public String getText(String locator) {
     return Find(locator).getText().trim();
     }
    
}
