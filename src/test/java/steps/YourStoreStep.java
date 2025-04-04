package steps;

import io.cucumber.java.en.*;
import pages.YourStorePage;

public class YourStoreStep {
        YourStorePage yourStoreWeb = new YourStorePage();


       @Given("Estoy en la web de Your Store")
        public void NavigateToYourStore(){
            yourStoreWeb.navigateToYourStore();        
        }

        @When("Busco el producto {string}")
        public void FindProduct(String producto){
            yourStoreWeb.searchProduct(producto);
        }
    
    
}
