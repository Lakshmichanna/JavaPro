package seTypes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		d.get("https://qa2.trackex.com:4089/trackexb2e-v4/login");
		
	String loginbtncolor= 	d.findElement(By.xpath("//button[text()='Next']")).getCssValue("background-color");
	
	System.out.println("Color : " +loginbtncolor);
	
	//String hexst = Color.fromString(loginbtncolor).asHex();

	}

}
