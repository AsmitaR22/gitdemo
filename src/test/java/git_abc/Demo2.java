package git_abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {
	WebDriver driver;
	
    @BeforeClass
	void before() throws InterruptedException {
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");	
	}
    
    @AfterClass
    void after() throws InterruptedException {
    	Thread.sleep(2000);
    	driver.close();
    }

}
