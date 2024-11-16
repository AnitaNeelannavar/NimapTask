package Task1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class PunchIn {
	WebDriver driver;
	@Test
    public void testPunchIn() {
       
        driver = new FirefoxDriver();
	
        driver.get("https://testffc.nimapinfotech.com/");
    	
	}
	public void testLogin(String username,String Password) {
    		driver.findElement(By.id("mat-input-11")).sendKeys("anitamn1531@gmail.com");
    		
    		driver.findElement(By.xpath("//input[@id='mat-input-12']")).sendKeys("Anita@123");
    		driver.findElement(By.xpath("//*[@id=\"kt_login_signin_submit\"]")).click();
System.out.println("Logged in succesful");

        

        WebElement punchInButton = driver.findElement(By.xpath("//div[@class='kt-widget26__content_custom kt-align-center ng-star-inserted']"));
        punchInButton.click();

        
        WebElement toastMessage = driver.findElement(By.id("toastMessage"));
        Assert.assertTrue(toastMessage.isDisplayed(), "Toast message is not displayed");

        System.out.println("Punched in");
        String expectedMessage = "Punch In Successful"; // Example message
        String actualMessage = toastMessage.getText();
        Assert.assertEquals(actualMessage, expectedMessage, "Toast message mismatch");
        System.out.println("Punch Insuccessful");


    	}}
