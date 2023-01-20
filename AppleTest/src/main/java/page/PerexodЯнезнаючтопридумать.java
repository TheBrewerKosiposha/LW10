package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PerexodЯнезнаючтопридумать extends AbstractPage{
    private final String BASE_URL = "https://www.marko.by/";
    private final By ClickTo =  By.xpath("//div[@class='t']");
    private final By ClickBack = By.xpath("//a[@class='header-assets__logo-inner']");
    public PerexodЯнезнаючтопридумать(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public AbstractPage openPage() {
        driver.navigate().to(BASE_URL);
        driver.findElement(ClickTo).click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(ClickBack));
        driver.findElement(ClickBack);
        return this;
    }
}
