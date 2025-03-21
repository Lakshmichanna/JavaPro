import java.io.File;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

public class Se4All {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver dr = new ChromeDriver();

		dr.manage().window().maximize();

		dr.get("https://testautomationpractice.blogspot.com/");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		/*
		 * System.out.println("Tittle of page:" +dr.getTitle());
		 * 
		 * System.out.println("URL of page:"+dr.getCurrentUrl());
		 * 
		 * String Heading =
		 * dr.findElement(By.xpath("//div[@class ='titlewrapper']/h1")).getText();
		 * 
		 * System.out.println(Heading);
		 * 
		 * 
		 * //Relative Locators
		 * 
		 * WebElement mail = dr.findElement(By.id("email"));
		 * 
		 * dr.findElement(RelativeLocator.with(By.tagName("input")).above(mail)).
		 * sendKeys("atp@yopmail.com");
		 * 
		 * dr.findElement(RelativeLocator.with(By.tagName("input")).below(mail)).
		 * sendKeys("9632587410");
		 * 
		 * //Radio box
		 * 
		 * dr.findElement(By.
		 * xpath("//input[@class =\"form-check-input\" and @id=\"male\"]")).click();
		 
		// Check box

		int checkcount = dr.findElements(By.xpath("//input[@class ='form-check-input' and @type='checkbox']")).size();
		System.out.println(" No. of checkboxes: " + checkcount);

		for (int i = 1; i <= checkcount; i++) {

			dr.findElement(By.xpath("(//input[@class ='form-check-input' and @type='checkbox'])[" + i + "]")).click();

			System.out.println(dr.findElement(By.xpath("(//input[@class =\"form-check-input\" and @type=\"checkbox\"])["
					+ i + "]/following-sibling::label")).getText());

		}

		// select drop down

		Select s = new Select(dr.findElement(By.id("country")));
		s.selectByIndex(2);
		s.selectByValue("germany");
		s.selectByVisibleText("India");
		// s.deselectByVisibleText("India"); You may only deselect options of a
		// multi-select

		Select s1 = new Select(dr.findElement(By.id("animals")));

		List<WebElement> colorlist = s1.getOptions();

		for (WebElement color : colorlist) {

			System.out.println("Options of Dropdown :" + color.getText());

		}

		s1.selectByIndex(3);
		
		
		
		//Datepicker 
		
		dr.findElement(By.cssSelector(".hasDatepicker")).click();
	//dr.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight']")).click();
		
		
		// select the given date 
		
		dr.findElement(By.id("txtDate")).click();
		Select dt =new Select(dr.findElement(By.xpath("//select[@data-handler ='selectMonth']")));
		dt.selectByIndex(5);
		Select yr =new Select(dr.findElement(By.xpath("//select[@data-handler ='selectYear']")));
		yr.selectByValue("2027");
		
		List<WebElement> dt1 = dr.findElements(By.xpath("//td[@data-handler ='selectDay']"));
		
		for(WebElement cell: dt1) {
			 
			System.out.println(cell.getText());
			
			if(cell.getText().equalsIgnoreCase("5")) {
				
				cell.click();
				break;
			}
					
			
		}
		
		//Dynamic Xpath
		 
	WebElement dy  = dr.findElement(By.xpath("//button[text()='STOP' or text()='START']"));
	dy.click();
	System.out.print(dy.getText());
	
	//simple alert
		
	
	dr.findElement(By.id("alertBtn")).click();
	Alert al = dr.switchTo().alert();
		al.accept();
		
		
		//confirmation alert
		dr.findElement(By.id("confirmBtn")).click();
		al.dismiss();
		
		dr.findElement(By.id("promptBtn")).click();
		al.sendKeys("sunitha");
		System.out.println(al.getText());
		al.accept();
		
		
		
//	dr.findElement(By.xpath("//*[text()='New Tab']")).click();
		
		//Set<String> win = dr.getWindowHandles();
		
		/*for(String tab: win) {
			
			dr.switchTo().window(tab);
			
			System.out.println(tab);
			String t= dr.getTitle();
			System.out.println(t);
			if(t.equalsIgnoreCase("your store")) {
				dr.close();
			}
			}
		
		//dr.switchTo().defaultContent();
		//Actions Methods
		// mouse hover 
		
		WebElement mh =dr.findElement(By.xpath("//button[text()='Point Me']"));
		Actions a = new Actions(dr);
		a.moveToElement(mh).perform();
		Thread.sleep(1000);
		dr.findElement(By.xpath("//a[normalize-space()='Mobiles']")).click();
		 
		
		//double click 
		a.doubleClick(dr.findElement(By.xpath("//button[text()='Copy Text']"))).build().perform();
		String f2=dr.findElement(By.id("field2")).getText();
		System.out.println(f2);
		if(f2.equalsIgnoreCase("Hello World!")) {
			f2.contentEquals("Hello World!");
			System.out.println("Hello World! is copied");
			
		}
		
		//drag & drop
		WebElement s,d;
		s= dr.findElement(By.id("draggable"));
		d = dr.findElement(By.id("droppable"));
		a.dragAndDrop(s, d).build().perform();
		Thread.sleep(1000);
		//second approach
		a.clickAndHold(s).moveToElement(dr.findElement(By.xpath("//h2[text()='Drag and Drop']"))).release().build().perform();
		
		//Scrolling the page with random offset value
		
		JavascriptExecutor js =(JavascriptExecutor)dr;
		
		//js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(1000);

	//	WebElement v =dr.findElement(By.xpath("//h2[text()='Scrolling DropDown']//following-sibling::div//input"));
		
		//js.executeScript("arguments[0].scrollIntoView(true);",v);

		//Slider for horizontal slider change the x location & for vertical slider change the y location
		
		WebElement min = dr.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		WebElement max = dr.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
		
	System.out.println("min: " +min.getLocation());
	//System.out.println("Maxi :" + max.getLocation());
	
	a.dragAndDropBy(min, 5, 0).perform();
	a.dragAndDropBy(max, -50, 0).perform();
	
	System.out.println("min after sliding: " +min.getLocation());
	System.out.println("Maxi after sliding :" + max.getLocation());
	
	Thread.sleep(2000);
   js.executeScript("window.scrollBy(0,300)", "");
	// SVG Element - where it cannot be access with absolute or normal xpath. where for SVG element there is attribute name is used in xpath
	/*WebElement sv= dr.findElement(By.xpath("/div[@class='svg-container']//*[name()='svg'][2]"));
	js.executeScript("arguments[0].scrollIntoView(true);",sv);
	sv.click();
	System.out.println(sv.getText());
	*/
		
