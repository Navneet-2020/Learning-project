package seleniumprograms;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdrvier.Chrome.driver","C:\\Users\\Administrator\\Downloads\\chrome-win64\\Chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("  https://demoqa.com/buttons");
		driver.manage().window().maximize();
         
		// double click
		
	WebElement doubleclick= driver.findElement(By.id("doubleClickBtn"));
	Actions act = new Actions(driver);
	act.doubleClick(doubleclick).build().perform();
		System.out.println(driver.findElement(By.id("doubleClickMessage")).getText());
		 Thread.sleep(2000);
		
		// right click
		
		 WebElement rightclick= driver.findElement(By.id("rightClickBtn"));
		 Actions act1 = new Actions(driver);
	   	act1.contextClick(rightclick).build().perform();
		  System.out.println(driver.findElement(By.id("rightClickMessage")).getText());
		 
			 Thread.sleep(2000);
						 
			 driver.close();
				
		
	}

}
