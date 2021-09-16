package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkHtml {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.linkText("Go to Home Page")).click();
		System.out.println("Title"+driver.getTitle());
		System.out.println("Get url"+driver.getCurrentUrl());
		driver.findElement(By.linkText("HyperLink")).click();
		driver.findElement(By.xpath("//a[@href='Button.html']")).click();
		String title=driver.getTitle();
		System.out.println("Title "+title);
		if(title.contains("Interact with Buttons"))
		{
			System.out.println("navigated to the link");
		}
		else
		{
			System.out.println("Not navigated to the link");
		}
		
		driver.get("http://leafground.com/pages/Link.html");
		
	}
	
}
