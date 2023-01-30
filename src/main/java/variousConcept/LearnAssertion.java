package variousConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LearnAssertion {
	
	WebDriver driver;
	 
	@BeforeClass
	public void init() {
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@Test
	public void testLocator() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("demo@techfios.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Transactions']")).click();
		driver.findElement(By.xpath("//a[text()='New Deposit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Choose an Account']")).click();
		driver.findElement(By.xpath("//li[text()='Techfios']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"select2-account-result-w4db-Techfios\"]")).click();
		driver.findElement(By.xpath("//input[@id='description']")).sendKeys("asdfgghh");
		driver.findElement(By.xpath("//*[@id=\"tform\"]/div[3]/div/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"upload_container\"]/div")).sendKeys("F:\\nameer picture\\.jpg");
		driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("12345");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}

}
