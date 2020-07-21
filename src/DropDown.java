import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tenzi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");


	
	Select s = new Select(driver.findElement(By.id("select-demo")));
	
	s.selectByIndex(1);
	Thread.sleep(3000);
	
	driver.close();
	}
	
}
