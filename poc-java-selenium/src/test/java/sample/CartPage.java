package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

public class CartPage extends PageObject {

    private static final long DEFAULT_TIMEOUT_WAIT = 10;

    @FindBy(id = "cart_title")
    private WebElement cartTitle;

    public CartPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void getTitleCart(String text) {
        String alert = this.cartTitle.getText().trim();
        assertEquals("Page not found!", text, alert);
    }
}
