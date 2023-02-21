package dragDropEg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class DragDrop {
	WebDriver driver;
  @Test
  public void dragdropExample() {
	  WebElement source=driver.findElement(By.xpath("//a[text()=' BANK ']"));
	  WebElement destination=driver.findElement(By.id("bank"));
	  Actions act=new Actions(driver);
	  act.dragAndDrop(source, destination);
	  act.perform();
	  
	  WebElement source1=driver.findElement(By.xpath("//a[text()=' 5000 ']"));
	  WebElement destination2=driver.findElement(By.id("amt7"));
	  act.dragAndDrop(source1, destination2);
	  act.perform();
	  
	 
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/drag_drop.html");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
