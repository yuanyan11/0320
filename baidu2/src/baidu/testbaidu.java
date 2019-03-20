package baidu;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testbaidu {
	WebDriver driver;
	String url1="https://www.baidu.com/";
	@BeforeClass
	public void openfire() {
		
	 driver=new FirefoxDriver();
	
		
	}
	@Test
	public void bd() throws InterruptedException {
		driver.get(url1);
		Thread.sleep(1000);
		WebElement buton=driver.findElement(By.name("wd"));
		buton.sendKeys("selenium");
		WebElement buton1=driver.findElement(By.id("su"));
		buton1.click();
		
	}

}
