package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdrvier.Chrome.driver","C:\\Users\\Administrator\\Downloads\\chrome-win64\\Chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
	
	// Switch to a frame by id
        driver.switchTo().frame("frame1");// Switching to the first frame
       
        driver.switchTo().frame(0);
        // Now, interact with elements within the frame
        WebElement FrameElement = driver.findElement(By.xpath("/html/body/p"));
        String FrameText= FrameElement.getText(); // Example interaction with an element in the frame
        System.out.println("Text in Frame is:- "+  FrameText);
        
        
        driver.switchTo().parentFrame();
        // Now, interact with elements within the frame
        WebElement FrameElement1 = driver.findElement(By.xpath("/html/body"));
        String FrameText1= FrameElement1.getText(); // Example interaction with an element in the frame
        System.out.println("Text in Frame is:- "+  FrameText1);
        		
	driver.quit();
	}

}
