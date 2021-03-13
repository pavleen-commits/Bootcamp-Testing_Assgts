//1.  Write a script to open the Firefox browser and open https://www.google.com/ URL.
package selenium_testing1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Script_Firefox_1 {
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe" );
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.google.com/");
}
}
