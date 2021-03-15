package selenium_testing1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Script_Register_12 {
	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe" );
		WebDriver driver= new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		Thread.sleep(5000);
		//email
		driver.findElement(By.name("email_create")).sendKeys("12345678@gmail.com");	
		driver.findElement(By.name("email_create")).sendKeys(Keys.ENTER);	
		Thread.sleep(5000);		
		//firstname
		driver.findElement(By.name("customer_firstname")).sendKeys("ABC");	
		//lastname
		driver.findElement(By.name("customer_lastname")).sendKeys("DEF");	
		
	
	
	}
}
