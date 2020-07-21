import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class input2 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tenzi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
	
	 driver.findElement(By.id("sum1")).sendKeys("5");
	 Thread.sleep(3000);
	 driver.findElement(By.id("sum2")).sendKeys("6");
	driver.findElement(By.xpath("//form[@id='gettotal']/button")).click();
	}

}
