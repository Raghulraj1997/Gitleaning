package testone;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class CheckboxandAssertion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");	
		driver.manage().window().maximize();
		driver.findElement(By.id("checkBoxOption1")).click();
		Thread.sleep(5000);
	    Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
	    driver.findElement(By.id("checkBoxOption1")).click();
		Thread.sleep(5000);
	    Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
	    List<WebElement> a=driver.findElements(By.xpath("//input[@type='checkbox']/parent::label"));
		int b=a.size();
		System.out.println(b);
		

	}

}
