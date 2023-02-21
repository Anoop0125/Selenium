package testNGAssignments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AssignmentObsRadio {
	WebDriver driver;
  @Test
  public void radio() {
	  driver.findElement(By.id("inlineRadio2")).click();
	  driver.findElement(By.id("button-one")).click();
	  System.out.println(driver.findElement(By.id("message-one")).isDisplayed());
	  
	  driver.findElement(By.id("inlineRadio21")).click();
	  
	  driver.findElement(By.id("inlineRadio23")).click();
	  
	  driver.findElement(By.id("button-two")).click();
	  System.out.println(driver.findElement(By.id("message-two")).isDisplayed());	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
