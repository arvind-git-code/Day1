import static org.junit.jupiter.api.Assertions.*;

import java.sql.Driver;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class abcd {

	@BeforeAll
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "\\Users\\arvin\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window();
		driver.get("https://www.google.com");
	}
	
	@Test
	void test() {
	
		System.out.println("Not yet implemented");
	

}
}