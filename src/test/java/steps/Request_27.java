package steps;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Request_27 extends TestBase{
    private TestSteps steps = new TestSteps();

    @Test
    @Owner("ovchernyshenko")
    @Story("Requests")
    @DisplayName("Зачет платежа")
    public void request27Test() throws InterruptedException {
        SelenideLogger.addListener("allure", new AllureSelenide());
        steps.openMainPage();
        steps.userDrinevskaya();
        steps.request27();
    }
}
