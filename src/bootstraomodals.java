import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstraomodals {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tenzi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@class = 'btn btn-default' and @onclick = 'myAlertFunction()']")).click();
       System.out.println (driver.switchTo().alert().getText());
        Thread.sleep(2000);
       driver.switchTo().alert().accept();
	
	
	}

}
