import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class launch_browser
{
    public static void main ( String [] args ) throws InterruptedException {
        System.setProperty( "webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();

        String url = "https://sqeautomation.wordpress.com/sample-html-page/";
        driver.get( url );

        Select dropDown = new Select ( driver.findElement(By.id( "g11-text-1" )) );
        dropDown.selectByIndex( 1 ); // Index start from 0, so it will select the second option

        WebElement submitFormBtn = driver.findElement( By.xpath ("//*[contains(text(),'Submit')]") );
        submitFormBtn.click();

        Thread.sleep( 2000 );
        driver.close();
    }
}
