package Task1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	
	WebDriver driver;
	
	@Test(priority=0)
	public void setup() {
		
		driver=new FirefoxDriver();
		driver.get(" https://testffc.nimapinfotech.com/");
		}
	
	public void testLogin(String username,String Password) {
		driver.findElement(By.id("mat-input-11")).sendKeys("anitamn1531@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='mat-input-12']")).sendKeys("Anita@123");
		driver.findElement(By.xpath("//*[@id=\"kt_login_signin_submit\"]")).click();
	}
	
	
	

}
