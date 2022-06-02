package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedInLoginTest {

	public static void main(String[] args) throws InterruptedException{
		 System.setProperty("webdriver.chrome.driver", "C://BrowserDriver//chrome//chromedriver.exe");
		  WebDriver driver=new ChromeDriver();

		 
		  		  driver.get("https://www.linkedin.com/");
		  		  driver.manage().window().maximize();
	         driver.findElement(By.name("session_key")).sendKeys("ramkishan01997@gmail.com");//enter username
	         driver.findElement(By.name("session_password")).sendKeys("Ram@1997");//enter password
	        
	         driver.findElement(By.className("sign-in-form__submit-button")).click();//click on button
	         driver.findElement(By.className("secondary-action")).click();
	         String expectedTitle="(7) Jobs | LinkedIn";//(7) Jobs | LinkedIn
	         String actualTitle=driver.getTitle();

			  if(expectedTitle.equals(actualTitle)==true) {
				  System.out.println("succeful");
			  }else {
				  System.out.println("unsucceful");
			  }
	  Thread.sleep(3000);
			  WebElement search= driver.findElement(By.xpath("//*[@id=\"global-nav-search\"]/div/button/li-icon/svg"));
			 search.sendKeys("selenium testing ");
			  search.sendKeys(Keys.ENTER);
			  driver.close();
		


	}

}
