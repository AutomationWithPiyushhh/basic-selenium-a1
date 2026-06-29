package learning_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AWP_actions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://automationwithpiyush.vercel.app/actions.html");

		Thread.sleep(3000);

		Actions act = new Actions(driver);

//		hover
		WebElement hover = driver.findElement(By.xpath("//button[contains(text(), 'Hover')]"));
		act.moveToElement(hover).perform();
		
//		right click	
//		WebElement rc = driver.findElement(By.id("right-click-area"));
//		act.moveToElement(rc).contextClick().build().perform();
//		act.contextClick(rc).build().perform();

//		WebElement hold = driver.findElement(By.id("hold-icon"));

//		click and hold
//		act.moveToElement(hold).clickAndHold().build().perform();
//		act.clickAndHold(hold).build().perform();
//		Thread.sleep(3000);
//		act.release().build().perform();
		
//		single line code
//		act.clickAndHold(hold).pause(Duration.ofSeconds(3)).release().build().perform();
		
//		drag and drop
//		WebElement source = driver.findElement(By.id("prod-laptop"));
//		WebElement destination = driver.findElement(By.id("cart-zone"));
//		
////		approach 1 
//		act.dragAndDrop(source, destination).build().perform();
////		approach 2	
//		act.dragAndDropBy(source, 230, 0).build().perform();
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
