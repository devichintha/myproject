package maven.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenDemo {
	@Test
	public void sampleTest() {
		System.setProperty("webdriver.chrome.driver", "./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.get("https:\\www.google.com");
		driver.manage().window().maximize();
	}

}
