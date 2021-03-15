//Ques1 : Launch Firefox browser & navigate to https://www.seleniumeasy.com/test/javascript-alert-box-demo.html
//a)Try to Fetch the alert popup text.
//b)Try to Dismiss the popup.
//c)Try to enter some data on an alert popup.
//d)Try to accept the popup.
package selenium_testing2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Alert_Popup_1  {
	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe" );
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		//a)Try to Fetch the alert popup text.
		//d)Try to accept the popup.
		//css selector
		driver.findElement(By.cssSelector("div.panel:nth-child(4) > div:nth-child(2) > button:nth-child(4)")).click();
		Thread.sleep(2000);
		String alert_popup_text = driver.switchTo().alert().getText();
		System.out.println(alert_popup_text);
		driver.switchTo().alert().accept();
		//b)Try to Dismiss the popup.
		//xpath
		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		//c)Try to enter some data on an alert popup.
		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button")).click();
		driver.switchTo().alert().sendKeys("Pavleen Kaur");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	
}
}