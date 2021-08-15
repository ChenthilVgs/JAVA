package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentFacebook {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("User");
		driver.findElement(By.name("reg_email__")).sendKeys("test@test.com");
		driver.findElement(By.id("password_step_input")).sendKeys("password#123");

		WebElement dayDrpDwn = driver.findElement(By.id("day"));
		Select dayDrpDwn1 = new Select(dayDrpDwn);
		dayDrpDwn1.selectByIndex(10);

		WebElement mnthDrpDwn = driver.findElement(By.id("month"));
		Select mnthDrpDwn1 = new Select(mnthDrpDwn);
		mnthDrpDwn1.selectByIndex(10);

		WebElement yearDrpDwn = driver.findElement(By.id("year"));
		Select yearDrpDwn1 = new Select(yearDrpDwn);
		yearDrpDwn1.selectByIndex(13);

		driver.findElement(By.name("sex")).click();
//driver.findElement(By.className("hidden_elem _58ml")).click();

	}

}
