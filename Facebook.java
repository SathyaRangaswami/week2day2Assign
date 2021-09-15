package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		String title = driver.getTitle();
		System.out.println("title"+title);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Sathya");
		driver.findElement(By.name("lastname")).sendKeys("Rangaswami");
		driver.findElement(By.xpath("//div[contains(text(),'Mobile number')]")).sendKeys("123456789");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Alliswell@123");			
			WebElement bday = driver.findElement(By.id("day"));
		Select bday1=new Select(bday);
		bday1.selectByValue("13");
		WebElement month = driver.findElement(By.id("month"));
		Select month1=new Select(month);
		month1.selectByIndex(2);
		WebElement year = driver.findElement(By.id("year"));
		Select year1=new Select(year);
		year1.selectByVisibleText("1988");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		
	}

}
