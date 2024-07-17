import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class Test1
{
	public static void main(String[] args)
	{
	WebDriver driver = new ChromeDriver();

	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   
	WebElement usernameField = driver.findElement(By.name("username"));
    usernameField.sendKeys("Admin");

    // Find the password field using its name attribute and enter the password
    WebElement passwordField = driver.findElement(By.name("password"));
    passwordField.sendKeys("admin123");

    // Find the login button using its ID or another attribute and click it
    WebElement loginButton = driver.findElement(By.id("loginButton"));
    loginButton.click();
    // Close the browser
    driver.close();
	}
}
