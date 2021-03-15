//Q4- http://demo.automationtesting.in/Frames.html
//a. Enter the value in the field under single Iframe 
//b. as well as Iframe within an Iframe in a single script

//Q5- visit the above link
//a.Print the count of frames on this application.
//b.Print and switch to inner iframe
package selenium_testing2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class IFrame_4_5 {
	public static void main(String[] args)  throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe" );
		WebDriver driver= new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		//Ques 5 (a)
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		//Ques 4 (a)
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("section:nth-child(1) div.container div.row div.col-xs-6.col-xs-offset-5 > input:nth-child(1)")).sendKeys("Pavleen Kaur");
		
		
		//Ques 5(b)   &    4(b)
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(1);
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector(".col-xs-6 > input:nth-child(1)")).sendKeys("Byee");
		//Ques 5(b)
	}
}