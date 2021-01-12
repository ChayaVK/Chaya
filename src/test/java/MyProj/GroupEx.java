package MyProj;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class GroupEx {
	WebDriver driver;
  @Test//(priority= 1)
  public void a_navigateToPage() {
	  System.out.println("Test1");
	  driver.get("http://www.demo.guru99.com/V4/");
	  String ExpectedTitle="Guru99 Bank Home Page";
	  String CaptureTitle = driver.getTitle();
	  Assert.assertTrue(CaptureTitle.equals(ExpectedTitle), "TitleWrong");
	  
	  
  }
  @Test//(priority= 2)
  public void c_loginToURL()
  {
	  System.out.println("Test2");
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mngr256142");
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("erYhyze");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  driver.manage().window().maximize();	
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
	  
  }
  @Test//(priority= 3)
  public void d_verifyLogIn()
  {
	  System.out.println("Test3");
	  System.out.println(driver.findElement(By.xpath("//tr[2]")).getText());
	  System.out.println(driver.findElement(By.xpath("//tr[3]")).getText());
	  
  }
  @BeforeTest
  public void setUpBrowser() {
	  System.setProperty("webdriver.gecko.driver", "C:/Users/Chaya/Downloads/geckodriver.exe");
	  driver = new FirefoxDriver();
	  System.out.println("Before Test");
  }

  @AfterTest
  public void quitPage() {
	  System.out.println("After Test");
  }

}
