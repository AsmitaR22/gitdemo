package git_abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 extends Demo2  {
	
	
	
	@Test
	public void test1() {
		WebElement user = driver.findElement(By.id("user-name"));
		Assert.assertTrue(user.isDisplayed());
		user.sendKeys("Admin");
		WebElement pass = driver.findElement(By.id("password"));
		Assert.assertTrue(pass.isDisplayed());
		pass.sendKeys("admin123");
		WebElement button = driver.findElement(By.id("login-button"));
		Assert.assertTrue(button.isDisplayed());
		button.click();
		WebElement page = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div"));
		Assert.assertTrue(page.isDisplayed());
	}
	

}
