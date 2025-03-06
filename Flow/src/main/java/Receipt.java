import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Receipt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*1.Launch Browser  
		Why we want create ChromeDriver object ?  because  We want launch the browser which is chrome browser 
		As soon as creating object this chrome browser has constructor
		ie: default constructor that constructor automatically launch chrome browser 
		Whenever we create chrome driver class object, Internally the chrome driver constructor automatically invoked 
		That constructor will launch chrome browser  
		 */

		WebDriver driver= new ChromeDriver();

		/*2.Open URL: https://qacorporate.trackex.com:8082/trackexb2e-v4/login*/
		driver.manage().window().maximize();
		driver.get("https://qacorporate.trackex.com:8082/trackexb2e-v4/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



		//3.Get title & Validate title  
		/*
		String title=driver.getTitle();
		//System.out.println(driver.getTitle());

		if(title.equals("TrackEx | Login Page"))
		{
		System.out.println("Test Passed ");
		}
		else
		{
			System.out.println("Test has been failed ");
		}

		 */


		driver.findElement(By.name("email")).sendKeys("nmnga@us.com");
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		driver.findElement(By.id("LoginPasswordTrackExB2E")).sendKeys("Msr@123$");
		driver.findElement(By.xpath("//button[text()='Login']")).click();


		//Handling Override popup 
		try {

			WebElement ele=driver.findElement(By.cssSelector("button.swal2-confirm"));
			if(ele.isDisplayed()==true)
				ele.click();
		} catch(Exception e)

		{
			e.getStackTrace();
		}


		driver.findElement(By.xpath("//span[text()='Add Receipt']")).click();
		
		
		
		

		driver.findElement(By.xpath("//a[normalize-space()='Manually Add']")).click();

		Thread.sleep(2000);
		//Populate Dropdown 
		driver.findElement(By.xpath("//input[@role='combobox']")).click();
		// driver.findElement(By.xpath("(//span[@class='ng-arrow-wrapper'])[1]")).click();

		//Get Receipt size and print list 

		List<WebElement> list=driver.findElements(By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']//div[2]//div"));
		System.out.println(list.size());

		for(WebElement li:list)
		{
			//System.out.println(li.getText()); 

			if(li.getText().equals("Breakfast")) 
			{
				li.click();  
				break;
			}



		}


		//driver.findElement(By.cssSelector("label[for='labelForDescription']")).sendKeys("Breakfast & Drinks ");

		driver.findElement(By.xpath("//textarea[@id='labelForDescription']")).sendKeys("Breakfast & Drinks ");

		//Calendar and date selection 
		driver.findElement(By.xpath("//input[@id='kt_datepicker_1']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'17')]")).click();

		
		WebElement ele1=	driver.findElement(By.xpath("//ng-select[@id='labelForCountryCurrency']//input[@role='combobox']"));
		ele1.sendKeys("United", Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='labelForCost']")).sendKeys("45.25");
		driver.findElement(By.xpath("//ng-select[@id='labelForPaymentMode']//input[@role='combobox']")).sendKeys("CARD",Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='kt_typeahead_vendor']")).sendKeys("Zomato & Swiggy");
		
		driver.findElement(By.xpath("//input[@id='kt_typeahead_location']")).sendKeys("Amaravathi");
		
		driver.findElement(By.xpath("//input[@id='kt_typeahead_nofpersons']")).sendKeys("1");
		
		Thread.sleep(2000);
	//driver.findElement(By.xpath("//div[@class='kt-dropzone__msg dz-message needsclick']")).click();
	
	driver.findElement(By.xpath("//input[@id='multiFiles']")).sendKeys("C:/Users/satyanarayana.b/Desktop/Receipt.png");
		
	driver.findElement(By.xpath("//button[@id='addExpense_notify_btn']")).click();
	
	Thread.sleep(2000);
	
		
	
	/*driver.findElement(By.linkText("My Expenses")).click();
	
	driver.findElement(By.xpath("//a[normalize-space()='Add Expense']")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Receipts List']")).click();
	
	
	
	 List<WebElement> Receiptlist= driver.findElements(By.xpath("//*[@class='col text-left checkBoxWidth']/label/span"));
	 System.out.println("Receipt List:"+Receiptlist.size());
		
	//a[normalize-space()='Add Expense']
		Thread.sleep(7000);

 */
		driver.quit();




	}

}
