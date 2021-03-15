//Q2- https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html
//a)Validate that Multi-Select List Demo is a multiple dropdown.
//b)Fetch all the dropdown options
//c)Select New Jersey>New York>Texas then fetch last selected option & all selected options.
//d)Deselect all the selected options.
package selenium_testing2;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver; 
public class Dropdown_2 {

	public static void main(String[] args)  throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");  
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		//a)Validate that Multi-Select List Demo is a multiple dropdown.
		
		WebElement element = driver.findElement(By.id("multi-select"));
		Select s = new Select(element);
		System.out.println(s.isMultiple());
		
		
		//b)Fetch all the dropdown options
		
		//fetching for single select
		Select single_dropdown = new Select(driver.findElement(By.id("select-demo")));
		//getOption() returns a list of all the dropdown options
		List<WebElement> single_options = single_dropdown.getOptions();
		//getting values of all the dropdown options
		System.out.println("Single select dropdown values");
		 for (int j = 0; j < single_options.size(); j++) {
		        System.out.println(single_options.get(j).getText());
		 }
		//fetching for multiselect
		Select multi_dropdown = new Select(driver.findElement(By.id("multi-select")));
		List<WebElement> multi_options = multi_dropdown.getOptions();
		System.out.println("Multi select dropdown values");
		for (int j = 0; j < multi_options.size(); j++) {
	        System.out.println(multi_options.get(j).getText());
	 }
		
		//c)Select New Jersey>New York>Texas then fetch last selected option & all selected options.
		multi_dropdown.selectByVisibleText("New Jersey");
		multi_dropdown.selectByVisibleText("New York");
		multi_dropdown.selectByVisibleText("Texas");
		//using built in functions
		System.out.println("first selected option");
	    System.out.println(multi_dropdown.getFirstSelectedOption().getText());
		System.out.println("all selected options");
		List<WebElement> list = multi_dropdown.getAllSelectedOptions();
		for (int j = 0; j < list.size(); j++) {
	        System.out.println(list.get(j).getText());
		}
		//using provided buttons
		//The buttons on the website have a bug, they displays the elements correctly 
		//sometimes on some systems, and sometimes display incorrect results. 
		driver.findElement(By.id("printMe")).sendKeys(Keys.ENTER);
		WebElement e1 =driver.findElement(By.cssSelector(".getall-selected"));
		String value1=e1.getText();
		System.out.println(value1);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"printAll\"]")).click();
		WebElement e2 =driver.findElement(By.cssSelector(".getall-selected"));
		String value2=e2.getText();
		System.out.println(value2);

		
		//d)Deselect all the selected options.
		Thread.sleep(2000);
		multi_dropdown.deselectAll();
}
}
