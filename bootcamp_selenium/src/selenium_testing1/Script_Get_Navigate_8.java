//8: Difference between get() & navigate() method
package selenium_testing1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Script_Get_Navigate_8 {
	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe" );
		WebDriver driver= new FirefoxDriver();
		 //navigate
		 driver.navigate().to("https://www.google.com/");
		 driver.navigate().refresh();
		 driver.findElement(new By.ByCssSelector("input[type=text]")).sendKeys("To The New ");	
		 driver.findElement(new By.ByCssSelector("input[type=text]")).sendKeys(Keys.ENTER);	
		 Thread.sleep(5000);
		 driver.navigate().back();
		 Thread.sleep(5000);
	     driver.navigate().forward();
		 /*
		 //get
		 driver.get("https://www.google.com/");
		 driver.findElement(new By.ByCssSelector("input[type=text]")).sendKeys("To The New ");	
		 driver.findElement(new By.ByCssSelector("input[type=text]")).sendKeys(Keys.ENTER);	
		 driver.close();
		 */
}
}