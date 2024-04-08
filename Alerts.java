package seleniumprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdrvier.Chrome.driver","C:\\Users\\Administrator\\Downloads\\chrome-win64\\Chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://demoqa.com/alerts");
		driver.manage().window().maximize();

		WebElement button= driver.findElement(By.id("alertButton"));
		button.click();	
		 Alert alert = driver.switchTo().alert();       //switch the control from main browser driver to any alert
		 alert.accept();	
		 Thread.sleep(2000);
		
		
		 WebElement button1= driver.findElement(By.id("timerAlertButton"));
			button1.click();	
			Thread.sleep(5000);
			 Alert alert1 = driver.switchTo().alert();
			 alert1.accept();	
			 Thread.sleep(2000);
		
		
			 WebElement button2= driver.findElement(By.id("confirmButton"));
				button2.click();	
				 Alert alert2 = driver.switchTo().alert();
				 alert2.dismiss();	
				 Thread.sleep(2000);
			 

				 WebElement button3= driver.findElement(By.id("promtButton"));
					button3.click();	
					 Alert alert3 = driver.switchTo().alert();
					 alert3.sendKeys("Tester");
					 String alertMessage= driver.switchTo().alert().getText();
					  System.out.println(alertMessage);
					 Thread.sleep(2000);
					 alert3.accept();	
					 
					
					 Thread.sleep(2000);
		
		
		driver.close();
	}

}
