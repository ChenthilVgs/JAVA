package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	private static ChromeDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.className("inputBox")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Chenthil");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("VGS");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Chenthil");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("VGS");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("12/10/88");
		WebElement countCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countCode.clear();
		countCode.sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("0123456789");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@test.com");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Address1");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Address2");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Bangalore");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("10023");

		WebElement drpDown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drpDwn1 = new Select(drpDown1);
		drpDwn1.selectByIndex(2);
		WebElement drpDown2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drpDwn2 = new Select(drpDown2);
		drpDwn2.selectByValue("CATRQ_CARNDRIVER");
		WebElement drpDown3 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select drpDwn3 = new Select(drpDown3);
		drpDwn3.selectByVisibleText("Computer Software");
		WebElement drpDown4 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drpDwn4 = new Select(drpDown4);
		drpDwn4.selectByIndex(3);
		driver.findElement(By.className("smallSubmit")).click();
		String title1 ="View Lead | opentaps CRM";
		 String pageTitle = driver.getTitle();
		 if (title1.equals(pageTitle)) {
			System.out.println("Home Page");
		} else {
			System.out.println("Not The Home Page");
		}
	}

}
