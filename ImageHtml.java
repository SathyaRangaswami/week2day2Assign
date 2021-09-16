package week2.day2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageHtml {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("http://leafground.com/pages/Image.html");
	driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
	driver.navigate().back();
	String src = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).getAttribute("src");
	System.out.println("src image"+src);
	driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).click();
	System.out.println("Broken image");
	driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
	String title=driver.getTitle();
	System.out.println("title of home page"+title);
}
}
