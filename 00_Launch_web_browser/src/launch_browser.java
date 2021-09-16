import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_browser
{
    public static void main ( String [] args ){
        System.setProperty( "webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();

        String title = "";
        String expectedTitle = "Google";
        String url = "https://www.google.com.mx/";
        driver.get( url );

        driver.close();
    }
}
