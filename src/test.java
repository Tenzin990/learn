import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tenzi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
	
	driver.findElement(By.xpath("//div[@class='panel panel-default']/div[2]/form/button")).click();

	}

}
