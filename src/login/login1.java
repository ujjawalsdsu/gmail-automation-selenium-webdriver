package login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login1 {
	private static String username="/html/body/div/div[2]/div[2]/div[1]/form/div[1]/div/div[1]/div/div/input[1]";
	private static String gmail="/html/body/div/div[3]/div[1]/div/div/div/div[1]/div[1]/a";
	private static String emailid="ujjawalsharma.taurus@gmail.com";
	private static String next="/html/body/div/div[2]/div[2]/div[1]/form/div[1]/div/input";
	private static String password ="/html/body/div/div[2]/div[2]/div[1]/form/div[2]/div/div[2]/div/div/input[2]";
	private static String pwd="UJJAWALSHARMA";
	private static String signin="/html/body/div/div[2]/div[2]/div[1]/form/div[2]/div/input[1]";
	private static String compose="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[1]/div/div";
	private static String maximise="/html/body/div[14]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[2]/div/div[2]/div/div/div/div/table/tbody/tr/td[2]/img[2]";
	private static String to="/html/body/div[15]/div/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/form/div[1]/table/tbody/tr[1]/td[2]/div/div/textarea";
	private static String subject="/html/body/div[15]/div/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/form/div[3]/input";
	private static String mailbody="/html/body/div[15]/div/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[1]/td/div/div[1]/div[2]/div[1]/div/table/tbody/tr/td[2]/div[2]/div";
	private static String shoot="/html/body/div[15]/div/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/div[4]/table/tbody/tr/td[1]/div/div[2]";
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath(username)).sendKeys(emailid);
		driver.findElement(By.xpath(next)).click();
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(password)).sendKeys(pwd);
		Thread.sleep(5000);
		driver.findElement(By.xpath(signin)).click();   
		Thread.sleep(5000);
		driver.findElement(By.xpath(compose)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(maximise)).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(to)).sendKeys("ujjawalsharma.taurus@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath(to)).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(subject)).sendKeys("Test mail");
		Thread.sleep(5000);
		driver.findElement(By.xpath(mailbody)).sendKeys("THIS IS A TEST MAIL!");
		Thread.sleep(5000);
		driver.findElement(By.xpath(shoot)).click();
		Thread.sleep(5000);
		driver.close();
		
		}
		
}
