import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MultiRadiobutton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tenzi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
        driver.manage().window().maximize();
    WebElement Male = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[1]/input"));
	Male.click();
	Assert.assertTrue(Male.isSelected());
	WebElement Age1= driver.findElement(By.xpath("//input[@type='radio' and @value = '0 - 5']"));
	Age1.click();
	Assert.assertTrue(Age1.isSelected());
	WebElement Age2= driver.findElement(By.xpath("//input[@type='radio' and @value = '5 - 15']"));
	Age2.click();
	Assert.assertTrue(Age2.isSelected());
	driver.findElement(By.xpath("//button [@type = 'button' and @onclick = 'getValues();']")).click();
	
	
	
	Thread.sleep(2000);
	driver.close();
	}

}
