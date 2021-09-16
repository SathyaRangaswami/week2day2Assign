package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditHtml {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("sathya@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("text to append");
		String value = driver.findElement(By.xpath("//input[@value=\"TestLeaf\"]")).getAttribute("value");
		System.out.println("default value"+value);
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		
		

	}

}
