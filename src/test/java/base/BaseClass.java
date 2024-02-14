package base;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//import dev.failsafe.internal.util.Assert;
public class BaseClass {
	public static  WebDriver driver;
	
@BeforeClass
		public void openAmazonApp() throws InterruptedException {
		 driver=new EdgeDriver();//declares the driver
		//Thread.sleep(2000);//waits for 2sec
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//bfor failing waits for 10sec
			//driver.get("https://www.amazon.com/");
		driver.navigate().to("https://www.amazon.com/");
	}

@AfterClass
public void closeApplication() {
	driver.quit();
}
}


