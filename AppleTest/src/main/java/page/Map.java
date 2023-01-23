package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Map extends AbstractPage
{
    private final String BASE_URL = "https://outleto.by";
    private final By ClickTo = By.xpath("/html/body/div[1]/div/ul/li[3]/a");

    private final By ClickToLevelZero = By.xpath("/html/body/section/div/div[3]/ul/li[2]/a");
    private final By ClickToLeveltwo = By.xpath("/html/body/section/div/div[3]/ul/li[3]/a");

    private final By ClickToMenu = By.xpath("/html/body/header/div/div/div[2]/div/a");

    protected final Duration timer = Duration.ofSeconds(20);

    public Map(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public AbstractPage openPage() {
        driver.navigate().to(BASE_URL);
        driver.findElement(ClickTo).click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500);");
        new WebDriverWait(driver, timer)
                .until(ExpectedConditions.elementToBeClickable(ClickToLevelZero));
        driver.findElement(ClickToLevelZero).click();
        new WebDriverWait(driver, timer)
                .until(ExpectedConditions.elementToBeClickable(ClickToLeveltwo));
        driver.findElement(ClickToLeveltwo).click();
        new WebDriverWait(driver, timer)
                .until(ExpectedConditions.elementToBeClickable(ClickToMenu));
        driver.findElement(ClickToMenu).click();
        return null;
    }
}
