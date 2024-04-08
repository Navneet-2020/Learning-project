package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateAndPrint {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdrvier.Chrome.driver","C:\\Users\\Administrator\\Downloads\\chrome-win64\\Chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.className("counter-title-top"));
		 String elementText = element.getText(); 
		 System.out.println("Element Text: " + elementText);
		 
		 WebElement element1 = driver.findElement(By.className("counter-title"));
		 String element1Text = element1.getText(); 
		 System.out.println("Element Text: " + element1Text);
		 

		 WebElement element2 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div[1]/div[16]"));
		 String element2Text = element2.getText(); 
		 System.out.println("Element Text: " + element2Text);
		 
	
		 WebElement element3 = driver.findElement(By.xpath("//html/body/div[2]/div[2]/div[2]/div[1]/div[1]/div[27]"));
		 String element3Text = element3.getText(); 
		 System.out.println("Element Text: " + element3Text);
		 
		 WebElement element4 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div[1]/div[33]"));
		 String element4Text = element4.getText(); 
		 System.out.println("Element Text: " + element4Text);
		 
		 
		 WebElement element5 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div[1]/div[41]"));
		 String element5Text = element5.getText(); 
		 System.out.println("Element Text: " + element5Text);
		 
		 
		 WebElement element6 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div[1]/div[45]"));
		 String element6Text = element6.getText(); 
		 System.out.println("Element Text: " + element6Text);
		 
		 
		 WebElement element7 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div[1]/div[57]"));
		 String element7Text = element7.getText(); 
		 System.out.println("Element Text: " + element7Text);
		 		 
		 
		Thread.sleep(1000);
		driver.close();
	}

}
