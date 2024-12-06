package frame;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ScrollLearning {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		List<WebElement> link=driver.findElements(By.xpath("//li[@class='gf-li']/a"));
	//	int a=link.size();
		for(WebElement links:link)
		{
			String a=links.getAttribute("href");
			 System.out.println(a);
		}
	   
		
		
		
	}

}
