package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		String title=driver.getTitle();
		System.out.println("title:"+title);
		
		driver.findElement(By.name("UserFirstName")).sendKeys("sathya");
		driver.findElement(By.name("UserLastName")).sendKeys("Rangaswami");
		driver.findElement(By.name("UserEmail")).sendKeys("testleaf@gmail.com");
		WebElement job = driver.findElement(By.name("UserTitle"));
		Select job1=new Select(job);
		job1.selectByVisibleText("IT Manager");
		driver.findElement(By.name("CompanyName")).sendKeys("testleaf");
		WebElement emp= driver.findElement(By.name("CompanyEmployees"));
		Select emp1=new Select(emp);
		emp1.selectByValue("75");
		driver.findElement(By.name("UserPhone")).sendKeys("1234567899");
		WebElement country= driver.findElement(By.name("CompanyCountry"));
		Select country1=new Select(country);
		country1.selectByValue("IN");
		WebElement check1 = driver.findElement(By.xpath("//div[@class='checkbox-ui']"));
		check1.click();		
		if (check1.isEnabled()) {					
            System.out.println("Checkbox is Enabled");					

        } else {			
            System.out.println("Checkbox is not Enabled");					
        }	
		driver.close();
	}
	
}
