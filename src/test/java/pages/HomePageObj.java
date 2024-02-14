package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class HomePageObj extends BaseClass {
//public	 WebElement allDropDownWeb=driver.findElement(By.id("searchDropDownBox"));



//creating by xpath
public WebElement allDropDownWeb=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
public WebElement searchIconWeb=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
public 	WebElement bestSellerLinkWeb=driver.findElement(By.linkText("Best Sellers"));
public	WebElement musicLinkWeb=driver.findElement(By.linkText("Music"));
public WebElement textBoxWeb=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
public List<WebElement> homePageLinksWeb=driver.findElements(By.tagName("a"));
public  WebElement AccountantListDD =driver.findElement(By.xpath("//a[@id='nav-link-accountList']//span[@class='nav-line-2 ']"));
public List<WebElement> optionsOfAccountList=driver.findElements(By.xpath("//div[@id='nav-al-your-account']//a"));
		
//public			WebElement cartIconWeb=driver.findElement(By.xpath("//a[@id='nav-cart-icon nav-sprite']"));
//span[@class='nav-cart-icon nav-sprite']"));
	
}
