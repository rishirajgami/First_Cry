package Firstcry;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Jacket {
	String driverPath = "C:\\Users\\dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";	
	WebDriver driver=new ChromeDriver();

	@BeforeTest
	void n() throws InterruptedException {
	driver.get("https://firstcrystore.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}
	
	@Test (priority=1)
	void account() {
		WebElement ac=driver.findElement(By.xpath("//span[normalize-space()='Account']"));
		ac.click();
}
	
	@Test (priority=2)
	void email() {
		WebElement e=driver.findElement(By.xpath("//input[@name='email']"));
		e.sendKeys("palakshukla3230@gmail.com");
}
    @Test (priority=3)
	void pass() {
		WebElement ps=driver.findElement(By.xpath("//input[@name='password']"));
		ps.sendKeys("Akash@123");
}
    @Test (priority=4)
    void sign() throws InterruptedException {
		WebElement s=driver.findElement(By.xpath("//button[@type='submit']"));
		s.click();
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		a.accept();
}
    
    @Test (priority=5)
    void jacket() {
		WebElement j=driver.findElement(By.xpath("//div[@class='header']//div[5]"));
        j.click();
        
}
    
    @Test (priority=6)
    void baby_girljacket() {
		WebElement bg=driver.findElement(By.xpath("//li[normalize-space()='Baby Girl Jacket']"));
        bg.click();
}
    
    @Test (priority=7)
    void babyoye_fullsleeves() {
		WebElement bf=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/div[1]/a[1]/button[1]"));
        bf.click();
}
    
    @Test (priority=8)
    void add_tocart() throws InterruptedException {
		WebElement ac=driver.findElement(By.xpath("//a[@href='#/productcart']"));
        ac.click();
        Thread.sleep(2000);
        driver.navigate().refresh();
}
    
    @Test (priority=9)
    void proceed_tocheck() {
		WebElement pc=driver.findElement(By.xpath("//a[normalize-space()='Proceed To Checkout']"));
        pc.click();
       
}
    
    @Test (priority=10)
    void cash_ondelivery() {
		WebElement cd=driver.findElement(By.xpath("//input[@id='directcheck']"));
        cd.click();
       
}
    
    @AfterTest
	void Close() {
		driver.quit();
		
}
}