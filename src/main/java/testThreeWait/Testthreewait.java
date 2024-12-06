package testThreeWait;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testthreewait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise");
		WebDriverWait expwait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value='user']")).click();
		expwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement op = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select option = new Select(op);
		option.selectByValue("consult");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.name("signin")).click();
		int a = driver.findElements(By.cssSelector(".zmdi.zmdi-shopping-cart")).size();
		for (int i = 0; i < a; i++) {
			List<WebElement> el = driver.findElements(By.cssSelector(".zmdi.zmdi-shopping-cart"));
			WebElement ck = el.get(i);
			ck.click();
		}

	}

}
