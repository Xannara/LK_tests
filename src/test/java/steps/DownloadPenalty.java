package steps;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DownloadPenalty extends TestBase{

    private TestSteps steps = new TestSteps();

    @Test
    @Owner("ovchernyshenko")
    @Story("Download")
    @DisplayName("Проверка скачивания пени")
    public void downloadPenaltyTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        steps.openMainPage();
        steps.userOsertrov();
        steps.downloadPenalty();
    }
}
