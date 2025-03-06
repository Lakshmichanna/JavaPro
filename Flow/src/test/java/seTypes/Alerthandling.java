package seTypes;
import java.time.Duration;

import org.apache.commons.exec.ExecuteException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerthandling {

	public static void main(String[] args) throws InterruptedException, ExecuteException {
		// TODO Auto-generated method stub
		
		
		
		WebDriver d = new ChromeDriver();
		d.get("https://testautomationpractice.blogspot.com/");
		d.findElement(By.id("alertBtn")).click();
		
		Thread.sleep(2000);
		
		// Approach - 1
		Alert a = d.switchTo().alert();
		a.accept();
		
		// Approach - 2 - Explicit wait 
		
		d.findElement(By.id("alertBtn")).click();
		
		WebDriverWait ew = new WebDriverWait(d,Duration.ofSeconds(30));
		
		Alert a1 = ew.until(ExpectedConditions.alertIsPresent());
		System.out.print(a1.getText());
		
		a1.accept();
		
		//Approach -3 - Javascript 
		
		JavascriptExecutor js = (JavascriptExecutor)d;
		try {
		js.executeScript("window.alert=function{};");
		}catch(Exception e) {
			
		}
		
	}

}
