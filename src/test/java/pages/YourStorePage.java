package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class YourStorePage extends BasePage {

    private String inputSearch = "//input[@placeholder='Search']";

    public YourStorePage(){
        super(driver);
    }

    public void navigateToYourStore(){
        navigateTo("http://opencart.abstracta.us/");
    }

    public void searchProduct(String ProductName){
        write(inputSearch, ProductName + Keys.ENTER);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("iPhone")));
    }
 
}
