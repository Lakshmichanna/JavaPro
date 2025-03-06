import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginV4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

        
        // Define explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        // Navigate to the login page
        driver.get("https://qacorporate.trackex.com:8082/trackexb2e-v4/login");

        // Wait until the username field is visible
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginEmailTrackExB2E")));
        
        // Enter username
        usernameField.sendKeys("mt@mngb.com"); // Replace with the actual username

        driver.findElement(By.xpath("//*[@id='kt_login']/div/div[2]/div/div/div/div[2]/div[2]/form/div[2]/div/button")).click();
        driver.findElement(By.id("LoginPasswordTrackExB2E")).sendKeys("Msr@123");
        
        driver.findElement(By.xpath("//*[@class='kt-login__actions']/button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Addreceipt button
		driver.findElement(By.xpath("//span[@class='text-primary font-weight-bold font-size-h6 mt-2']")).click();
		// Manually Add
		driver.findElement(By.xpath("//a[normalize-space()='Manually Add']")).click();
		//Expense Type
		driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("Breakfast",Keys.ENTER);
		
		
		
		
		
	}

}
