import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tenzi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(("//button[@id='autoclosable-btn-success']"))).click();
		WebElement autoclose= driver.findElement(By.xpath("//div[@class='col-md-6']/div[1]"));
		WebDriverWait wait1 = new WebDriverWait(driver, 8);
		autoclose.isSelected();
	}

}
