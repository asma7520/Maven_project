package class22_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class_Practice {

	public static void main(String[] args) {
		
		//setup driver manager
	
		WebDriverManager.chromedriver().setup();
		
		//object declaration
		WebDriver driver;
		driver = new ChromeDriver();
		//go to url
		driver.get("file:///C:/java/webpage/webelementlocator.html");

	}

}
