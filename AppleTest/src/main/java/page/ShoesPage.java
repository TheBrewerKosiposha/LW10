package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ShoesPage extends AbstractPage
{
    private final String BASE_URL = "https://www.marko.by/muzhchinam/";


    @FindBy(xpath ="//a[@class='prod__inner']" )
    private WebElement buttonOB;

    private final By ListDiv = By.xpath("//button[@class='c-bn']");
    private final By button = By.xpath("//button[@class='c-bn']");
    private final By sidebar__block = By.xpath("//div[@class='sidebar__block ']");

    private final By label = By.xpath("//label[@for='arrFilter_1097_3288835175']");

    private final By label2 =By.xpath("//label[@for='arrFilter_1097_3288835175']");
    private final By  button_ghost_red = By.xpath("//a[@class='button button_ghost-red filterShowButton to___process']");

    private final By button1 = By.xpath("//a[@class='button button_ghost-red filterShowButton to___process']");

    private final By prod__inner = By.xpath("//a[@class='prod__inner']");

    private final By product__size_item = By.xpath("//li[@size='40' and @class='product__size_item sizeItem sizeItemDesktop  ']");

    private final By product__button = By.xpath("//a[@class='product__button btn-default toShopsButtonDesktop']");

    private final By Good = By.xpath("//a[@class ='book-btn btn-default btn-with-icon productBookingModalButton to___process']");
    public ShoesPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public ShoesPage openPage()
    {
        driver.navigate().to(BASE_URL);
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(ListDiv));
        driver.findElement(button).click();

        return this;
    }

    public ShoesPage chooseTheFirstPair(){
        Dimension dimension = new Dimension(1500, 662);
        driver.manage().window().maximize();

        List<WebElement> elements=driver.findElements(sidebar__block);
        elements.get(2).click();

        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(label));
      driver.findElement(label2).click();
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(button_ghost_red));
        driver.findElement(button1).click();

        driver.findElement(prod__inner).click();

     driver.findElement(product__size_item).click();

        driver.findElement(product__button).click();
        driver.findElement(Good).click();

        return this;
    }

}