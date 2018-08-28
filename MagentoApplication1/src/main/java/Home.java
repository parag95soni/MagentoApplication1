import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home 
{
	WebDriver driver;
	By myacc = By.xpath("//*[@id='block-magento-footer']/ul/li[5]/a");
	public Home(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public void clickOnMyacc() 
	{
		driver.findElement(myacc).click();;
	}

}
