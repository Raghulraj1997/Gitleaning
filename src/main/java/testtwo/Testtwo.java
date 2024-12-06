package testtwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testtwo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.name("name")).sendKeys("Raghul");
		driver.findElement(By.name("email")).sendKeys("raghulemail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("password12343");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement a = driver.findElement(By.id("exampleFormControlSelect1"));
		Select option = new Select(a);
		option.selectByIndex(1);
		driver.findElement(By.xpath("//label[text()='Student']")).click();
		driver.findElement(By.name("bday")).sendKeys("09092000");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String content = driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText();
		if (content.contains("Success! The Form has been submitted successfully!.")) {
			System.out.println("Record Successfully submitted");
		} else {
			System.out.println("Failed to submit the record");
		}
	}

}
