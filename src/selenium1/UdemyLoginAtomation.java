package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdemyLoginAtomation {

	public static void main(String[] args) {
		

		 System.setProperty("webdriver.chrome.driver", "C://BrowserDriver//chrome//chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		//automation of udemy
		  driver.get("https://www.udemy.com/home/my-courses/learning/");
      driver.findElement(By.name("email")).sendKeys("manav9545714224@gmail.com");//enter username
      driver.findElement(By.name("password")).sendKeys("Ram@1997React");//enter password
      driver.findElement(By.name("submit")).click();//click on button
      String expected="Online Courses - Learn Anything, On Your Schedule | Udemy";
      String actualtitle=driver.getTitle();
		  if(expected.equals(actualtitle)) {
			  System.out.println("succeful");
		  }else {
			  System.out.println("fail");
		  }

	}

}
