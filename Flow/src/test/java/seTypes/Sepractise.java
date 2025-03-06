package seTypes;

import java.io.File;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import dev.failsafe.internal.util.Durations;

public class Sepractise {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver d = new ChromeDriver();
		d.get("https://testautomationpractice.blogspot.com/");
		d.manage().window().maximize();

		String curUrl = d.getCurrentUrl();
		System.out.println("current Url: " + curUrl);
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String title = d.getTitle();

		System.out.println("Tittle of page :" + title);

		/*
		 * // Fields enter
		 * 
		 * WebElement name =
		 * d.findElement(By.xpath("//input[@placeholder='Enter Name']"));
		 * name.sendKeys("Xpath locator"); // input[@placeholder="Enter Name"]
		 * 
		 * // se-4 Relative locators WebElement email =
		 * d.findElement(RelativeLocator.with(By.tagName("input")).below(name));
		 * email.sendKeys("seauto@yopmail.com");
		 * 
		 * d.findElement(By.id("phone")).sendKeys("7412589630");
		 * 
		 * // Dynamic xpath
		 * 
		 * WebElement firstclick =
		 * d.findElement(By.xpath("//*[text()='STOP' or text() ='START']"));
		 * firstclick.click(); System.out.println("text of first click: " +
		 * firstclick.getText());
		 * 
		 * d.findElement(By.xpath("//*[@class ='start' or @class ='stop']")).click();
		 * 
		 * // Xpath - axes
		 * 
		 * WebElement search = d.findElement(By.
		 * xpath("//*[@class ='wikipedia-search-bar']/descendant::input[1]"));
		 * search.sendKeys("selenium 4");
		 * 
		 * d.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(search)).
		 * click();
		 * 
		 * // radio button - click()
		 * 
		 * d.findElement(By.xpath("//*[text()='Male']/preceding::input[1]")).click();
		 * 
		 * // Check box - click()
		 * 
		 * int cbsize =
		 * d.findElements(By.xpath("//*[@class='form-check-input' and @type='checkbox']"
		 * )).size(); System.out.println("Number.of check boxes : " + cbsize);
		 * 
		 * for (int i = 1; i <= cbsize; i++) {
		 * 
		 * d.findElement(By.
		 * xpath("(//*[@class='form-check-input' and @type='checkbox'])[" + i +
		 * "]")).click();
		 * 
		 * String txt = d.findElement(By
		 * .xpath("(//*[@class='form-check-input' and @type='checkbox'])[" + i +
		 * "]/following-sibling::label")) .getText();
		 * 
		 * System.out.println("Text of the check box " + i + ": " + txt);
		 * 
		 * }
		 * 
		 * 
		 * // Drop down select
		 * 
		 * Select s = new Select(d.findElement(By.id("country")));
		 * 
		 * s.selectByValue("uk"); Thread.sleep(1000); s.selectByVisibleText("Germany");
		 * List<WebElement> opt = s.getOptions();
		 * 
		 * for( WebElement sopt :opt ) { System.out.println("Options of Dropdown :"
		 * +sopt.getText() ); }
		 * 
		 * WebElement word=
		 * d.findElement(By.xpath("//label[contains(text(), 'Colors')]"));
		 * 
		 * System.out.println(word.getText());
		 * 
		 * Select sc = new Select(d.findElement(By.xpath("//*[@id='colors']")));
		 * 
		 * sc.selectByIndex(3);
		 * 
		 * System.out.println(sc.getFirstSelectedOption());
		 * 
		 * 
		 * Select se = new Select(d.findElement(By.id("animals")));
		 * se.selectByVisibleText("Zebra");
		 * 
		 
		// Date Picker

		d.findElement(By.id("datepicker")).click();

		// get the selected month

		for (int i = 1; i <= 12; i++) {
			String month = d.findElement(By.xpath("//*[@class=\"ui-datepicker-month\"]")).getText();

			System.out.println("name of month:" + month);

			if (month.equalsIgnoreCase("March")) {
			
				List<WebElement> cell = d.findElements(By.xpath("(//*[@class=\"ui-state-default\"])"));
				System.out.println(cell.size());
				for (int c = 1; c <= cell.size(); c++) {

					String date = d.findElement(By.xpath("(//*[@class=\"ui-state-default\"])[" + c + "]")).getText();
					if (date.equals("24")) {

						d.findElement(By.xpath("(//*[@class=\"ui-state-default\"])[" + c + "]")).click();
						

					}

				}
				break;
			}

			else {

				d.findElement(By.xpath("//*[@title=\"Next\"]")).click();
			}

		}

		
		//DatePicker-3
		
		d.findElement(By.id("start-date")).sendKeys("08022025");
		
		d.findElement(By.id("end-date")).sendKeys("25032025");
		
		d.findElement(By.xpath("(//*[text()='Submit'])[1]")).click();
		
		System.out.println("Days count: " + d.findElement(By.id("result")).getText());
		
		
		//Alert Handling
		
		//Simple Alert
		
		d.findElement(By.xpath("//*[contains(text(),'Simple Alert')]")).click();
		
		Alert al = d.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		Thread.sleep(1000);
		
		//Confirmation alert 
		
		d.findElement(By.id("confirmBtn")).click();
		al.dismiss();
		
		
		//Prompt alert
		d.findElement(By.id("promptBtn")).click();
		System.out.println(al.getText());
		al.sendKeys("Prompt alert handle");
		al.getClass();
		al.accept()
		*/
		
		// Second approach 
		d.findElement(By.id("confirmBtn")).click();
		WebDriverWait e = new WebDriverWait(d,Duration.ofSeconds(10));
		e.until(ExpectedConditions.alertIsPresent()).accept();
		
		d.findElement(By.xpath("//*[text()='New Tab']")).click();
		
		Set<String> win = d.getWindowHandles();
		
		for(String tab: win) {
			
			d.switchTo().window(tab);
			
			String t= d.getTitle();
			System.out.println(t);
			if(t.equalsIgnoreCase("")) {
				d.close();
			}
		}
		
		//Scrolling the page
		JavascriptExecutor j = (JavascriptExecutor)d;
		j.executeScript("window.scrollBy(0,2000)");
		
		Thread.sleep(2000);
		d.findElement(By.linkText("Apple")).click();
		
		//Actions for mouse operations 
		Actions a = new Actions(d);
		a.contextClick(d.findElement(By.id("a"))).perform();
		
		//Screenshot 
		TakesScreenshot sch = (TakesScreenshot)d;
		File f = sch.getScreenshotAs(OutputType.FILE);
		
		
	}

}
