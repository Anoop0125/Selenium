package testNGexamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AlertEg {
	WebDriver driver;
  @Test
  public void alertEg() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@name='submit']")).click();
	  
	  Alert alert=driver.switchTo().alert();
	  Thread.sleep(2000);
	  alert.dismiss();
	  driver.findElement(By.xpath("//input[@name='res']")).click();
	  
	  driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@name='submit']")).click();
	  Thread.sleep(2000);
	  alert.accept();
	  
	  String s=alert.getText();
	  System.out.println(s);
	  alert.accept();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/delete_customer.php");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
