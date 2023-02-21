package dragDropEg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class HoverEg {
	WebDriver driver;
  @Test
  public void hoverEg() {
	  WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
	  WebElement flight=driver.findElement(By.xpath("//a[text()='Flights']"));
	  WebElement hotels=driver.findElement(By.xpath("//a[text()='Hotels']"));
	  
	  Actions act=new Actions(driver);
	  act.moveToElement(home).moveToElement(flight).moveToElement(hotels);
	  act.contextClick(home);
	  
	  WebElement username=driver.findElement(By.xpath("//input[@name='userName']"));
	  act.doubleClick(username);
	  
	  act.perform();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
