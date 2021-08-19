package finalWorkPart1_1.pages;

import finalWorkPart1_1.manager.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected DriverManager driverManager = DriverManager.getDriverManager();
    protected WebDriverWait wait = new WebDriverWait(driverManager.getDriver(), 10, 1000);


    public BasePage() {
        PageFactory.initElements(driverManager.getDriver(), this);
    }


    protected void scrollToElementJs(WebElement element) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driverManager.getDriver();
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void fillField(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
//        Assertions.assertEquals( value ,driverManager.getDriver().findElement((By) element).getAttribute("value"), "Данные не совпадают");
    }
}
