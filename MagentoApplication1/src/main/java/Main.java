import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main 
{
	WebDriver driver;
	By logout = By.xpath("//*[@id='screen-page']/div[3]/div[2]/div[1]/div/div[1]/a");

	public Main(WebDriver driver)
	{
		this.driver = driver;
	}

	public void clickOnLogout() 
	{
		driver.findElement(logout).click();
	}

}
