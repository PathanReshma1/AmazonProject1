package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import base.CommonMethods;
import pages.HomePageObj;

public class HomePageTestr extends BaseClass {
	
	//@Test(priority=1)
	public void openBestSeller()
	{
		HomePageObj hp=new HomePageObj();
		hp.bestSellerLinkWeb.click();
		String expectedResult = "https://www.amazon.com/gp/bestsellers/?ref_=nav_cs_bestsellers";
	 	String actualResult=driver.getCurrentUrl();
		Assert.assertTrue(expectedResult.equals(actualResult));		
	}

	//@Test(priority=2)		
	public void openMusic() {
		HomePageObj hp=new HomePageObj();
				hp.musicLinkWeb=driver.findElement(By.linkText("Music"));
			 hp.musicLinkWeb.click();
			 	String expectedResult="https://www.amazon.com/music/player?ref_=nav_cs_music";
			 	String actualResult=driver.getCurrentUrl();
			 	Assert.assertTrue(expectedResult.equals(actualResult)); 	
	}
	//@Test(priority=3)
	public void OpenAccountListDD() throws InterruptedException {
		CommonMethods cm=new CommonMethods();
		HomePageObj hp=new HomePageObj();
		cm.mouseHover(hp.AccountantListDD);
		Thread.sleep(5000);
	}
	
	@Test(priority=4)
	public void OpenMusicLibrary() throws InterruptedException {
		CommonMethods cm=new CommonMethods();
		HomePageObj hp=new HomePageObj();
		cm.mouseHover(hp.AccountantListDD);
		cm.choosingFromAccountList(hp.optionsOfAccountList, "Music Library");
		Thread.sleep(5000);
	}
}
		
	

