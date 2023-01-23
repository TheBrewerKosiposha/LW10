package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NewPrexodToBackForMenu extends AbstractPage
{

    private final String BASE_URL = "https://outleto.by";
    private final By ClickTo = By.xpath("/html/body/footer/div/div/div[2]/div[1]/ul/li[2]/a");

    private final By ClickToFromMen = By.xpath("/html/body/section[2]/div/div[1]/div/div[1]/a[2]");

    private final By ClickToFromMenFor4Mobile = By.xpath("/html/body/section[2]/div[2]/div[2]/div[1]/div/div[1]");
    protected final Duration timer = Duration.ofSeconds(7);

    private final By ClickToFromMap = By.xpath("/html/body/section[2]/div/div[1]/div[1]/div/div[2]/div/div/div/div/div[5]/a");

    private final By ClicToMapLevel2 = By.xpath("/html/body/section/div/div[3]/ul/li[3]/a");

    private final By ClickToBackMenu = By.xpath("/html/body/header/div/div/div[2]/div/a");

    private final By ClickToUslug = By.xpath("/html/body/section[3]/div/div/div[2]/p/a");



    private final By ClicToSaitKFC = By.xpath("/html/body/section[3]/div[1]/div/div[5]");

    private final By PisatbText = By.xpath("/html/body/section[2]/div/div[2]/div[1]/form/div[2]/input");
    private final By PisatbTextTwo = By.xpath( "/html/body/section[2]/div/div[2]/div[1]/form/div[4]/div/div/div/textarea");



    protected final Duration timerToMenu = Duration.ofSeconds(10);

    public NewPrexodToBackForMenu(WebDriver driver)
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
        driver.findElement(ClickToFromMap).click();
        jse.executeScript("window.scrollBy(0,450);");
        new WebDriverWait(driver, timer)
                .until(ExpectedConditions.elementToBeClickable(ClicToMapLevel2));
        driver.findElement(ClicToMapLevel2).click();

        new WebDriverWait(driver,timerToMenu )
                .until(ExpectedConditions.elementToBeClickable(ClickToBackMenu));
        driver.findElement(ClickToBackMenu).click();
        jse.executeScript("window.scrollBy(0,800);");
        new WebDriverWait(driver,timerToMenu )
                .until(ExpectedConditions.elementToBeClickable(ClickToUslug));
        driver.findElement(ClickToUslug).click();
        jse.executeScript("window.scrollBy(0,800);");
        new WebDriverWait(driver,timerToMenu )
                .until(ExpectedConditions.elementToBeClickable(ClicToSaitKFC));
        driver.findElement(ClicToSaitKFC).click();
        jse.executeScript("window.scrollBy(0,5000)");
        new WebDriverWait(driver,timerToMenu )
                .until(ExpectedConditions.elementToBeClickable(PisatbText));
        driver.findElement(PisatbText).sendKeys(Keys.TAB,"ЛюбительПокакать");
        driver.findElement(PisatbTextTwo).sendKeys(Keys.TAB,"Что-то очень мудрое");
        return null;
    }
}
