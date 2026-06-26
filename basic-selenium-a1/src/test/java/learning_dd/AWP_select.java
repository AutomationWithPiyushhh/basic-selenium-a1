package learning_dd;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AWP_select {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://automationwithpiyush.vercel.app/dropdown.html");
		
//		handle single select dropdown
		WebElement ssDD = driver.findElement(By.id("single-select"));
		Select selSingle = new Select(ssDD);
		selSingle.selectByIndex(5);
		
		boolean status1 = selSingle.isMultiple();
		if (status1) {
			selSingle.deselectAll();
		}
		
		List<WebElement> countries = selSingle.getOptions();
		for (WebElement i : countries) {
			System.out.println(i.getText());
		}
		
		
//		handle multi select dropdown
		WebElement msDD = driver.findElement(By.id("multi-select"));
		Select selMulti = new Select(msDD);
		selMulti.selectByVisibleText("Python");
		selMulti.selectByVisibleText("Git");
		selMulti.selectByVisibleText("Maven");
		
		
//		WebElement firstSelected = selMulti.getFirstSelectedOption();
//		System.out.println(firstSelected.getText());
		
		List<WebElement> allSelected = selMulti.getAllSelectedOptions();
		for (WebElement i : allSelected) {
			System.out.println(i.getText());
		}
		
//		Thread.sleep(2000);
//		boolean status2 = selMulti.isMultiple();
//		if (status2) {
//			selMulti.deselectAll();
//		}
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
