package testNGAssignments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class AssignInputObs {
	WebDriver driver;
  @Test
  public void inputt() {
	  WebElement color=driver.findElement(By.id("single-input-field"));
	  Select obj1=new Select(color);
	  obj1.selectByIndex(2);
	  System.out.println(driver.findElement(By.id("message-one")).isDisplayed());
	  
	  WebElement color1=driver.findElement(By.id("multi-select-field"));
	  Select obj2=new Select(color1);
	  obj2.selectByIndex(1);
	  driver.findElement(By.id("button-first")).click();
	  System.out.println(driver.findElement(By.id("message-two")).isDisplayed());
	  
	  WebElement color2=driver.findElement(By.id("multi-select-field"));
	  Select obj3=new Select(color2);
	  obj3.selectByIndex(2);
	  driver.findElement(By.id("button-all")).click();
	  System.out.println(driver.findElement(By.id("message-two")).isDisplayed());
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/select-input.php");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
