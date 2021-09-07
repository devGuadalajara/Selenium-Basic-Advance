import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1
{
    public static void main(String[] args)
    {
        System.setProperty( "webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();

        String url = "https://login.salesforce.com/";
        driver.get( url );

        driver.findElement(By.id("username")).sendKeys("sdffsd");
        driver.findElement(By.id("password")).sendKeys("ddddd");
        driver.findElement(By.id("Login")).click();

        driver.close();
    }
}
