package MyRunner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ServiceHooks {
	

	

    @Before
    public void initializeTest(Scenario scenario){
        // Code to setup initial configurations
    	
    	System.out.println("This scenario has started "+scenario.getName());
    	
    	 
    	
    }

    @After
    public void embedScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                // Code to capture and embed images in test reports (if scenario fails)
            	
            	
            	System.out.println("this scenario has failed"+scenario.getName());
            	
            	//driver.close();
            
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
