package pages;

public class SearchResultsPage extends BasePage {
    
    private String btnAddCart = "//span[normalize-space()='Add to Cart']";
    private String btnCart = "//span[@id='cart-total']";
    private String btnViewCart = "//strong[normalize-space()='View Cart']";
    
    public SearchResultsPage(){
        super(driver);
    }

    public void clickAddToCart(){
        clickElement(btnAddCart);
    }

    public void clickCart(){
        clickElement(btnCart);
        clickElement(btnViewCart);
    }

}
