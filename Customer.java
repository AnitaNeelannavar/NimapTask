package Task1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;


public class Customer {
	
	WebDriver driver;
	
	 
	    public void testAddCustomer(String name, String email, String phone) {
	       
	         driver = new FirefoxDriver();
	        driver.get("https://testffc.nimapinfotech.com/");

	        // Assuming you are logged in already, or log in before this step
	        WebElement addCustomerButton = driver.findElement(By.id("addCustomerButton"));
	        addCustomerButton.click();

	        WebElement nameField = driver.findElement(By.id("name"));
	        WebElement emailField = driver.findElement(By.id("email"));
	        WebElement phoneField = driver.findElement(By.id("phone"));
	        WebElement saveButton = driver.findElement(By.id("saveButton"));

	        nameField.sendKeys(name);
	        emailField.sendKeys(email);
	        phoneField.sendKeys(phone);
	        saveButton.click();

	        // Wait for success message or validation
	        WebElement successMessage = driver.findElement(By.id("successMessage"));
	        //AssertJUnit.assertTrue(successMessage.isDisplayed(), "Customer addition failed");

	        String expectedMessage = "Customer added successfully";
	        String actualMessage = successMessage.getText();
	        AssertJUnit.assertEquals(actualMessage, expectedMessage, "Message mismatch after adding customer");

	        driver.quit();
	    }
	}

