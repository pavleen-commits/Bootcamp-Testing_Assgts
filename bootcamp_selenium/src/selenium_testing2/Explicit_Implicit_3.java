//Q3- Difference between implicit & explicit wait along with syntax.
package selenium_testing2;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Explicit_Implicit_3 {
	public static void main(String[] args)  throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe" );
		WebDriver driver= new FirefoxDriver();
		
		//Implicit wait
		//1.The Implicit Wait in selenium  is used to tell the web driver to wait for a certain
		//amount of time before it throws a "No Such Element Exception"
		//2. Global: applicable for all elements on the page
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //will wait for 10sec for all ele
		driver.get("http://omayo.blogspot.com/");
		
		
		//ElementNotVisibleException
		//driver.findElement(By.xpath("//*[@id='hbutton']")); 
		
		
		//Explicit Wait
		//1. The Explicit Wait in Selenium is used to tell the Web Driver to wait for certain conditions (Expected Conditions) or 
		//maximum time exceeded before throwing "ElementNotVisibleException" exception.
		//2. For a particulara element
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement element =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='hbutton']")));
		element.click();
		
		//in the above example, since the button is hidden, therefore even after
		//waiting for 20s, it will not be loaded and hence. ExpectedCondition will fail
	}

}
