package class22_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Practice_Myself {

	public static void main(String[] args) throws InterruptedException {
		
     WebDriverManager.chromedriver().setup();
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("file:///C:/java/workspace/sit.skyschooling/index.html");
		Thread.sleep(2000);
		driver.findElement(By.id("fname")).sendKeys("Asma");
		Thread.sleep(2000);
		driver.findElement(By.id("lname")).sendKeys("Rahman");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pnumber']")).sendKeys("870-718-1204");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("asma@7640");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='adress']")).sendKeys("7520 palm beach");
		Thread.sleep(2000);
	  // driver.findElement(By.linkText("for help click here")).click();
		driver.findElement(By.partialLinkText("k h")).click();
	   driver.navigate().back();//chain method
	    Thread.sleep(2000);
	    driver.findElement(By.id("scales")).click();
	    driver.findElement(By.id("scales")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='radio'][1]")).click();
	    driver.findElement(By.tagName("select")).click();
	    
	    driver.findElement(By.xpath("//option[3]")).click();
	    //driver.findElement(By.xpath("//option[@value='valor1']")).click();
	    
	    driver.findElement(By.id("submited")).click();
	    
	    
	    //Submited
	    String actualValue = driver.findElement(By.id("submited")).getText();
	    
	    if(actualValue.contains("Submited"))
	    	System.out.println("Passed");
	    else
	    	System.out.println("Failed");
	    	


	}

}
