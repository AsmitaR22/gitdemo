package git_abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 extends Demo2  {
	
	
	
	@Test
	public void test1() throws InterruptedException {
		WebElement user = driver.findElement(By.name("username"));
		Assert.assertTrue(user.isDisplayed());
		Thread.sleep(3000);
		user.sendKeys("Admin");
		WebElement pass = driver.findElement(By.name("password"));
		Assert.assertTrue(pass.isDisplayed());
		Thread.sleep(3000);
		pass.sendKeys("admin123");
		WebElement button = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		Assert.assertTrue(button.isDisplayed());
		Thread.sleep(3000);
		button.click();
		//WebElement page = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
		
	}
	

}
