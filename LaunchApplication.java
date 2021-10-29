package week2.day1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get(" http://leaftaps.com/opentaps/");


 WebElement  eleuername=  driver.findElement(By.id("username")); 
 eleuername.sendKeys("demosalesmanager");
  
  driver.findElement (By.name("PASSWORD")).sendKeys("crmsfa");
 driver.findElement(By.className("decorativeSubmit")).click();
  driver.findElement(By.linkText("CRM/SFA")).click();
  driver.findElement(By.linkText("Create Lead")).click();
  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("saranya");
  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("adhi");
  driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("saran");
  driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("08/24/99");
  driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("603209");
  driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("6947893");
  driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8925082177");
  driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("saranayanathiya@gmail.com");
  driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("kdfdkdsk");
  driver.findElement(By.xpath("//input[@name='submitButton']")).click();
  String title = driver.getTitle();
  System.out.println(title);
  String text = driver.findElement(By.xpath("//span[text()='First name']/following::span")).getText();
  System.out.println(text);
  
  
  
  
  
  
	}

}
