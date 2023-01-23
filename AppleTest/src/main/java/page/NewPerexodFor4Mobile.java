package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NewPerexodFor4Mobile extends AbstractPage
{
    private final String BASE_URL = "https://outleto.by";
    private final By ClickTo = By.xpath("/html/body/footer/div/div/div[2]/div[1]/ul/li[2]/a");

    private final By ClickToFromMen = By.xpath("/html/body/section[2]/div/div[1]/div/div[1]/a[2]");

    private final By ClickToFromMenFor4Mobile = By.xpath("/html/body/section[2]/div[2]/div[2]/div[1]/div/div[1]");
    protected final Duration timer = Duration.ofSeconds(7);

    public NewPerexodFor4Mobile(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public AbstractPage openPage() {
        driver.navigate().to(BASE_URL);
        driver.findElement(ClickTo).click();
        new WebDriverWait(driver, timer)
                .until(ExpectedConditions.elementToBeClickable(ClickToFromMen));
        driver.findElement(ClickToFromMen).click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,450);");
        new WebDriverWait(driver, timer)
                .until(ExpectedConditions.elementToBeClickable(ClickToFromMenFor4Mobile));
        driver.findElement(ClickToFromMenFor4Mobile).click();
        return null;
    }
}
