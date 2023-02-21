package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://selenium.obsqurazone.com/index.php");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		driver.quit();		
	}

}
