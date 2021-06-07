package steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class TestSteps {

    @Step ("Главная страница")
    public void openMainPage() {
        String BASE_URL = "https://lk-test.lk-kube.alfaleasing.ru/auth/login";
        open(BASE_URL);
     //   $(byId("details-button")).click();
     //   $(byId("proceed-link")).click();
    }

    @Step ("ИП Осетров С.А.")
    public void userOsertrov() {
        $(".input_type_tel .input__control").setValue("9519535355").shouldBe(visible);
        $(".input_type_password .input__control").setValue("WK9x650x").shouldBe(visible);
        $(".button .button__content .button__text").click();
        $(".button-menu__name").shouldHave(text("ИП Осетров С. А."));
    }

    @Step ("ИП Дриневская Ю.Ю.")
    public void userDrinevskaya() {
        $(".input_type_tel .input__control").setValue("9609901525").shouldBe(visible);
        $(".input_type_password .input__control").setValue("WK9x650x").shouldBe(visible);
        $(".button .button__content .button__text").click();
        $(".button-menu__name").shouldHave(text("ИП Дриневская Ю. Ю."));
    }

    @Step ("Альт-Профи, Олимп")
    public void userOlimp() {
        $(".input_type_tel .input__control").setValue("74845838968").shouldBe(visible);
        $(".input_type_password .input__control").setValue("kN2mBveyEGLp").shouldBe(visible);
        $(".button .button__content .button__text").click();
       // $(".button-menu__name").shouldHave(text("СТРОИТЕЛЬНАЯ КОМПАНИЯ ОЛИМП"));
    }

    @Step ("АТК-54")
    public void userATK() {
        $(".input_type_tel .input__control").setValue("79139152214").shouldBe(visible);
        $(".input_type_password .input__control").setValue("kN2mBveyEGLp").shouldBe(visible);
        $(".button .button__content .button__text").click();
        $(".button-menu__name").shouldHave(text("АТК-54"));
    }

    @Step ("Квинта")
    public void userKvinta() {
        $(".input_type_tel .input__control").setValue("79026065457").shouldBe(visible);
        $(".input_type_password .input__control").setValue("kN2mBveyEGLp").shouldBe(visible);
        $(".button .button__content .button__text").click();
        $(".button-menu__name").shouldHave(text("КВИНТА"));
    }

    @Step ("ИП Голиков Ю.В.")
    public void userGolikov() {
        $(".input_type_tel .input__control").setValue("79068300055").shouldBe(visible);
        $(".input_type_password .input__control").setValue("kN2mBveyEGLp").shouldBe(visible);
        $(".button .button__content .button__text").click();
        $(".button-menu__name").shouldHave(text("ИП Голиков Ю. В."));
    }

    @Step ("ИП Ахметзянов В.И.")
    public void userAkhmetzyanov() {
        $(".input_type_tel .input__control").setValue("79228064777").shouldBe(visible);
        $(".input_type_password .input__control").setValue("kN2mBveyEGLp").shouldBe(visible);
        $(".button .button__content .button__text").click();
        $(".button-menu__name").shouldHave(text("ИП Ахметзянов В. И."));
    }

    @Step ("Заполнение формы обратной связи. Пожелание")
    public void fillWishForm() {
        $(".button-feedback_view_icon").click();
        $(".icon-button__text .icon_size_l").click();
        $x("//span[contains(.,'Пожелание')]").click();
        $(".textarea__inner .textarea__control").click();
        $(".textarea__inner .textarea__control").setValue("Пожелание создано автотестом").shouldBe(visible);
        $(".modal-wrapper .button_view_extra .button__content").click();
        $(".modal-wrapper .button_size_l .button__content").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step ("Заполнение формы обратной связи. Ошибка в работе")
    public void fillErrorAtWorkForm() {
        $(".button-feedback_view_icon").click();
        $(".icon-button__text .icon_size_l").click();
        $x("//span[contains(.,'Ошибка в работе')]").click();
        $(".textarea__inner .textarea__control").click();
        $(".textarea__inner .textarea__control").setValue("Ошибка в работе создана автотестом").shouldBe(visible);
        $(".modal-wrapper .button_view_extra .button__content").click();
        $(".modal-wrapper .button_size_l .button__content").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step ("Заполнение формы обратной связи. Ошибка в данных")
    public void fillErrorAtDataForm() {
        $(".button-feedback_view_icon").click();
        $(".icon-button__text .icon_size_l").click();
        $x("//span[contains(.,'Ошибка в данных')]").click();
        $(".modal-wrapper .select-contracts__field").click();
        $(".item:nth-child(3)").click();
        $(".modal-feedback-send").click();
        $(".textarea__inner .textarea__control").click();
        $(".textarea__inner .textarea__control").setValue("Ошибка в данных создана автотестом").shouldBe(visible);
        $(".modal-wrapper .button_view_extra .button__content").click();
        $(".modal-wrapper .button_size_l .button__content").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step ("Перемещение по контрактам")
    public void transitionToContracts() {
        $x("//*[contains(text(), 'HYUNDAI Solaris')]").click();
        $(".contract-statistics__subtitle").shouldHave(text("Т333ЕК56 / 19874-ОРБ-19-Л от 18.11.2019"));

        $x("//*[contains(text(), 'УАЗ Patriot')]").click();
        $(".contract-statistics__subtitle").shouldHave(text("Х300УК56 / 20237-ОРБ-19-Л от 21.11.2019"));

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step ("Отправка письма")
    public void sendEmail() {
        $(".payment-group-line__icon").click();
        $(".toolbar__button:nth-child(1) > span").click();
        $(".input_has-autocomplete .input__input-wrapper .input__control").click();
        $(".input_has-autocomplete .input__input-wrapper .input__control").setValue("ovchernyshenko@alfaleasing.ru").shouldBe(visible);
        $(".modal-papers-send__textarea .textarea__control").click();
        $(".modal-papers-send__textarea .textarea__control").setValue("Письмо создано автотестом").shouldBe(visible);
        $(".modal-papers-send__btn-block .button_view_extra").click();
        $(".notification_visible .notification__closer").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step ("Скачивание пени")
    public void downloadPenalty() {
        $(".payment-group-line__icon").click();
        $x("//*[contains(text(), 'Скачать')]").click();
        $(".notification__title").click();
        $(".notification_visible .notification__closer").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step("Смена пароля")
    public void changePassword() {
        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(byText("Изменить пароль")).click();

        $(".modal-password-change .input_view_filled .input__control").click();
        $(".modal-password-change .input_view_filled .input__control").setValue("000000");

        $(".modal-password-change .input_view_filled .input__control").click();
        $(".modal-password-change .input_view_filled .input__control").setValue("kN2mBveyEGLp");

        $$(".modal-password-change .input_view_filled .input__control").get(1).click();
        $$(".modal-password-change .input_view_filled .input__control").get(1).setValue("kN2mBveyEGLp");

        $(".modal-password-change__btn-block .button_view_extra").click();
        $(".modal-password-change__btn-block .button_size_l").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step ("Смена компании")
    public void changeCompany() {

        $(".page-cabinet__content .contract-statistics__header .contract-statistics__title").shouldHave(text("Все договоры"));

        if (($$(byXpath("//*[contains(text(),'16%')]")).isEmpty()))  {
          //  if ($$(".page-cabinet__header .header-button-bar__menu .button-menu__name").$$(byText("ООО \"СТРОИТЕЛЬНАЯ КОМПАНИЯ ОЛИМП\"")).size() == 0 ) {
            $(".header-button-bar__menu .icon_name_arrow-down").click();
            $$(".header-popup-menu .organizations__item .item-button__text").get(1).click();

            $(".header-button-bar__menu .icon_name_arrow-down").click();
            $(".header-popup-menu__item-button .icon_name_logout").click();
        } else
            //if ($(byText("ООО \"АЛЬТ-ПРОФИ\"")).exists())
            //if ($(".page-cabinet__header .header-button-bar__menu .button-menu__name").shouldNotHave(text("ООО \"СТРОИТЕЛЬНАЯ КОМПАНИЯ ОЛИМП\"")).isEnabled())
          //   ($(".page-cabinet__header .header-button-bar__menu .button-menu__name").$(byText("ООО \"АЛЬТ-ПРОФИ\"")).isDisplayed())
    // if ($(".page-cabinet__header .header-button-bar__menu .button-menu__name").shouldHave(text("ООО \"АЛЬТ-ПРОФИ\"")).isDisplayed())
        {
            $(".header-button-bar__menu .icon_name_arrow-down").click();
            $$(".header-popup-menu .organizations__item .item-button__text").get(0).click();

            $(".header-button-bar__menu .icon_name_arrow-down").click();
            $(".header-popup-menu__item-button .icon_name_logout").click();
        }
       // $(".header-button-bar__menu .icon_name_arrow-down").click();
       // $$(".header-popup-menu .organizations__item").get(0).click();

      //  $(".header-button-bar__menu .icon_name_arrow-down").click();
      //  $(".header-popup-menu__item-button .icon_name_logout").click();

      //  $(".input_type_tel .input__control").setValue("74845838968").shouldBe(visible);
       // $(".input_type_password .input__control").setValue("kN2mBveyEGLp").shouldBe(visible);
      //  $(".button .button__content .button__text").click();

       // $(".header-button-bar__menu .icon_name_arrow-down").click();
     //   $$(".header-popup-menu .organizations__item").get(1).click();

       // $(".header-button-bar__menu .icon_name_arrow-down").click();
      //  $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step("Восстановление пароля")
    public void updatePassword() {
        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();

        $(".link-auth .btn-view-link").click();

        $(".phone-input .input__control").click();
        $(".phone-input .input__control").setValue("9609901525").shouldBe(visible);

        $(".button_view_extra .button__content").click();

        $(".input_type_text .input__control").click();
        $(".input_type_text .input__control").setValue("000000");

        $(".form-new-password__input-password .input_type_password .input__control").click();
        $(".form-new-password__input-password .input_type_password .input__control").setValue("WK9x650x");

        $$(".form-field_size_m .input_type_password .input__control").get(1).click();
        $$(".form-field_size_m .input_type_password .input__control").get(1).setValue("WK9x650x");

        $(".button_view_extra .button__content").click();
        $(".form-success__title").shouldHave(text("Пароль сохранён"));
        $(".btn-mobile .button__content").click();
        $(".page-cabinet__content .contract-statistics__header .contract-statistics__title").shouldHave(text("Все договоры"));
    }

    @Step("Переключение по вкладкам")
    public void changeTabs() {
        $(byText("История платежей")).click();
        $(byText("У вас нет оплаченных платежей за выбранный период. Возможно, вы еще не оплатили.")).shouldBe(visible);
        $(byText("График платежей")).click();
        $(byText("Ежемесячный платёж")).shouldBe(visible);
        $(byText("Документы")).click();
        $(byText("Скан-копии документов по договорам")).shouldBe(visible);
        $(byText("Счета на оплату")).click();
        $(byText("Данные об оплате обновляются после 14:00")).shouldBe(visible);
    }
}
