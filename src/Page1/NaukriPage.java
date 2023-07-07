package Page1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NaukriPage {
	WebDriver driver;
	By login=By.xpath("//*[@id=\"login_Layer\"]");
	By email=By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[2]/input");
    By passwrd=By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[3]/input");
    By submit=By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[6]/button");
    By search=By.xpath("/html/body/div[3]/div[2]/div[1]/div/span") ;
    By search2=By.xpath("/html/body/div[3]/div[2]/div[1]/div/div/div[1]/div/div/div/input");
    By search3=By.xpath("/html/body/div[3]/div[2]/div[1]/div/button/span[2]");
    By chek=By.xpath("//*[@id=\"root\"]/div[5]/div/div[2]/div[1]/div/ul/li[1]/div[2]/div/a[1]/i");
    By companies=By.xpath("//*[@id=\"root\"]/div[3]/div[2]/nav/ul/li[2]");
    By itcomp=By.xpath("//*[@id=\"root\"]/div[3]/div[2]/nav/ul/li[2]/div/ul[2]/li[3]");
    By logo=By.xpath("//a[@class='nI-gNb-header__logo nI-gNb-company-logo']");
    By harm=By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div[3]/div/div[1]");
    By notification=By.xpath("//span[@class='ni-gnb-icn ni-gnb-icn-bell']");
    By pending=By.xpath("//div[@title='Pending Actions']");
    By edit=By.xpath("/html/body/div[3]/div/div/span/div/div/div/div/div[2]/div/div[1]/div[1]/div[1]/div/div[3]/div/span[3]");
    By mobile=By.xpath("/html/body/div[6]/div[7]/div[2]/div/form/div[4]/div[3]/div/div/div/div[1]/input");
    By save=By.xpath("/html/body/div[6]/div[7]/div[2]/div/form/div[7]/div/button");
    By logout=By.xpath("//a[@data-type='logoutLink']");
    		 
	
public NaukriPage(ChromeDriver driver) {
		this.driver=driver;
	}
public void method1()
{
	driver.findElement(login).click();
}
public void method2(String lemail,String lpasswrd )
{
	driver.findElement(email).sendKeys(lemail);
	driver.findElement(passwrd).sendKeys(lpasswrd);
}
public void method3()
{
	driver.findElement(submit).click();
	
}
public void method4()
{
	
	driver.findElement(search).click();
	
	
}
public void method5(String ss)
{
	driver.findElement(search2).sendKeys(ss);

}
public void method6()
{
	driver.findElement(search3).click();
}
public void method7() 
 { 
	WebElement e=driver.findElement(companies);
	Actions act=new Actions(driver);
	act.moveToElement(e).perform();
	
 }public void method8() throws InterruptedException
 {
	 driver.findElement(itcomp).click();
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,3000)");
	 Thread.sleep(3000);
	 JavascriptExecutor s = (JavascriptExecutor) driver;
	 s.executeScript("window.scrollBy(0,-3000)");
 }
public void method9()
{
	WebElement ee=driver.findElement(chek);
	boolean isSelected = ee.isSelected();
	if(isSelected == false) {
		ee.click();
	}
}
public void method10()
	{
	 WebElement logo1=driver.findElement(logo);
	 boolean l=logo1.isDisplayed();
	 System.out.println("logo is present "+l);

	
	}

 public void method11()
		
 {
	 WebElement d=driver.findElement(notification);
		Actions act=new Actions(driver);
		act.moveToElement(d).perform(); 
	 
}
 public void pendingc()
 {
	 driver.findElement(pending).click();
 }
 public void method12()
 {
	 driver.findElement(harm).click();
	 
 }
 public void pendinge()
 {
	 driver.findElement(edit).click();
 }
 public void mob(String m)
 {
	 driver.findElement(mobile).sendKeys(m);
	 driver.findElement(save).click();
	 driver.navigate().back();
	 driver.navigate().back();
	 driver.navigate().back();
 }
 
 public void logout()
 {
    driver.findElement(logout).click();
 }
}
