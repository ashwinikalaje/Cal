package cali;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyCalci {

	public WebDriver driver;
		
			@BeforeTest
			public void Setup1()
			{
				System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\SeleniumComponents\\cd.exe");
			   driver= new ChromeDriver();
			   
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(2000,TimeUnit.SECONDS); //pgae load timeout
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); //implicit wait
				driver.manage().deleteAllCookies();
				driver.get("https://www.calculator.net/ ");
				
			}
			@Test(priority=1)
			public void add() throws Exception
			{
				 driver.findElement(By.xpath("//span[contains(text(),'–')]")).click();
				 driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
				 driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
				 driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
				 driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
				 driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
				 driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
				 
				 driver.findElement(By.xpath(" //tbody/tr[2]/td[2]/div[1]/div[1]/span[4]")).click();
				 
				 driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
				 driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
				 driver.findElement(By.xpath("//span[contains(text(),'5')]")).click();
				 driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
				 driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
				 driver.findElement(By.xpath("//span[contains(text(),'5')]")).click();
				 driver.findElement(By.xpath("//span[contains(text(),'=')]")).click();
				 Thread.sleep(2000);
				 String Result = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
				 Result = Result.replaceAll("\\Result", " ");
				 int n = Integer.parseInt(Result);
				 Assert.assertEquals("111111", n);
				 
				 System.out.println("result of Addtion value is 111111");
				
				}
		
			@Test(priority=2 )   
			public void sub() throws Exception
			{

			 driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
			   driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
			   driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
			   driver.findElement(By.xpath("//span[contains(text(),'8')]")).click();
			   driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
			   driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
			   
			   driver.findElement(By.xpath("//span[contains(text(),'–')]")).click();
			   
			   driver.findElement(By.xpath("//span[contains(text(),'–')]")).click();
			   driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
			   driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
			   driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
			   driver.findElement(By.xpath("//span[contains(text(),'9')]")).click();
			   driver. findElement(By.xpath("//span[contains(text(),'4')]")).click();
			   driver.findElement(By.xpath("//span[contains(text(),'8')]")).click();
			   driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
			   driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
			   
			   driver.findElement(By.xpath("//span[contains(text(),'=')]")).click();

			   Thread.sleep(2000);
			   String Result = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
				 Result = Result.replaceAll("\\Result", " ");
				 int n = Integer.parseInt(Result);
				 Assert.assertEquals("23329646", n);
					System.out.println("result of Addtion value is 23329646");
			}
			
			@Test(priority=3)
			public void multiplication() throws Exception 
			{
				
				
		    driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
		   driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		   driver.findElement(By.xpath("//span[contains(text(),'3')]")).click();
		   
		    driver.findElement(By.xpath("//span[contains(text(),'×')]")).click();
		    
		    driver.findElement(By.xpath("//span[contains(text(),'5')]")).click();
		    driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
		    driver.findElement(By.xpath("//span[contains(text(),'5')]")).click();
		    
		    driver.findElement(By.xpath("//span[contains(text(),'=')]")).click();
	    Thread.sleep(5000);
		    String Result = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
			 Result = Result.replaceAll("\\Result", " ");
			 int n = Integer.parseInt(Result);
			 Assert.assertEquals("222075", n);

		    System.out.println("result of value Multiplication is  222075");
		
			}
			
			
			@Test(priority=4)
			public void div() throws Exception
			
			{
				 driver.findElement(By.xpath("//span[contains(text(),'4')]")).click();
					
				   driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
				   driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
				   driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
				   driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[4]")).click();
				   driver.findElement(By.xpath("//span[contains(text(),'2')]")).click();
				   driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
				   driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]")).click();
				   driver.findElement(By.xpath("//span[contains(text(),'=')]")).click();
				   //  Thread.sleep(2000);
				     Thread.sleep(2000);
				     String Result = driver.findElement(By.xpath("//div[@id='sciOutPut']")).getText();
					 Result = Result.replaceAll("\\Result", " ");
					 int n = Integer.parseInt(Result);
					 Assert.assertEquals("20", n);
				   System.out.println("result of  Division value is 20");
			}
			
			
			
			@AfterTest
			public void close1() 
			{
	driver.close();
			}
					
	
}


