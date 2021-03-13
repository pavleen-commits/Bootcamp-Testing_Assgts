//2. Write a script launch the Google Chrome browser and open https://www.google.com/ URL.
package selenium_testing1; 
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver; 
public class Script_Chrome_2 {
	
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");  
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com/");
		 //driver.navigate().to("https://www.google.com/"); 
	
	}

}
