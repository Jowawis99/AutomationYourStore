package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import pages.BasePage;

public class Hooks extends BasePage {
    public Hooks(){
        super(driver);
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            scenario.log("Escenario fallido, consulte la imagen adjunta a este informe.");
            final byte[] screenshot =((TakesScreenshot) driver)
            .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Captura del error");
        }
    }
    
}
