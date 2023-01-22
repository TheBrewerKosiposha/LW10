package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NewPerexod extends AbstractPage
{
    private final String BASE_URL = "https://outleto.by";
    private final By ClickTo = By.xpath("/html/body/footer/div/div/div[2]/div[1]/ul/li[2]/a");

    public NewPerexod(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    protected AbstractPage openPage() {
        driver.navigate().to(BASE_URL);
        driver.findElement(ClickTo).click();
        return null;
    }
}
