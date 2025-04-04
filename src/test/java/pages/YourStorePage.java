package pages;

import org.openqa.selenium.Keys;

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
    }
 
}
