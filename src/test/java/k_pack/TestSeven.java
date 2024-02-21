package k_pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestSeven {

	@Parameters({"URL"})
	@Test
	public void testA(String url) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		String title = driver.getTitle();
		System.out.println("Page Title is : " + title);
		driver.quit();
	}
	
	@Parameters({"URL"})
	@Test
	public void testB(String url) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		String title = driver.getTitle();
		System.out.println("Page Title is : " + title);		
		driver.quit();
	}

}
