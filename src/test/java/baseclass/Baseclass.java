package baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	
	public static WebDriver driver = null;
	//static String URL = "https://demoqa.com/";
	static String URL1= "https://parabank.parasoft.com/";
	
	static JavascriptExecutor js; 
	
	public static void main(String[] args) {
		
		Baseclass.Initialization();
		Baseclass.maximize();
		Baseclass.Implicitwait();
		Baseclass.click_on_xpath_text("Withdraw Funds");
		//driver.findElement(By.xpath("//*[contains(text(),'Withdraw Funds')]")).click();
		
		//Baseclass.click_on_xpath("Products");
		
		System.out.println("execution completed");
	}
	
	public static void Initialization() {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path+"\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL1);
	}
	
	public static void parabankclick() {
		
	
		
		
	}
	
	public static void demoqa() {
		
		WebElement element = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].click(); "+element);
		System.out.println("Javascript worked");
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]")).click();
		//Baseclass.javascript("Select picture");
		
		
		//Baseclass.javascript("Elements");
		//Baseclass.javascript("Book Store Application");
		//Baseclass.click_on_xpath("Book Store Application");
		
	}
	
	public static void maximize(){
		driver.manage().window().maximize();
	}
	
	public static void Implicitwait(){
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	public static void javascript_textclick(String element) {
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[contains(text(),'"+element+"')]")));
	}
	
	
	public static void click_on_xpath_text(String element) {
		//driver.findElement(By.xpath("//*[contains(text(),"+element+")]")).click();
		WebElement createdelement = driver.findElement(By.xpath("//*[contains(text(),'"+element+"')]"));
		js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].click(); ", createdelement);
		
	}
}
