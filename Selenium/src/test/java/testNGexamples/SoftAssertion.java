package testNGexamples;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SoftAssertion {
	WebDriver driver;
  @Test
  public void softAssert() {
	  String actualtitle=driver.getTitle();
	  String actualurl=driver.getCurrentUrl();
	  SoftAssert obj=new SoftAssert();
	  obj.assertEquals(actualtitle, "Obsqura Testing");
	  obj.assertEquals(actualurl, "https://selenium.obsqurazone.com/simple-form-dem.php");
	  obj.assertAll();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
