package selenium_testing1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Script_Register_11 {
	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe" );
		WebDriver driver= new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		Thread.sleep(5000);
		//C: Validate the text on the page. "CREATE AN ACCOUNT" 
		Boolean bool = driver.getPageSource().contains("Create an account");
		System.out.println(bool);
		
		//D: Validate that the title is  - "Login - My Store" 
		String title = "Login - My Store";
		String t = driver.getTitle();
		if (title.equals(t)) {
			System.out.println("Title Validated!");
		}
		
		driver.findElement(new By.ByCssSelector("input[name=email_create]")).sendKeys("12345678@gmail.com");	
		driver.findElement(new By.ByCssSelector("input[name=email_create]")).sendKeys(Keys.ENTER);	
		
		Thread.sleep(5000);
		//B: Validate that your respective Title is selected or not. (Mr/Mrs)
		driver.findElement(By.id("id_gender1")).click();
		//driver.findElement(new By.ByXPath("//*[@id='id_gender1']")).click();
		
		
		
	}
}