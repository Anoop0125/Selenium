package testNGexamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class RadioButtonExamples {
	WebDriver driver;
  @Test
  public void radioButton() {
	  List<WebElement>obj=driver.findElements(By.xpath("//input[@name='tripType']"));
	  obj.get(1).click();
	  
	  //Handling DropDown
	  
	  WebElement passenger=driver.findElement(By.xpath("//select[@name='passCount']"));
	  Select obj1=new Select(passenger);
	  obj1.selectByIndex(2);
	  
	  WebElement departing=driver.findElement(By.xpath("//select[@name='fromPort']"));
	  Select obj2=new Select(departing);
	  obj2.selectByValue("Paris");
	  
	  WebElement month=driver.findElement(By.xpath("//select[@name='fromMonth']"));
	  Select obj3=new Select(month);
	  obj3.selectByVisibleText("April");
	  
	  WebElement date=driver.findElement(By.xpath("//select[@name='fromDay']"));
	  Select obj4=new Select(date);
	  obj4.selectByVisibleText("25");
	  
	  WebElement arriving=driver.findElement(By.xpath("//select[@name='toPort']"));
	  Select obj5=new Select(arriving);
	  obj5.selectByValue("New York");
	  
	  WebElement month1=driver.findElement(By.xpath("//select[@name='toMonth']"));
	  Select obj6=new Select(month1);
	  obj6.selectByIndex(5);
	  
	  WebElement date1=driver.findElement(By.xpath("//select[@name='toDay']"));
	  Select obj7=new Select(date1);
	  obj7.selectByIndex(10);
	  
	  List<WebElement>alldata=obj7.getOptions();
	  int a=alldata.size();
	  System.out.println("size= "+a);
	  for(int i=0;i<a;i++) {
		  String s=alldata.get(i).getText();
		  System.out.println(s);
		  }
	  
	  
	  driver.findElement(By.cssSelector("input[value='Business']")).click();
	  
	  WebElement airline=driver.findElement(By.xpath("//select[@name='airline']"));
	  Select obj9=new Select(airline);
	  obj9.selectByVisibleText("Blue Skies Airlines");
	  
	  
	  driver.findElement(By.cssSelector("input[name='findFlights']")).click();
	  
	  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/reservation.php");
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
