package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModalDialogs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdrvier.Chrome.driver","C:\\Users\\Administrator\\Downloads\\chrome-win64\\Chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/modal-dialogs");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("showSmallModal")).click();
		driver.findElement(By.id("closeSmallModal")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("showLargeModal")).click();
		driver.findElement(By.id("closeLargeModal")).click();
		Thread.sleep(2000);
		
		driver.quit();

	}

}

