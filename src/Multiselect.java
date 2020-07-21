import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tenzi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	Select s = new Select(driver.findElement(By.id("multi-select")));
	
	s.selectByIndex(0);
    s.selectByIndex(1);
	s.selectByIndex(3);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='printAll']")).click();
	}

}
