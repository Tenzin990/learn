import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstrapmodalsinput {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tenzi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@class = 'btn btn-default btn-lg' and @onclick ='myPromptFunction()']")).click();
        String a = "Tim Hortons";
        driver.switchTo().alert().sendKeys(a);
        
  Thread.sleep(5000);	
  driver.switchTo().alert().accept();
  
	}

}
