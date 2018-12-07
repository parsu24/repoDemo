package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class auto {

	public static void main(String[] args) throws Exception {
			   
			    WebDriver driver=new FirefoxDriver();
			   
			    driver.manage().window().maximize();
			   
			    driver.get("http://www.flipkart.com/");
			   
			  // Type something on Search textbox
			    driver.findElement(By.name("q")).sendKeys("mobil");
			   
			  // Create object on Actions class
			    Actions builder=new Actions(driver);
			   
			  // find the element which we want to Select from auto suggestion

			    WebElement ele=driver.findElement(By.xpath(".//*[@id='list_?']/li[3]/ac_odd"));
			   
			  // use Mouse hover action for that element
			    builder.moveToElement(ele).build().perform();

			   // Give wait for 2 seconds 
			    Thread.sleep(200);
			   
			  // finally click on that element
			    builder.click(ele).build().perform();

			}
			}
		
		
		
	
