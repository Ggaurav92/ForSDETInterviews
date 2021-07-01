package nuance;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	
	
	public static void main(String[] args) {
		
	
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://nssdc.gsfc.nasa.gov/planetary/factsheet/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		List<WebElement> planets = driver.findElements(By.xpath("//tr[1]/td[@align='center']//a"));
		
		List<WebElement> lengthOfDays =  driver.findElements(By.xpath("//a[contains(text(),'Length of Day')]//ancestor:: td/ancestor::tr/td[@align='center']"));
		
		
		for (int i = 0; i < planets.size(); i++) {
			
			String a =  lengthOfDays.get(i).getText();
				
			
				float b= Float.parseFloat(a);
				//int b = Integer.parseInt(a);
			
				
				if(b > 24) {
					System.out.println(planets.get(i).getText());
					
				}
		}
	
		}
}
