package frame;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class PraticeAssignmentondynamic {

	public static void main(String[] args) {
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.xpath("//input[@value='option2']")).click();
		String input = driver.findElement(By.xpath("//input[@value='option2']")).getAttribute("value");
		System.out.println(input);
		WebElement select = driver.findElement(By.id("dropdown-class-example"));
		Select a = new Select(select);
		a.selectByValue(input);
		driver.findElement(By.cssSelector("#name")).sendKeys(input);
		driver.findElement(By.id("alertbtn")).click();
		Alert alt = driver.switchTo().alert();
		String validate = alt.getText();
		System.out.println(validate);
		String[] b = validate.split(",");
		String[] c = b[0].split(" ");
		String output = c[1];
		System.out.println(output);
		Assert.assertEquals(input, output);
		//Assert.assertTrue(input.contains(validate));
		alt.accept();
		driver.close();

		

	}

}
