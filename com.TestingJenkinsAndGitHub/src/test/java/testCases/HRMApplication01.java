/**
 * 
 */
package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * @author Lenovo
 *This script is used to login HRM application
 *Created By: Ganesh
 *Created On: 02-03-2019
 */
public class HRMApplication01 {

	@Test
	public void test() throws InterruptedException{
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
	
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	
	driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	

	Thread.sleep(3000);
	
	driver.quit();

		
	}
	
}
