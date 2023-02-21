package testNGexamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ImgUpload {
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Anjana S\\Pictures\\Screenshots\\Screenshot (2).png");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demoqa.com/automation-practice-form");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
