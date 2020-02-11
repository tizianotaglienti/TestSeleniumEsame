package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;;

public class testEsame {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.convertworld.com/it/velocita/");		

		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form/p[2]/input")).sendKeys("20");
		driver.findElement(By.xpath("//*[@id=\"from_speed\"]")).sendKeys("km/h"); 
		driver.findElement(By.xpath("//*[@id=\"to_speed\"]")).sendKeys("miglia all'ora");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form/p[2]/a[2]/img")).click();		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div[3]/b/label[text()='12,43 mph']"));
		
		driver.get("http://www.calcolatrice.io/");

		driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/input[4]")).sendKeys("((12,43*60/55)-(12,43*60/75))");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/input[3]/label[text()='3,616']"));
		driver.close();	
	}

	
	
}
