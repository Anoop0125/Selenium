package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://selenium.obsqurazone.com/index.php");
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());
//System.out.println(driver.getPageSource());
//driver.close(); //closes current window
//driver.quit(); //closes all windows
	}

}
