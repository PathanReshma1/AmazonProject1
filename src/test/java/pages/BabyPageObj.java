package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class BabyPageObj extends BaseClass {
public WebElement babyText= driver.findElement(By.xpath("//div[@class='fst-h1-st pageBanner']/h1"));

}
