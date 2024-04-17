package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdrvier.Chrome.driver","C:\\Users\\Administrator\\Downloads\\chrome-win64\\Chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();

		// Drag and Drop using Actions class
				WebElement sourceElement = driver.findElement(By.id("draggable"));
				WebElement targetElement = driver.findElement(By.id("droppable"));

				Actions actions = new Actions(driver);
				actions.dragAndDrop(sourceElement, targetElement).build().perform();
	
				Thread.sleep(2000);
				driver.quit();
	}

}
