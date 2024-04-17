package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdrvier.Chrome.driver","C:\\Users\\Administrator\\Downloads\\chrome-win64\\Chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		 // Switch to a frame by id
        driver.switchTo().frame("frame1"); // Switching to the first frame

        // Now, interact with elements within the frame
        WebElement FrameElement = driver.findElement(By.id("sampleHeading"));
        String FrameText= FrameElement.getText(); // Example interaction with an element in the frame
        System.out.println("Text in Frame is:- "+  FrameText);
        // After interacting with elements within the frame, switch back to the default content
        driver.switchTo().defaultContent();
     	    
	      driver.quit();
	}

}
