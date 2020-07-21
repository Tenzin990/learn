import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tenzi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		driver.wait(5000);
		Select Multi = new Select(driver.findElement(By.xpath("//select[@id='multi-select']"))); 
		Multi.selectByIndex(2);
		Multi.selectByValue("New York");
	driver.findElement(By.xpath("//button[@id='printMe']")).click();
	
	}

}
