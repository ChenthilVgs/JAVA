package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentOpencart {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("Test_Usser");
		driver.findElement(By.id("input-firstname")).sendKeys("Test");
		driver.findElement(By.id("input-lastname")).sendKeys("User");
		driver.findElement(By.className("form-control")).sendKeys("test@test.com");
		
		WebElement ctryDrpDwn = driver.findElement(By.name("country_id"));
		Select ctryDrpDwn1 = new Select(ctryDrpDwn);
		ctryDrpDwn1.selectByVisibleText("India");
		
		driver.findElement(By.name("password")).sendKeys("password#123");
	}

}
