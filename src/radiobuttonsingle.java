import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class radiobuttonsingle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tenzi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
        driver.manage().window().maximize();
   
        WebElement Male = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[1]/input"));
        Male.click();
        Assert.assertTrue(Male.isSelected());
        driver.findElement(By.id("buttoncheck")).click();
        
        Thread.sleep(2000);
        }

}
