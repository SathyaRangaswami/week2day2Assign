package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
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
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("sathya");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath("//div[@class='x-grid3-hd-inner x-grid3-hd-firstName']/following::tr[1]/td[3]/div/a[1]")).getText();
		 System.out.println("name: "+text);
		 driver.findElement(By.xpath("//div[@class='x-grid3-hd-inner x-grid3-hd-firstName']/following::tr[1]/td[3]/div/a[1]")).click();
		 String view = driver.findElement(By.xpath("//div[text()='View Lead']")).getText();
		 if(view.equals("View Lead"))
		 {
			 System.out.println("view Lead is verified");
		 }
		 else
		 {
			 System.out.println("Title not verified");
		 }
		
			driver.findElement(By.linkText("Edit")).click();
			driver.findElement(By.id("updateLeadForm_companyName")).clear();
			//driver.findElement(By.xpath("//span[text()='Company Name']")).clear();
			driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("New Cname test");
			driver.findElement(By.xpath("//input[@value='Update']")).click();
			String text2 = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();	
			 System.out.println("newcompanyName: "+text2);
			 
			 if(text2.contains("New Cname test"))
			 {
				 System.out.println("Comapny name is updated");
			 }
			 else
			 {
				 System.out.println("Comapny name is not updated");
			 }
			 Thread.sleep(5000);
			 driver.close();
			}

}
