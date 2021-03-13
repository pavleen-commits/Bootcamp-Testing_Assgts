//3. Write a script to search the “To The New” string in google.
package selenium_testing1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver; 
public class Script_Ttn_3 {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");  
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.findElement(new By.ByCssSelector("input[type=text]")).sendKeys("To The New ");	
		 driver.findElement(new By.ByCssSelector("input[type=text]")).sendKeys(Keys.ENTER);	
	}
}
