//5. Write a script to get the title of the �Contact Us� page.
package selenium_testing1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class  Script_Ttn_5 {

public static void main(String[] args)  throws InterruptedException {
System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe" );
WebDriver driver= new FirefoxDriver();
driver.get("https://www.tothenew.com/");
//for cookies modal
driver.findElement(new By.ByXPath("/html/body/div[2]/div[2]/div/div[2]/button[2]")).sendKeys(Keys.ENTER);
Thread.sleep(6000);
//By XPath
driver.findElement(new By.ByXPath("//*[@id='h-contact-us']")).sendKeys(Keys.ENTER);
Thread.sleep(5000);
//title 
String title =driver.getTitle();
System.out.println("Page title is : "+title);
}
}