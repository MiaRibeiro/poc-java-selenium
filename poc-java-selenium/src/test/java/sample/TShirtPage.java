package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

public class TShirtPage extends PageObject {

    private static final long DEFAULT_TIMEOUT_WAIT = 10;

    @FindBy(css = "a[title='Women']")
    private WebElement womenTShirtTitle;

    public TShirtPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void getwomenTshirtTitle(String text) {
        String alert = this.womenTShirtTitle.getText().trim();
        assertEquals("Page not found!", text, alert);
    }
}
