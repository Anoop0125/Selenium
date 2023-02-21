package testNGAssignments;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Assignment1 {
	WebDriver driver;
  @Test
  public void validateTitle() {
	  String actualtitle=driver.getTitle();
	  Assert.assertEquals(actualtitle, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	  Assert.assertNotNull(driver);
	  String actualurl=driver.getCurrentUrl();
	  SoftAssert obj=new SoftAssert();
	  obj.assertEquals(actualurl, "https://www.flipkart.com/");
	  obj.assertAll();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }


}
