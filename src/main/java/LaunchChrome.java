

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchChrome {

	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver", "\\Users\\arvin\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		//System.getProperty("webdriver.chrome.driver", "/Users/arvin/Downloads/chromedriver-win32/chromedriver-win32/chromedriver.exe")
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		
	}

}
 