package Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page1.NaukriPage;


public class NaukriTest {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		
		driver=new ChromeDriver();
				driver.get("https://www.naukri.com/");
				driver.manage().window().maximize();

}@Test
	public void testing() throws InterruptedException
	{
	NaukriPage ob =new NaukriPage(driver);
	ob.method1();
	ob.method2("divyauthaman2016@gmail.com", "rahuldivya");
	ob.method3();
	Thread.sleep(3000);
	ob.method4();
	Thread.sleep(3000);
	ob.method10();
	Thread.sleep(3000);
	ob.method5("software testing");
	Thread.sleep(3000);
	ob.method6();
	Thread.sleep(3000);
	 ob.method7();
	 Thread.sleep(3000);
	ob.method8();
	Thread.sleep(3000);
	ob.method9();
	Thread.sleep(3000);
	ob.method11();
	Thread.sleep(3000);
	ob.pendingc();
	Thread.sleep(3000);
	ob.pendinge();
	Thread.sleep(3000);
	ob.mob("7890654321");
	Thread.sleep(3000);
	ob.method12();
	Thread.sleep(3000);
	ob.logout();
	
	}
	
}
