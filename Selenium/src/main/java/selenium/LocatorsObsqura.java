package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsObsqura {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement message=driver.findElement(By.id("single-input-field"));
		message.sendKeys("Hello");
		WebElement show=driver.findElement(By.id("button-one"));
		show.click();
		WebElement showmess=driver.findElement(By.id("message-one"));
		System.out.println(showmess.isDisplayed());
		WebElement value1=driver.findElement(By.id("value-a"));
		value1.sendKeys("10");
		WebElement value2=driver.findElement(By.id("value-b"));
		value2.sendKeys("20");
		WebElement gett=driver.findElement(By.id("button-two"));
		gett.click();
		WebElement showmessage=driver.findElement(By.id("message-two"));
		System.out.println(showmessage.isDisplayed());

	}

}
