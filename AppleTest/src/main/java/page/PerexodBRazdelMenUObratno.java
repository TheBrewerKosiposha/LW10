package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PerexodBRazdelMenUObratno extends AbstractPage
{
    private final String BASE_URL = "https://www.marko.by/";
    protected final Duration WaitSec = Duration.ofSeconds(3);
    private final By ClickToMen =  By.xpath("//div[@class='t']");
    private final By ClickToMenNew =  By.xpath("//div[@class='select__head']");
    private final By ClickToMenNewы =  By.xpath("//div[@class='select__head open']");
    private final By UlLook = By.xpath("//ul[@class='select__list catalog_sort_select']");
    private final By LiLook = By.xpath("//li[@class='select__item catalogSortBlockItem' and code='price_asc']");

    public PerexodBRazdelMenUObratno(WebDriver driver) {

        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public AbstractPage openPage()
    {
        driver.navigate().to(BASE_URL);
        driver.findElement(ClickToMen).click();
        driver.findElement(ClickToMenNew).click();



        return this;
    }


    public PerexodBRazdelMenUObratno GoToMen()
    {

        return this;
    }





}
