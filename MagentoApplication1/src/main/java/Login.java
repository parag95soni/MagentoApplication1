import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login 
{
	WebDriver driver;
	By email = By.xpath("//*[@id='email']");
	By pwd = By.xpath("//*[@id='pass']");
	By log = By.xpath("//*[@id='send2']");
	
	public Login(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public void typeEmail(String data) 
	{
		driver.findElement(email).sendKeys(data);
		System.out.println("Done Changes");
	}
	
	public void typePassword(String data) 
	{
		driver.findElement(pwd).sendKeys(data);
	}
	
	public void clickOnLogin() 
	{
		driver.findElement(log).click();
	}

}
