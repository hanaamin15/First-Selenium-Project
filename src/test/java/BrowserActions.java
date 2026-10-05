import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserActions {
    @Test
    public void openBrowser() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.nezamacademy.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.manage().window().maximize();
        Dimension Iphonedimension = new Dimension(390, 844);
        driver.manage().window().setSize(Iphonedimension);
        driver.manage().window().fullscreen();
        String URL = driver.getCurrentUrl();
        System.out.println(" Current page URL is :" + URL);
        String Title = driver.getTitle();
        System.out.println(" Current page title is :" + Title);
        String windowHandle = driver.getWindowHandle();
        System.out.println(" Window handle is :" + windowHandle);
        driver.switchTo().newWindow(WindowType.TAB);
        String newWindowHandle = driver.getWindowHandle();
        System.out.println(" New Window handle is :" + newWindowHandle);
        driver.close();
        driver.quit();


    }


}
