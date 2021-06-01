package steps;

import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.AttachmentHelper;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ErrorAtDataTest extends TestBase{

    private TestSteps steps = new TestSteps();

    @Test
    @Owner("ovchernyshenko")
    @Story("Feedback")
    @DisplayName("Проверка формы обратной связи. Ошибка данных")
    public void errorAtDataTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        steps.openMainPage();
        steps.userATK();
        steps.fillErrorAtDataForm();
    }
}
