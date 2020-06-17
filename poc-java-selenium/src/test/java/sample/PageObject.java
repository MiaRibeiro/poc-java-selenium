package sample;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class PageObject {
   protected static WebDriver webDriver;

   public PageObject(WebDriver webDriver) {
      PageObject.webDriver = webDriver;
      PageFactory.initElements(webDriver, this);
   }

   public void ClickJS (String element){
      JavascriptExecutor jse = (JavascriptExecutor) webDriver;
      jse.executeScript(element+".click();");
   }

}
