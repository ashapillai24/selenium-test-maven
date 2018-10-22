package edureka.co;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestAuthentication {
  @Test
  public void testAuthentication() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.56.101:3001/");
		driver.findElement(By.name("login")).sendKeys("edureka");
		driver.findElement(By.name("password")).sendKeys("edureka");
		Thread.sleep(5000);
		driver.findElement(By.name("click")).click();
  }
}
