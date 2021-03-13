//4. Write a script to open http://www.tothenew.com/  and then navigate to the contact us page using 1) XPath 2) ID
package selenium_testing1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class  Script_Ttn_4 {

public static void main(String[] args)  throws InterruptedException {
System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe" );
WebDriver driver= new FirefoxDriver();
driver.get("https://www.tothenew.com/");
driver.findElement(new By.ByXPath("/html/body/div[2]/div[2]/div/div[2]/button[2]")).sendKeys(Keys.ENTER);
Thread.sleep(6000);
//By XPath
driver.findElement(new By.ByXPath("//*[@id='h-contact-us']")).sendKeys(Keys.ENTER);
   
//By Id
//driver.findElement(By.id("h-contact-us")).sendKeys(Keys.ENTER);
}

}
