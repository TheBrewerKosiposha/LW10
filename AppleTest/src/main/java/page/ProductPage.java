package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ProductPage extends AbstractPage
{
    private final String URL = "https://www.marko.by/";


    private final By dontMen = By.xpath("//div[@class='t']");
    private final By buttonFil = By.xpath("//div[@class='sortbar__items']");

    private final By sidebar__block = By.xpath("//div[@class='sidebar__block ']");



     private final By sidebar__headingRazmer = By.xpath("//div[@class = 'sidebar__heading' and 'Размеры'] ");


    private final By label = By.xpath("//label[@for='arrFilter_1097_3288835175']");

    private final By label2 =By.xpath("//label[@for='arrFilter_1097_705283403']");



    private final By labelSezon= By.xpath("//label[@for='arrFilter_1098_1982047774']");
    private final By labelSezons =By.xpath("//label[@for='arrFilter_1098_1982047774']");


    private final By  button_ghost_red = By.xpath("//a[@class='button button_ghost-red filterShowButton to___process']");

    private final By button1 = By.xpath("//a[@class='button button_ghost-red filterShowButton to___process']");
    public ProductPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @Override
    public ProductPage openPage()
    {
        driver.navigate().to(URL);
        driver.findElement(dontMen).click();
        return this;
    }


    public ProductPage addToBag(){
        driver.findElement(buttonFil).click();

        List<WebElement> elements=driver.findElements(sidebar__block);

        elements.get(2).click();
        elements.get(3).click();

        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(label));
        driver.findElement(label2).click();

        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(labelSezon));
        driver.findElement(labelSezon).click();




        return this;
    }

    public ProductPage addToBagTwo()
    {





        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(button_ghost_red));
        driver.findElement(button1).click();
        return this;
    }
}