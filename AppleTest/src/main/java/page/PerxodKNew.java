package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PerxodKNew  extends AbstractPage
{
    private final String BASE_URL = "https://www.marko.by/";
    private final By ClickTo =  By.xpath("//div[@class='user-options__item user-options__item_login']");
    private final By ClickToAbtor =  By.xpath("//a[@href='/registration/']");

    @FindBy(xpath = "//*[contains(@name,'last_name')]")
    private WebDriver LastNameText;


    public PerxodKNew(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public AbstractPage openPage() {
        driver.navigate().to(BASE_URL);
        driver.findElement(ClickTo).click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(ClickToAbtor));
        driver.findElement(ClickToAbtor).click();


        return this;
    }


}
