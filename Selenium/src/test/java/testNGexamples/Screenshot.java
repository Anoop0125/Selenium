package testNGexamples;

import org.testng.annotations.Test;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Screenshot {
  WebDriver driver;
  @Test
  public void scr() {
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("tutorial");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("tutoria");
	  driver.findElement(By.xpath("//input[@name='submit']")).click();
	  }
  @AfterMethod
  public void afterMethod(ITestResult r) throws IOException{
	  if(ITestResult.SUCCESS==r.getStatus()) {
		  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(f, new File("D:\\Automation Testing\\Screenshot\\"+r.getName()+".jpeg"));
	  }
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
