import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstrap {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tenzi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
        
        driver.findElement(By.xpath("//input[@type='radio' and @value = '0 - 5']")).click();
         driver.findElement(By.xpath("//div[@class = 'panel-body']/button")).click();
	
	}

}
