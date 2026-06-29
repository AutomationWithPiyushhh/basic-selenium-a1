package learning_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookKeyBoard {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);

		Actions act = new Actions(driver);
//		type username
		act.sendKeys("admin").perform();

//		act.keyDown(Keys.CONTROL).perform();
//		act.sendKeys("a").perform();
//		act.keyUp(Keys.CONTROL).perform();

//		students will write code for copy here
		
		Thread.sleep(2000);

//		press tab => keyDown() = key press, keyUp() = key release
		act.keyDown(Keys.TAB).perform();
		act.keyUp(Keys.TAB).perform();

//		students will write code for paste here
		
//		ṭype password
		act.sendKeys("123456789").perform();

//		press enter
		act.keyDown(Keys.ENTER).perform();
		act.keyUp(Keys.ENTER).perform();

		Thread.sleep(3000);
		driver.quit();
	}
}
