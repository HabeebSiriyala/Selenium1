package firefoxScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCase {
	
	public static  WebDriver driver;

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //WebDriver driver =new FirefoxDriver();

        System.setProperty("webdriver.gecko.driver", "C:\\habeeb\\Selenium\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.syncfusion.com/");
         System.out.println("Successfully opened the website www.Syncfusion.com"); 
        
         driver.quit();
    }

}