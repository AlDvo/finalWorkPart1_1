package finalWorkPart1_1.util;

import finalWorkPart1_1.manager.DriverManager;
import io.qameta.allure.Attachment;
import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class AllureReporter implements AfterTestExecutionCallback {

    @Override
    public void afterTestExecution(ExtensionContext context) {
        if (context.getExecutionException().isPresent()) {
            takeScreenshot();
        }
    }

    @Attachment(type = "image/png", value = "Screenshoot")
    public static byte[] takeScreenshot() {
        return ( (TakesScreenshot) DriverManager.getDriverManager().getDriver() ).getScreenshotAs(OutputType.BYTES);
    }
}
