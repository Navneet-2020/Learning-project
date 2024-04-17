package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollintoView {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdrvier.Chrome.driver","C:\\Users\\Administrator\\Downloads\\chrome-win64\\Chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
	
	//interaction----scroll into View (scroll the page) with command JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element= driver.findElement(By.id("messageWindowButton"));
		js.executeScript("arguments[0].scrollIntoView();",element);
	
		
		
	//interaction----scroll into View (scroll the page) with Actions class
		//Actions act = new Actions(driver);
		//act.scrollToElement(element).build().perform();
		
			
	Thread.sleep(2000);
	driver.quit();
	}

}
