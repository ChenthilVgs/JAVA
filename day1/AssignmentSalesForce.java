package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentSalesForce {

	public static void main(String[] args) {
		
			WebDriverManager.chromiumdriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			driver.findElement(By.name("UserFirstName")).sendKeys("Test");
			driver.findElement(By.name("UserLastName")).sendKeys("User");
			driver.findElement(By.name("UserEmail")).sendKeys("test@test.com");
			
			WebElement jobDrpDwn = driver.findElement(By.name("UserTitle"));
			Select jobDrpDwn1 = new Select(jobDrpDwn);
			jobDrpDwn1.selectByIndex(3);
			
			driver.findElement(By.name("CompanyName")).sendKeys("Test Company");
			
			WebElement compDrpDwn = driver.findElement(By.name("CompanyEmployees"));
			Select compDrpDwn1 = new Select(compDrpDwn);
			compDrpDwn1.selectByIndex(3);
			
			driver.findElement(By.name("UserPhone")).sendKeys("0123456789");
			driver.findElement(By.className("checkbox-ui")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.name("start my free trial")).click();
			driver.close();
	}

}
