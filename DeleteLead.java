package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException {
		
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
	 driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
 driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1234567899");
 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
 Thread.sleep(5000);
 String leadid = driver.findElement(By.xpath("//td[1]/div[@class='x-grid3-hd-inner x-grid3-hd-partyId']/following::tr[1]/td[1]/div/a[1]")).getText();


 System.out.println(leadid);
 driver.findElement(By.xpath("//td[1]/div[@class='x-grid3-hd-inner x-grid3-hd-partyId']/following::tr[1]/td[1]/div/a[1]")).click();

 driver.findElement(By.linkText("Delete")).click();
 driver.findElement(By.linkText("Find Leads")).click();
 driver.findElement(By.name("id")).sendKeys(leadid);//capture lead id
 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
 WebElement records = driver.findElement(By.xpath("//div[contains(text(),'No records')]"));
 boolean records1=records.isDisplayed();
 if(records1==true)
 {
	 System.out.println("No records are found and record is deleted");
 }
 else
 {
	 System.out.println("records are found and not deleted");
 }
 Thread.sleep(5000);
 driver.close();
}
}
