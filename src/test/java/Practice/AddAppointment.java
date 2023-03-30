package Practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddAppointment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://106.51.75.38:9007");
		
		driver.findElement(By.id("email")).sendKeys("arjun@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("Appointment")).click();
		driver.findElement(By.linkText("Appointment List")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Add Appointment')]")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = driver.findElement(By.name("date_timestamp"));
		wait.until(ExpectedConditions.visibilityOf(element));
		
		driver.findElement(By.xpath("//span[text()='Select Patient']")).click();
		
		driver.findElement(By.xpath("//input[contains(@class,'select2-input')]")).sendKeys("Prash");
		

	}

}
