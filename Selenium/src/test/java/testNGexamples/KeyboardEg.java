package testNGexamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class KeyboardEg {
	WebDriver driver;
  @Test
  public void key() throws AWTException {
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("tutorial");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("tutorial");
	  Robot r=new Robot();
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	 
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/newtours/index.php");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
