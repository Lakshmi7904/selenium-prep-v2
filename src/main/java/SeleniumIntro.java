import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumIntro {

    public static void main(String[] args) {
        //invoking the browser
        //chrome browser


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "/Users/ravikiransarangu/Downloads/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        System.out.println(driver.getTitle());
    }
}
