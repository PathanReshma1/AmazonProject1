package base;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CommonMethods extends BaseClass{

	public void mouseHover(WebElement target) {
		Actions ac=new Actions(driver);
	//	ac.moveToElement(target).build().perform();//executes the same as line 11
		ac.moveToElement(target).perform();
		
}
	
	public void choosingFromAccountList(List<WebElement> target, String text) {
		for(WebElement option:target)
		{
			if(option.getText().equals(text))
			{
				option.click();
				break;
			}
		}
	}
}
