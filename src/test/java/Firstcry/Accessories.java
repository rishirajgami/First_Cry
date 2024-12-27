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

public class Accessories {
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
	void accessor() {
		WebElement a=driver.findElement(By.xpath("//div[@class='top-cotegories hover-product-list y-gap']"));
		a.click();
		
}
	@Test (priority=6)
	void breast_pump() throws InterruptedException {
		WebElement bp=driver.findElement(By.xpath("//li[normalize-space()='Breast Pump']"));
		Thread.sleep(5000);		
		bp.click();
	
}
	
	@Test (priority=7)
	void babyhug() throws InterruptedException {
		WebElement bh=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/div[1]/a[1]/button[1]"));
		Thread.sleep(2000);
	    bh.click();
		
}
	@Test (priority=8)
	void add_tocart() throws InterruptedException {
		WebElement ac=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[1]"));
		ac.click();
		Thread.sleep(2000);
}
	
	@Test (priority=9)
	void proceed_checkout() {
		WebElement pc=driver.findElement(By.xpath("//a[normalize-space()='Proceed To Checkout']"));
		pc.click();
		driver.navigate().refresh();
}
	
	@Test (priority=10)
	void first_name() {
		WebElement fn=driver.findElement(By.xpath("//input[@name=\"firstName\"]"));
	    fn.sendKeys("Palak");
		
}
	
	@Test (priority=11)
	void last_name() {
		WebElement ln=driver.findElement(By.xpath("//input[@placeholder='Doe']"));
	    ln.sendKeys("Shukla");

}
	
	@Test (priority=12)
	void email_id() {
		WebElement ei=driver.findElement(By.xpath("//input[@placeholder='example@email.com']"));
	    ei.sendKeys("palakshukla@gmail.com");

}
	
	@Test (priority=13) 
	void mobile() {
		WebElement mn=driver.findElement(By.xpath("//input[@placeholder='+123 456 789']"));
	    mn.sendKeys("8303043230");

}
	
	@Test (priority=14)
	void address_line1() {
		WebElement al=driver.findElement(By.xpath("//input[@name='addressLine1']"));
	    al.sendKeys("Panki Kanpur");
}
	
	@Test (priority=15)
	void address_line2() {
		WebElement a=driver.findElement(By.xpath("//input[@name='addressLine2']"));
	    a.sendKeys("f block");
}
	
	@Test (priority=16)
	void city() {
		WebElement c=driver.findElement(By.xpath("//input[@name='city']"));
	    c.sendKeys("Kanpur");
}
	
	@Test (priority=17)
	void state() {
		WebElement s=driver.findElement(By.xpath("//input[@name='state']"));
	    s.sendKeys("Uttar Pradesh");
}
	
	@Test (priority=18)
	void Zip_code() {
		WebElement z=driver.findElement(By.xpath("//input[@placeholder='123']"));
	    z.sendKeys("208020");
}
	
	
	@Test (priority=19)
	void Cash_ondelivery() {
		WebElement cd=driver.findElement(By.xpath("//input[@id='directcheck']"));
	    cd.click();
	    
}
	
	@Test (priority=20)
	void place_order() throws InterruptedException {
		WebElement po=driver.findElement(By.xpath("//button[@class=\"btn btn-block btn-primary font-weight-bold py-3\"]"));
	    po.click();
	    Thread.sleep(2000);
	    Alert a=driver.switchTo().alert();
		a.accept();
		
	    
}
	
	@AfterTest
	void Close() {
		driver.quit();
	    
}
}