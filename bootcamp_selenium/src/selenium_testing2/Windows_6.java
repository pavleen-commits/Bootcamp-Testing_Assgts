//q6:  https://www.toolsqa.com/automation-practice-switch-windows/
//Click on New Window Message Tab then print the title and text in the newly 
//opened window, then switch back to main window.
package selenium_testing2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Keys;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
public class Windows_6 {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe" );
		WebDriver driver= new FirefoxDriver();
		String url = "https://www.toolsqa.com/automation-practice-switch-windows/";
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("messageWindowButton")).sendKeys(Keys.ENTER);
		String mainWindowHandle = driver.getWindowHandle();
	    Set<String> allWindowHandles = driver.getWindowHandles();
	    Iterator<String> iterator = allWindowHandles.iterator();
	    while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                WebElement text = driver.findElement(By.tagName("body"));
                String title = driver.getTitle();
                System.out.println("Title is" + title);
                String URL = driver.getCurrentUrl();
                System.out.println("Url is: " + URL);
                System.out.println("Content of child window is: " + text.getText());
            }
        }
		
}
}
