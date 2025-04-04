package steps;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.SearchResultsPage;
import pages.ViewCartPage;
import pages.YourStorePage;

public class YourStoreStep {
        YourStorePage yourStoreWeb = new YourStorePage();
        SearchResultsPage resultsSearch = new SearchResultsPage();
        ViewCartPage viewCart = new ViewCartPage();

       @Given("Estoy en la web de Your Store")
        public void navigateToYourStore(){
            yourStoreWeb.navigateToYourStore();        
        }

        @When("Busco el producto {string}")
        public void findProduct(String producto){
            yourStoreWeb.searchProduct(producto);
        }

        @And("Agrego al carrito el producto")
        public void addProduct(){
            resultsSearch.clickAddToCart();
            resultsSearch.clickCart();
        }

        @Then("Se visualiza el {string} en el carrito correctamente")
        public void viewCart(String producto){
            String textProduct = viewCart.getProductName();
            Assert.assertEquals(producto, textProduct);
        }

        @When("Remuevo el producto del carrito")
        public void removeProduct(){
            viewCart.removeProductCart();
        }

        @Then("Visualizo el producto removido del carrito")
        public void validateEmptyCart(){
            String textEmptyCart = viewCart.getEmptyCartText();
            Assert.assertEquals(textEmptyCart, "Your shopping cart is empty!");
        }
    
    
}
