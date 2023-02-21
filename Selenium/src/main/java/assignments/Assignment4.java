package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("inputUsername"));
		username.sendKeys("Rahul");
		
		WebElement password=driver.findElement(By.name("inputPassword"));
		password.sendKeys("Rahul");
		
		WebElement signin=driver.findElement(By.className("signInBtn"));
		signin.click();
		Thread.sleep(2000);
		
		WebElement text=driver.findElement(By.cssSelector("p.error"));
		System.out.println(text.getText());
		
		WebElement forget=driver.findElement(By.linkText("Forgot your password?"));
		forget.click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rahul");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rahul@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rahul123@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("1234567890");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click(); //parent class / child class
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	}

}
