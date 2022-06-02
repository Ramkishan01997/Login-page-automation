package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumfr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
//		driver.quit();
		driver.navigate().to("http:www.google.com/");
		driver.findElement(By.name("q")).sendKeys("javapoint tutorials");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
//		driver.close();
		
		driver.navigate().to("http://www.javatpoint.com/");  
        
        //Maximize the browser  
         driver.manage().window().maximize(); 
         driver.findElement(By.xpath("//*[@id=\"gsc-i-id2\"]")).sendKeys("java"); 
         driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div/div/form/table/tbody/tr/td[2]/button")).click();
//         driver.findElement(By.xpath("//*[@id=\"___gcse_1\"]/div/div/form/table/tbody/tr/td[2]")).click();
//         driver.manage().window().minimize(); 
//         JavascriptExecutor js = (JavascriptExecutor)driver;  
//         js.executeScript("scrollBy(0, 5000)");   
//           
//          // Click on the Search button  
//         driver.findElement(By.linkText("Core Java")).click();    
	}

}
