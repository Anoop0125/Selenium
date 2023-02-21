package testNGexamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AssertionEg {
	WebDriver driver;
  @Test
  public void validateTitle() {
	  String actualtitle=driver.getTitle();
	  String actualurl=driver.getCurrentUrl();
	  Assert.assertEquals(actualtitle,"Obsqura Testing");
	  Assert.assertEquals(actualurl,"https://selenium.obsqurazone.com/simple-form-demo.php");
	  Assert.assertNotNull(driver);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\New folder (2)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
