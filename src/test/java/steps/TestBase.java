package steps;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static helpers.AttachmentHelper.*;
import static helpers.DriverHelper.getConsoleLogs;

public class TestBase {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @AfterEach
    public void addAttachments() {
        attachScreenshot("Last screenshot");
        attachPageSource();
        attachAsText("Browser console logs", getConsoleLogs());
        closeWebDriver();
    }
}
