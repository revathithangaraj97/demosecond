package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpg {

	WebDriver driver;
	
	By txt_username=By.id("usename");
	By txt_password=By.id("password");
	By btn_login=By.id("login");
	
	
	public void username(String username)
	{
	driver.findElement(txt_username).sendKeys(username);
	}
	public void password(String password)
	{
	driver.findElement(txt_password).sendKeys(password);;
	}
	public void login()
	{
	driver.findElement(btn_login).click();
	}
	
	public loginpg(WebDriver driver)
	{
		this.driver=driver;
	}
	
}
