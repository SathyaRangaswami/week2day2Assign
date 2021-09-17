package week2.day2.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHtml {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://www.leafground.com/pages/Dropdown.html");
	WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
	Select drop1=new Select(dropdown1);
	drop1.selectByVisibleText("UFT/QTP");
	WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
	Select drop2=new Select(dropdown2);
	drop2.selectByIndex(1);
	WebElement dropdown3 = driver.findElement(By.id("dropdown3"));
	Select drop3=new Select(dropdown3);
	drop3.selectByValue("2");
   WebElement option = driver.findElement(By.className("dropdown"));
  Select option1=new Select(option);
   List<WebElement> options2 = option1.getOptions();
   System.out.println(options2.size());
   driver.findElement(By.xpath("(//div[@class='example']/select)[5]")).sendKeys("Loadrunner");
   //driver.findElement(By.xpath("//div/select/option[contains(text(),'You can also use sendKeys to select')]/following::option")).sendKeys("Selenium");
   driver.findElement(By.xpath("//select/option[contains(text(),'Select your programs')]/following::option[2]")).click();
   
   
   
}
}
