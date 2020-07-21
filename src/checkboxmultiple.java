

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkboxmultiple {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tenzi\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        driver.manage().window().maximize();
  List <WebElement> option1 = driver.findElements(By.xpath("//input[@type = 'checkbox' and @class = 'cb1-element']"));
  for(int i = 0; i < option1.size(); i++ ) {
	
         option1.get(i).click();
         
        
         if (option1.get(i).isSelected()) { System.out.println(i+" checkBox is selected "); }
         else
         { System.out.println(i+" checkBox is not selected "); } } 
	
           driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label/input")).click();
	
	
	}
          
	}



