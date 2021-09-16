package week2.day2.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioHtml {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/radio.html");
		driver.findElement(By.xpath("//div[@id='first']/label")).click();
		boolean selected = driver.findElement(By.xpath("(//input[@name='news'])[2]")).isSelected();
		if(selected==true)
		{System.out.println("radio button selected");
		}
		else
		{System.out.println("radio button not available");
		}
		
		
		WebElement option = driver.findElement(By.name("age"));
		// Select option1=new Select(option);
		  // List<WebElement> options2 = option1.getOptions();
		  // System.out.println(options2.size());
		   if(option.isSelected()==true)
		   {
			   System.out.println("option is selected by default");
		   }
		   else
		   {
			   System.out.println("option not selected");
			   driver.findElement(By.xpath("(//input[@name='age'])[3]")).click();
		   }
		   
	}

}
