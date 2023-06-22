package class22_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement_Locators {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver;

		driver = new ChromeDriver();
		driver.get("file:///C:/Users/asmar/Downloads/index.html");

		driver.findElement(By.id("firstName")).sendKeys("Asma");
		Thread.sleep(1000);
		driver.findElement(By.name("LastName")).sendKeys("Rahman");
		Thread.sleep(1000);
		driver.findElement(By.className("email")).sendKeys("asma@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("tarea")).sendKeys("870-718-1204");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Female']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Birthday_Day")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='1']")).click();
		Thread.sleep(1000);
        driver.findElement(By.id("Birthday_Month")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//option[@value='March']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("Birthday_Year")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//option[@value='2004']")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("Address")).sendKeys("7520 palm beach");
        Thread.sleep(1000);
        driver.findElement(By.name("City")).sendKeys("Benton");
        Thread.sleep(1000);
        driver.findElement(By.name("ZipCode")).sendKeys("72019");
        Thread.sleep(1000);
        driver.findElement(By.name("State")).sendKeys("Arkansas");
        Thread.sleep(1000);
        driver.findElement(By.name("Country")).sendKeys("USA");   
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@value='Drawing']")).click();
        Thread.sleep(1000);
		driver.findElement(By.id("submit_result")).click();
		//Thread.sleep(50000);
		//Completed
		String actualValue = driver.findElement(By.xpath("//button[1]")).getText();
		
		if (actualValue.contains("Completed"))
			System.out.println("Passed");
		else
			System.out.println("Failed");
		
		//driver.close();
        
	}

}
