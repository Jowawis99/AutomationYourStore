package pages;

public class ViewCartPage extends BasePage{
    private String productName = "(//td[@class='text-left']/a)[2]";
    private String btnRemoveProd= "//button[@data-original-title='Remove']";
    private String emptyCartMessage = "//div[@id='content']/p";

    public ViewCartPage(){
        super(driver);
    }

    public String getProductName() {
        return getText(productName); 
    }

    public void removeProductCart(){
        clickElement(btnRemoveProd);
    }

    public String getEmptyCartText(){
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return getText(emptyCartMessage);
    }
    
}
