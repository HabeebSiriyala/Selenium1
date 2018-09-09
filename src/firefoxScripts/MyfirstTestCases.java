package firefoxScripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MyfirstTestCases {

    
    
	   public static void main(String[] args) {
        
        System.setProperty("webdriver.gecko.driver", "C:\\habeeb\\Selenium\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("http://learn-automation.com");
        
        System.out.println(driver.getTitle());
 
        

    }

}

   
   

