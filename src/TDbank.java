import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TDbank {

	public static void main(String[] args) throws InterruptedException {
	
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\tenzi\\Desktop\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	
		   driver.get("https://www.td.com/ca/en/personal-banking/");
		
		   Thread.sleep(3000);
		   
		   System.out.println(driver.getTitle());
		
	}

}
