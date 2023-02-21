package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		//WebElement register=driver.findElement(By.linkText("REGISTER"));
		//register.click();
		
		WebElement username=driver.findElement(By.name("userName"));
		username.sendKeys("tutorial");
		System.out.println(username.getTagName());
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("tutorial");
		System.out.println(password.getAttribute("name"));
		
		
		WebElement submit=driver.findElement(By.name("submit"));
		Point q=submit.getLocation();
		System.out.println("Location of X :"+ q.getX()+ "," +"Location of Y :" +q.getY());
		submit.click();
		
		//WebElement register=driver.findElement(By.partialLinkText("Login"));
		//System.out.println(register.isDisplayed());
		
	}

}
