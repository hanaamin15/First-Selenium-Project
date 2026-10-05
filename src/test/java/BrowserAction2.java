import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class BrowserAction2 {
    @Test
    public void FirstTest() {
        WebDriver driver = new SafariDriver();
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.Udemy.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        Dimension Ipaddimension = new Dimension(1024, 768);
        driver.manage().window().setSize(Ipaddimension);
        String URL = driver.getCurrentUrl();
        System.out.println(" Current page URL is :" + URL);


    }
}
