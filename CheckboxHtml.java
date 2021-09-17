package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxHtml {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		boolean selected = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input")).isSelected();
		if(selected==true)
		{System.out.println("checkbox  selected");
		}
		else
		{System.out.println("checkbox not available");
		}
		boolean selected2 = driver.findElement(By.xpath("//div[3]/div[2]/input[@type='checkbox']")).isSelected();
		if(selected2==true)
		{
			System.out.println("checkbox  selected");
			driver.findElement(By.xpath("//div[3]/div[2]/input[@type='checkbox']")).click();
			
		}
		else
		{System.out.println("checkbox not available");
		}
	}

}
