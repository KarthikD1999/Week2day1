package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2day1Assignment2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//driver.close();	
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//find we are in right page
		WebElement logout = driver.findElement(By.className("decorativeSubmit"));
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Inxztegrum");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("czxc");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("AD");
		WebElement drop = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select select = new Select(drop);
		select.selectByVisibleText("Employee");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computer Science");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("abcdefghijklmopqrstuvwxyz");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("karthikdamotharan99@gmail.com");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sel = new Select(state);
		sel.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		String Completed = driver.getTitle();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		String title = driver.getTitle();
		System.out.println(title);
	}
}
