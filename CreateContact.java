package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	WebElement login = driver.findElement(By.className("decorativeSubmit"));
	login.click();
	WebElement crm = driver.findElement(By.linkText("CRM/SFA"));
	crm.click();
	driver.findElement(By.linkText("Create Contact")).click();
	driver.findElement(By.id("firstNameField")).sendKeys("sathya");
	driver.findElement(By.id("lastNameField")).sendKeys("Rangaswami");
	driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("happy");
	driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("testing");
	driver.findElement(By.name("departmentName")).sendKeys("Testing");
	driver.findElement(By.name("description")).sendKeys("Testing using locator");
	driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("testleaf@gmail.com");
	WebElement state= driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	Select state1=new Select(state);
	state1.selectByVisibleText("New York");
	driver.findElement(By.className("smallSubmit")).click();
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.name("description")).clear();
	driver.findElement(By.name("importantNote")).sendKeys("important note  using locator");
	driver.findElement(By.xpath("//input[@value='Update']")).click();
	String title = driver.getTitle();
	System.out.println("title of returning page:  "  +title);
	
	
}
}
