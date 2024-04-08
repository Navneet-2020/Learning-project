package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinksandPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdrvier.Chrome.driver","C:\\Users\\Administrator\\Downloads\\chrome-win64\\Chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://demoqa.com/links");
		driver.manage().window().maximize();
		
		 // Find all the links on the page
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        // Print the text of each link
        System.out.println("Text of each link:");
        for (WebElement link : allLinks) {
            System.out.println(link.getText());
        }
		
		
	driver.close();	
		
	}

}
