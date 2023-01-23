import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonConditions {

    protected WebDriver driver;

    @BeforeMethod()
    public void setUp() {
        driver = new EdgeDriver();
    }
/*
    @AfterMethod(alwaysRun = true)
    public void stopBrowser() {
        driver.quit();
    }

 */
}
