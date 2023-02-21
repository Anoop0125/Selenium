package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		WebElement firstname=driver.findElement(By.id("firstName"));
		firstname.sendKeys("Anoop");
		
		driver.findElement(By.id("lastName")).sendKeys("R");
		driver.findElement(By.id("userEmail")).sendKeys("anoopranu68@gmail.com");
		driver.findElement(By.xpath("//div[@class='custom-control custom-radio custom-control-inline'][1]")).click();
		driver.findElement(By.id("userNumber")).sendKeys("7825032157");
		driver.findElement(By.id("currentAddress")).sendKeys("Anjanam,Kanniyakumari");
		
		/*driver.findElement(By.id("dateOfBirthInput")).clear();
		driver.findElement(By.className("react-datepicker__year-select")).sendKeys("2001");
		driver.findElement(By.className("react-datepicker__month-select")).sendKeys("December");
		driver.findElement(By.className("react-datepicker__month")).sendKeys("25");*/
		
		/*driver.findElement(By.id("hobbies-checkbox-1")).click();
		driver.findElement(By.id("hobbies-checkbox-2")).click();
		driver.findElement(By.id("hobbies-checkbox-3")).click();*/
		
		//driver.findElement(By.name("Select State")).sendKeys("Haryana");
}
}
