package TestNG11;

import java.util.regex.Pattern;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateUser {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://dell-pc-mbs:8080//";
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @Test
  public void testCreateuser() throws Exception {
    driver.get(baseUrl + "//THERAPY//Maintenance//CreateUser.jsp");
    driver.findElement(By.linkText("Create User")).click();
    driver.findElement(By.id("uname")).clear();
    driver.findElement(By.id("uname")).sendKeys("hadgb");
    driver.findElement(By.id("uname")).clear();
    driver.findElement(By.id("uname")).sendKeys("habeeb");
    driver.findElement(By.id("pword")).clear();
    driver.findElement(By.id("pword")).sendKeys("1234");
    driver.findElement(By.id("pword1")).clear();
    driver.findElement(By.id("pword1")).sendKeys("1234");
    new Select(driver.findElement(By.id("urole"))).selectByVisibleText("User");
    driver.findElement(By.id("Search")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