	//dr.findElement(By.xpath("//button[text()='Upload Multiple Files']")).click();
	dr.findElement(By.id("multipleFilesInput")).sendKeys("/Users/thinuser/Downloads/users.pdf" + "\n"+ "/Users/thinuser/Downloads/Flight Reports.pdf");
			//"unkown.pdf" + "\n" + "Flight_Reports.csv");
		
   
   dr.findElement(By.id("comboBox")).click();
   dr.findElement(By.id("apple")).click();
   
   Thread.sleep(1000);
   dr.navigate().back();
   
   
   TakesScreenshot ts = (TakesScreenshot)dr;
   
 File sf=  ts.getScreenshotAs(OutputType.FILE);
 
 File savef = new File(System.getProperty("user.dir")+"//reports//+repNamepage.png");
 
 sf.renameTo(savef);
 
 
 WebElement sv= dr.findElement(By.xpath("//div[@id='HTML1']"));
 
 File ele = sv.getScreenshotAs(OutputType.FILE);
 
 File savef1 = new File(System.getProperty("user.dir")+"//reports//+specificelement.png");
 
 sf.renameTo(savef1);
 
 
 System.out.print(System.getProperty("user.dir"));
  //Shadow Dom - This element is inside shadow dom which can't be accessed through XPath, use cssSelector for it
 Thread.sleep(2000);

 
 SearchContext sh = dr.findElement(By.cssSelector("#shadow_content")).getShadowRoot();
 

 
String SDOMText =  sh.findElement(By.cssSelector(".info")).getText();

System.out.println(SDOMText);
 
 
 
}
}
