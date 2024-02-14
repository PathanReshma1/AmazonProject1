package testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import base.CommonMethods;
import pages.BabyPageObj;
import pages.HomePageObj;

public class DropDown extends BaseClass {
	@Test(priority=0)
	public void findLinks() {
		HomePageObj hp=new HomePageObj();
		int numberOfLinks=hp.homePageLinksWeb.size();
		System.out.println("number of links in home page: "+numberOfLinks);
		
		
		
	}
	//@Test(priority=1)
	public void openBabyPage ()
			{
		HomePageObj hp=new HomePageObj();
		
		Select sel=new Select(hp.allDropDownWeb);
		sel.selectByVisibleText("Baby");
		hp.searchIconWeb.click();
		BabyPageObj babyPage=new BabyPageObj();
	String actualText=	babyPage.babyText.getText();
	String expectedText="The Baby Store";
	Assert.assertEquals(expectedText,actualText);
		
}
	//@Test(priority=2)
	public void openBookPage ()
	{
HomePageObj hp=new HomePageObj();

Select sel=new Select(hp.allDropDownWeb);
sel.selectByVisibleText("Books");
//hp.searchIconWeb.click();
hp.textBoxWeb.sendKeys(Keys.ENTER);
String actualTitle=driver.getTitle();
String expectedTitle="Amazon.com: Books";
Assert.assertEquals(expectedTitle,actualTitle);

}
	//@Test(priority=3)
	public void useOfKeyboardKey() {
		HomePageObj hp=new HomePageObj();
		hp.textBoxWeb.sendKeys("iphone");
        String press=Keys.chord(Keys.CONTROL,"A");
        hp.textBoxWeb.sendKeys(press);
        hp.textBoxWeb.sendKeys(Keys.ENTER);
	}
	
	@Test(priority=4)
	public void OpenAccounts() throws InterruptedException {
		CommonMethods cm=new CommonMethods();
		HomePageObj hp=new HomePageObj();
		cm.mouseHover(hp.AccountantListDD);
		cm.choosingFromAccountList(hp.optionsOfAccountList, "Account");
		Thread.sleep(5000);
	}
	
}
