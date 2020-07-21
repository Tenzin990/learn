

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RBC {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tenzi\\Desktop\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
   driver.get("https://www.rbcroyalbank.com/personal.html");
   
   Thread.sleep(3000);
   
   driver.findElement(By.xpath("//*[@id='header-search-btn']/span/span")).click();

   Thread.sleep(3000);
   
   driver.findElement(By.xpath("//*[@id='header-search']")).sendKeys("Hello World");
 	
   Thread.sleep(3000);
   
   driver.findElement(By.xpath("//*[@id='header-search']")).sendKeys(Keys.RETURN);
	
   Thread.sleep(3000);
   
    
 	 driver.close();

	
	}

}
