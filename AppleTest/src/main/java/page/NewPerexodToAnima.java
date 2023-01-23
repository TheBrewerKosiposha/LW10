package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NewPerexodToAnima extends AbstractPage {

    private final String BASE_URL = "https://outleto.by";

    private final By ClickTo = By.xpath("/html/body/footer/div/div/div[2]/div[1]/ul/li[2]/a");
private final By ClickToAnimal = By.xpath("/html/body/section[2]/div/div[1]/div/div[1]/a[4]");

private final By ClickToInfo = By.xpath("/html/body/section[2]/div[2]/div[2]/div[1]/div/div[1]/div[5]/div[1]/a");


    protected final Duration timerToMenu = Duration.ofSeconds(10);

    public NewPerexodToAnima(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public AbstractPage openPage() {
        driver.navigate().to(BASE_URL);
        driver.findElement(ClickTo).click();
        driver.findElement(ClickToAnimal).click();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500);");
        driver.findElement(ClickToInfo).click();
        return null;
    }
}
