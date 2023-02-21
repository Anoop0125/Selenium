package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\New folder (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opesmount.in/grocerystore1/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	    driver.close();
		

	}

}
