import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebsite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tenzi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
	
		Thread.sleep(2000);
		
	    driver.findElement(By.id("user-message")).sendKeys("Java");
	    Thread.sleep(2000);
	  driver.findElement(By.xpath("//form[@id='get-input']/button")).click();
	   
			   Thread.sleep(2000);
	    driver.close();
	}

}
