package page;

import org.openqa.selenium.WebDriver;

import java.time.Duration;


//Test Automation Framework как набор рекомендаций по созданию и проектированию тестовых случаев
public abstract class AbstractPage
{
    protected WebDriver driver;

    protected abstract AbstractPage openPage();

    protected final Duration WAIT_TIMEOUT_SECONDS = Duration.ofSeconds(7);

  //  protected final int WAIT_TIMEOUT_SECONDS = 7;


    protected AbstractPage(WebDriver driver)
    {
        this.driver = driver;
    }
}
