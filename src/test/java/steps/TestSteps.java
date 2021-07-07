package steps;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
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

    @Step ("Скачивание пени с обзорной страницы")
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

    @Step("Негативные сценарии авторизации")
    public void negativeAuthorization() {
        $(".input_type_tel .input__control").setValue("906830005");
        $(".input_type_password .input__control").setValue("kN2mBveyEGLp");
        $(".button .button__content .button__text").click();
        $(byText("Неправильный номер телефона или пароль")).shouldBe(visible);
        Selenide.refresh();

        $(".input_type_tel .input__control").setValue("9068300056");
        $(".input_type_password .input__control").setValue("kN2mBveyEGLp");
        $(".button .button__content .button__text").click();
        $(byText("Неправильный номер телефона или пароль")).shouldBe(visible);
        Selenide.refresh();

        $(".input_type_tel .input__control").setValue("9068300055");
        $(".input_type_password .input__control").setValue("kN2mBveyEGL");
        $(".button .button__content .button__text").click();
        $(byText("Неправильный номер телефона или пароль")).shouldBe(visible);
        Selenide.refresh();

        $(".input_type_tel .input__control").setValue("9068300055");
        $(".input_type_password .input__control").setValue("kN3mBveyEGLp");
        $(".button .button__content .button__text").click();
        $(byText("Неправильный номер телефона или пароль")).shouldBe(visible);
        Selenide.refresh();

        $(".input_type_tel .input__control").setValue("9068300055");
        $(".input_type_password .input__control").setValue(" kN2mBveyEGLp");
        $(".button .button__content .button__text").click();
        $(byText("Неправильный номер телефона или пароль")).shouldBe(visible);
        Selenide.refresh();

        $(".input_type_tel .input__control").setValue("9068300055");
        $(".input_type_password .input__control").setValue("kN2mBveyEGLp ");
        $(".button .button__content .button__text").click();
        $(byText("Неправильный номер телефона или пароль")).shouldBe(visible);
        Selenide.refresh();
    }

    @Step("Скачивание пени из договора")
    public void downloadPenaltyFromContractTest() {
        $x("//*[contains(text(), 'HYUNDAI Solaris')]").click();
        $(".contract-statistics__subtitle").shouldHave(text("Т333ЕК56 / 19874-ОРБ-19-Л от 18.11.2019"));
        $(".payment-group-line__icon").click();
        $x("//*[contains(text(), 'Скачать')]").click();
        $(".notification__title").click();
        $(".notification_visible .notification__closer").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step("Скачивание счета на оплату")
    public void downloadDocument() {
        $(byText("Документы")).click();
        $(byText("Скан-копии документов по договорам")).shouldBe(visible);
        $(".document-group-line").click();
        $x("//*[contains(text(), 'Скачать')]").click();
        $(".notification__title").click();
        $(".notification_visible .notification__closer").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step("Скачивание счета на оплату из договора")
    public void downloadDocumentFromContract() {
        $x("//*[contains(text(), 'HYUNDAI Solaris')]").click();
        $(".contract-statistics__subtitle").shouldHave(text("Т333ЕК56 / 19874-ОРБ-19-Л от 18.11.2019"));
        $(byText("Документы")).click();
        $(byText("Скан-копии документов по договору")).shouldBe(visible);
        $(".document-group-line").click();
        $x("//*[contains(text(), 'Скачать')]").click();
        $(".notification__title").click();
        $(".notification_visible .notification__closer").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step("Заявка на реструктуризацию")
    public void request1() {
        $(".button-send-request").click();
        Selenide.switchTo().window("Запросы | Альфа-лизинг");
       // $x("//*[contains(text(), 'Создать новый')]").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).shouldBe(visible);
        $(".select-button__content").click();
        $(".menu-item__control:nth-child(1)").click();
        $(".select-contracts__field").click();
        $(".item:nth-child(3)").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).click();
        $x("//*[contains(text(), 'Продолжить')]").click();
        $(byAttribute("value","Дриневская  Юлия Юрьевна")).shouldBe(visible);
        $(byAttribute("value","Директор")).shouldBe(visible);
        $(byAttribute("value","vaguz@alfaleasing.ru")).shouldBe(visible);
        $(byAttribute("value","+7 (960) 990-15-25")).shouldBe(visible);
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(byText("Для быстрого рассмотрения, пожалуйста, загрузите следующие документы")).shouldBe(visible);
        $("#certificateBank").uploadFromClasspath("readme.txt");

        $(".textarea__inner .textarea__control").click();
        $(".textarea__inner .textarea__control").setValue("Заявка на реструктуризацию создана автотестом");
        $(byText("Падение курса рубля")).click();
        $(byText("Не наблюдается, снижение выручки не ожидается")).click();
        $(byText("Выручки хватает для исполнения обязательств")).click();
        $(byText("По договорам / поставкам / услугам 2019 года или ранее")).click();
        $(byText("Задержки оплаты от контрагентов")).click();
        $(".textarea__inner .textarea__control", 1).click();
        $(".textarea__inner .textarea__control", 1).setValue("Заявка на реструктуризацию создана автотестом");
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(byText("Каникулы по уплате основного долга на 3 месяца. В течение трех месяцев вы будете уплачивать только проценты по договору лизинга")).click();
        $(byText("Часть платежей, которая не была уплачена в течение каникул, будет равномерно распределена в течение оставшегося срока лизинга и добавлена к лизинговым платежам")).click();
        $(".textarea__inner .textarea__control").click();
        $(".textarea__inner .textarea__control").setValue("Заявка на реструктуризацию создана автотестом");
        $x("//*[contains(text(), 'Отправить запрос')]").click();

        $x("//*[contains(text(), 'Запрос отправлен')]").shouldBe(visible);
        $x("//*[contains(text(), 'Вернуться в личный кабинет')]").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step("Справка")
    public void request2() {
        $(".button-send-request").click();
        Selenide.switchTo().window("Запросы | Альфа-лизинг");
        //$x("//*[contains(text(), 'Создать новый')]").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).shouldBe(visible);
        $(".select-button__content").click();
        $(".menu-item:nth-child(2)").click();
        $(".select-contracts__field").click();
        $(".item:nth-child(3)").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).click();
        $x("//*[contains(text(), 'Продолжить')]").click();
        $(byAttribute("value","Дриневская  Юлия Юрьевна")).shouldBe(visible);
        $(byAttribute("value","Директор")).shouldBe(visible);
        $(byAttribute("value","vaguz@alfaleasing.ru")).shouldBe(visible);
        $(byAttribute("value","+7 (960) 990-15-25")).shouldBe(visible);
        $x("//*[contains(text(), 'Продолжить')]").click();

        $x("//*[contains(text(), 'ООО «Альфамобиль»')]").click();
        $(byText("Справка об отсутствии задолженности (кредитной дисциплине / остатке лизинговых платежей)")).click();
        $(".input__inner .input__control").click();
        $(".input__inner .input__control").setValue("22.06.2021");
        $(".radio_size_m", 7).click();
        $(".input__inner .input__control", 1).click();
        $(".input__inner .input__control", 1).setValue("Moscow");
        $x("//*[contains(text(), 'Отправить запрос')]").click();

        $x("//*[contains(text(), 'Запрос отправлен')]").shouldBe(visible);
        $x("//*[contains(text(), 'Вернуться в личный кабинет')]").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step("Изменение реквизитов")
    public void request3() {
        $(".button-send-request").click();
        Selenide.switchTo().window("Запросы | Альфа-лизинг");
       // $x("//*[contains(text(), 'Создать новый')]").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).shouldBe(visible);
        $(".select-button__content").click();
        $(".menu-item:nth-child(3)").click();
        $(".select-contracts__field").click();
        $(".item:nth-child(3)").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).click();
        $x("//*[contains(text(), 'Продолжить')]").click();
        $(byAttribute("value","Дриневская  Юлия Юрьевна")).shouldBe(visible);
        $(byAttribute("value","Директор")).shouldBe(visible);
        $(byAttribute("value","vaguz@alfaleasing.ru")).shouldBe(visible);
        $(byAttribute("value","+7 (960) 990-15-25")).shouldBe(visible);
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(".radio_size_m", 1).click();
        $(".radio_size_m", 3).click();
        $(".radio_size_m", 5).click();
        $(".radio_size_m", 7).click();
        $(".radio_size_m", 10).click();
        $(".textarea__inner .textarea__control").click();
        $(".textarea__inner .textarea__control").setValue("Запрос создан автотестом");
        $x("//*[contains(text(), 'Отправить запрос')]").click();

        $x("//*[contains(text(), 'Запрос отправлен')]").shouldBe(visible);
        $x("//*[contains(text(), 'Вернуться в личный кабинет')]").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step("Страхование")
    public void request4() {
        $(".button-send-request").click();
        Selenide.switchTo().window("Запросы | Альфа-лизинг");
        // $x("//*[contains(text(), 'Создать новый')]").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).shouldBe(visible);
        $(".select-button__content").click();
        $(".menu-item:nth-child(4)").click();
        $(".select-contracts__field").click();
        $(".item:nth-child(3)").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).click();
        $x("//*[contains(text(), 'Продолжить')]").click();
        $(byAttribute("value","Дриневская  Юлия Юрьевна")).shouldBe(visible);
        $(byAttribute("value","Директор")).shouldBe(visible);
        $(byAttribute("value","vaguz@alfaleasing.ru")).shouldBe(visible);
        $(byAttribute("value","+7 (960) 990-15-25")).shouldBe(visible);
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(".textarea__inner .textarea__control").click();
        $(".textarea__inner .textarea__control").setValue("Запрос создан автотестом");
        $x("//*[contains(text(), 'Отправить запрос')]").click();

        $x("//*[contains(text(), 'Запрос отправлен')]").shouldBe(visible);
        $x("//*[contains(text(), 'Вернуться в личный кабинет')]").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step("Пени")
    public void request5() {
        $(".button-send-request").click();
        Selenide.switchTo().window("Запросы | Альфа-лизинг");
        // $x("//*[contains(text(), 'Создать новый')]").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).shouldBe(visible);
        $(".select-button__content").click();
        $(".menu-item:nth-child(5)").click();
        $(".select-contracts__field").click();
        $(".item:nth-child(3)").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).click();
        $x("//*[contains(text(), 'Продолжить')]").click();
        $(byAttribute("value","Дриневская  Юлия Юрьевна")).shouldBe(visible);
        $(byAttribute("value","Директор")).shouldBe(visible);
        $(byAttribute("value","vaguz@alfaleasing.ru")).shouldBe(visible);
        $(byAttribute("value","+7 (960) 990-15-25")).shouldBe(visible);
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(".textarea__inner .textarea__control").click();
        $(".textarea__inner .textarea__control").setValue("Запрос создан автотестом");
        $x("//*[contains(text(), 'Отправить запрос')]").click();

        $x("//*[contains(text(), 'Запрос отправлен')]").shouldBe(visible);
        $x("//*[contains(text(), 'Вернуться в личный кабинет')]").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step("Временная выдача второго ключа зажигания")
    public void request6() {
        $(".button-send-request").click();
        Selenide.switchTo().window("Запросы | Альфа-лизинг");
        // $x("//*[contains(text(), 'Создать новый')]").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).shouldBe(visible);
        $(".select-button__content").click();
        $(".menu-item:nth-child(6)").click();
        $(".select-contracts__field").click();
        $(".item:nth-child(3)").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).click();
        $x("//*[contains(text(), 'Продолжить')]").click();
        $(byAttribute("value","Дриневская  Юлия Юрьевна")).shouldBe(visible);
        $(byAttribute("value","Директор")).shouldBe(visible);
        $(byAttribute("value","vaguz@alfaleasing.ru")).shouldBe(visible);
        $(byAttribute("value","+7 (960) 990-15-25")).shouldBe(visible);
        $x("//*[contains(text(), 'Да')]").click();
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(".textarea__inner .textarea__control").click();
        $(".textarea__inner .textarea__control").setValue("Запрос создан автотестом");
        $x("//*[contains(text(), 'Отправить запрос')]").click();

        $x("//*[contains(text(), 'Запрос отправлен')]").shouldBe(visible);
        $x("//*[contains(text(), 'Вернуться в личный кабинет')]").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step("Временная выдача ПТС")
    public void request7() {
        $(".button-send-request").click();
        Selenide.switchTo().window("Запросы | Альфа-лизинг");
        // $x("//*[contains(text(), 'Создать новый')]").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).shouldBe(visible);
        $(".select-button__content").click();
        $(".menu-item:nth-child(7)").click();
        $(".select-contracts__field").click();
        $(".item:nth-child(3)").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).click();
        $x("//*[contains(text(), 'Продолжить')]").click();
        $(byAttribute("value","Дриневская  Юлия Юрьевна")).shouldBe(visible);
        $(byAttribute("value","Директор")).shouldBe(visible);
        $(byAttribute("value","vaguz@alfaleasing.ru")).shouldBe(visible);
        $(byAttribute("value","+7 (960) 990-15-25")).shouldBe(visible);
        $x("//*[contains(text(), 'Да')]").click();
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(".textarea__inner .textarea__control").click();
        $(".textarea__inner .textarea__control").setValue("Запрос создан автотестом");
        $x("//*[contains(text(), 'Отправить запрос')]").click();

        $x("//*[contains(text(), 'Запрос отправлен')]").shouldBe(visible);
        $x("//*[contains(text(), 'Вернуться в личный кабинет')]").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step("Досрочный/плановый выкуп")
    public void request8() {
        $(".button-send-request").click();
        Selenide.switchTo().window("Запросы | Альфа-лизинг");
        // $x("//*[contains(text(), 'Создать новый')]").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).shouldBe(visible);
        $(".select-button__content").click();
        $(".menu-item:nth-child(8)").click();
        $(".select-contracts__field").click();
        $(".item:nth-child(3)").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).click();
        $x("//*[contains(text(), 'Продолжить')]").click();
        $(byAttribute("value","Дриневская  Юлия Юрьевна")).shouldBe(visible);
        $(byAttribute("value","Директор")).shouldBe(visible);
        $(byAttribute("value","vaguz@alfaleasing.ru")).shouldBe(visible);
        $(byAttribute("value","+7 (960) 990-15-25")).shouldBe(visible);

        $x("//*[contains(text(), 'Отправить запрос')]").click();

        $x("//*[contains(text(), 'Запрос отправлен')]").shouldBe(visible);
        $x("//*[contains(text(), 'Вернуться в личный кабинет')]").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step("Страховой случай")
    public void request9() {
        $(".button-send-request").click();
        Selenide.switchTo().window("Запросы | Альфа-лизинг");
        // $x("//*[contains(text(), 'Создать новый')]").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).shouldBe(visible);
        $(".select-button__content").click();
        $(".menu-item:nth-child(9)").click();
        $(".select-contracts__field").click();
        $(".item:nth-child(3)").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).click();
        $x("//*[contains(text(), 'Продолжить')]").click();
        $(byAttribute("value","Дриневская  Юлия Юрьевна")).shouldBe(visible);
        $(byAttribute("value","Директор")).shouldBe(visible);
        $(byAttribute("value","vaguz@alfaleasing.ru")).shouldBe(visible);
        $(byAttribute("value","+7 (960) 990-15-25")).shouldBe(visible);
        $x("//*[contains(text(), 'Продолжить')]").click();
        $(".input__box .input__control").setValue("05.07.2021");
        $x("//*[contains(text(), 'Хищение (угон, кража)')]").click();
        $x("//*[contains(text(), 'Нет')]").click();
        $x("//*[contains(text(), 'Продолжить')]").click();
        $(".input__box .input__control", 0).setValue("12345678");
        $(".input__box .input__control", 1).setValue("87654321");
        $(".input__box .input__control", 2).setValue("нет");
        $x("//*[contains(text(), 'Не нужна')]").click();
        $x("//*[contains(text(), 'Ремонт')]").click();

        $x("//*[contains(text(), 'Отправить запрос')]").click();

        $x("//*[contains(text(), 'Запрос отправлен')]").shouldBe(visible);
        $x("//*[contains(text(), 'Вернуться в личный кабинет')]").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step("Цессия")
    public void request10() {
        $(".button-send-request").click();
        Selenide.switchTo().window("Запросы | Альфа-лизинг");
         //$x("//*[contains(text(), 'Создать новый')]").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).shouldBe(visible);
        $(".select-button__content").click();
        $(".menu-item:nth-child(10)").click();
        $(".select-contracts__field").click();
        $(".item:nth-child(3)").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).click();
        $x("//*[contains(text(), 'Продолжить')]").click();
        $(byAttribute("value","Дриневская  Юлия Юрьевна")).shouldBe(visible);
        $(byAttribute("value","Директор")).shouldBe(visible);
        $(byAttribute("value","vaguz@alfaleasing.ru")).shouldBe(visible);
        $(byAttribute("value","+7 (960) 990-15-25")).shouldBe(visible);
        $x("//*[contains(text(), 'Продолжить')]").click();
        $(byText("Копия паспорта генерального директора Цессионария и поручителей (все страницы)")).shouldBe(visible);
        $("#directorPassportCopy").uploadFromClasspath("Копия паспорта директора.txt");
        $(byText("Копия договора на аренду помещения (или свидетельство о собственности)")).shouldBe(visible);
        $("#rentalAgreementCopy").uploadFromClasspath("Копия договора на аренду.txt");
        $(byText("Карточка реквизитов контрагента")).shouldBe(visible);
        $("#contractorRequisitesCard").uploadFromClasspath("Карточка реквизитов КА.txt");
        $(byText("Протокол/решение о назначении генерального директора")).shouldBe(visible);
        $("#appointmentDirectorCopy").uploadFromClasspath("Копия решения о назначении директора.txt");
        $(byText("Протокол собрания акционеров")).shouldBe(visible);
        $("#shareholderDecisionProtocol").uploadFromClasspath("Протокол собрания акционеров.txt");
        $(byText("Копия 3-х договоров с ключевыми заказчиками/покупателями")).shouldBe(visible);
        $("#existingContractsKeyCustomersCopy").uploadFromClasspath("Копия трех договоров.txt");
        $(byText("Бухгалтерский баланс и отчет о финансовых результатах за последний отчетный период")).shouldBe(visible);
        $("#existingContractsKeyCustomersCopy").uploadFromClasspath("Бухгалтерская отчетность за последний отчетный период.txt");
        $(byText("Бухгалтерский баланс и отчет о финансовых результатах за последний год")).shouldBe(visible);
        $("#financialStatementsYearF12ReceiptIfns").uploadFromClasspath("Бухгалтерская отчетность за последний отчетный год.txt");
        $(byText("Налоговая декларация по налогу на прибыль за последнюю отчетную дату")).shouldBe(visible);
        $("#taxReturnIncomeDateReceiptIfns").uploadFromClasspath("Налоговая декларация по налогу на прибыль на последнюю отчетную дату.txt");
        $(byText("Справка из обслуживающего банка по расчетным счетам за 12 месяцев")).shouldBe(visible);
        $("#clientBankTxt").uploadFromClasspath("Справка из обслуживающего банка.txt");
        $(byText("Анализ счета 51 за последние 12 месяцев с разбивкой кор. счета 51 и 62 и банкам")).shouldBe(visible);
        $("#51Ammount12monthsExcel").uploadFromClasspath("Анализ счета 51.txt");
        $(byText("Выписка из интернет-банка в формате Export to 1C по всем счетам и по всем направлениям бизнеса за последние 12 месяцев")).shouldBe(visible);
        $("#certificateBank").uploadFromClasspath("Выгрузка из системы Клиент-банк.txt");
        $(byText("Свидетельство о государственной регистрации юридического лица")).shouldBe(visible);
        $("#copyOfRegistrationBusiness").uploadFromClasspath("Свидетельство о гос регистрации ЮЛ.txt");
        $(byText("Копия действующего устава и все внесенные в него изменения")).shouldBe(visible);
        $("#charterCopy").uploadFromClasspath("Копия устава с изменениями.txt");
        $(byText("Штамп входящего контроля ФНС / копия описи вложения при отправке почтой / протокол приема файла ФНС при отправке через интернет (для декларации по налогу на прибыль и бухгалтерского баланса и отчета о финансовых результатах)")).shouldBe(visible);
        $("#certificateFnsStateSettlements").uploadFromClasspath("Штамп входящего контроля ФНС.txt");
        $(byText("Анкета ЮЛ (цессионарий)")).shouldBe(visible);
        $("#ulProfileTransferee").uploadFromClasspath("Анкета ЮЛ цессионарий.xlsm");
        $(byText("Анкета ЮЛ (цедент - поручитель). Цедент – предыдущий Лизингополучатель")).shouldBe(visible);
        $("#ulProfile").uploadFromClasspath("Анкета ЮЛ цедент.xlsm");
        $(byText("Анкета ЕИО (цессионарий)")).shouldBe(visible);
        $("#eioProfileTransferee").uploadFromClasspath("Анкета ЕИО цессионарий.xlsm");
        $(byText("Анкета ЕИО (цедент - поручитель)")).shouldBe(visible);
        $("#eioProfile").uploadFromClasspath("Анкета ЕИО цедент.xlsm");
        $(byText("Анкета ФЛ (собственник цессионария - поручитель)")).shouldBe(visible);
        $("#flProfile").uploadFromClasspath("Анкета ФЛ.xlsm");

        $x("//*[contains(text(), 'Продолжить')]").click();
        $(".textarea__inner .textarea__control").click();
        $(".textarea__inner .textarea__control").setValue("Причины необходимости замены Лизингополучателя");

        $(".input__box .input__control", 0).setValue("1655297756");
        $(".input__box .input__control", 1).setValue("044525593");
        $(".input__box .input__control", 2).setValue("АО \"АЛЬФА-БАНК\" г. Москва");
        $(".input__box .input__control", 3).setValue("30101810200000000593");
        $(".input__box .input__control", 4).setValue("40702810402750001774");
        $(".input__box .input__control", 5).setValue("165501001");
        $(".input__box .input__control", 6).setValue("г. Москва");
        $(".input__box .input__control", 7).setValue("Дриневская  Юлия Юрьевна");
        $(".input__box .input__control", 8).setValue("+7 (960) 990-15-25");

        $x("//*[contains(text(), 'Отправить запрос')]").click();

        $x("//*[contains(text(), 'Запрос отправлен')]").shouldBe(visible);
        $x("//*[contains(text(), 'Вернуться в личный кабинет')]").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step("Цессия с выкупом")
    public void request11() {
        $(".button-send-request").click();
        Selenide.switchTo().window("Запросы | Альфа-лизинг");
        //$x("//*[contains(text(), 'Создать новый')]").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).shouldBe(visible);
        $(".select-button__content").click();
        $(".menu-item:nth-child(11)").click();
        $(".select-contracts__field").click();
        $(".item:nth-child(3)").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).click();
        $x("//*[contains(text(), 'Продолжить')]").click();
        $(byAttribute("value","Дриневская  Юлия Юрьевна")).shouldBe(visible);
        $(byAttribute("value","Директор")).shouldBe(visible);
        $(byAttribute("value","vaguz@alfaleasing.ru")).shouldBe(visible);
        $(byAttribute("value","+7 (960) 990-15-25")).shouldBe(visible);
        $x("//*[contains(text(), 'Продолжить')]").click();
        $(".radio_size_m", 2).click();
        $(byText("Копия паспорта ИП (все страницы)")).shouldBe(visible);
        $("#ipPassportCopy").uploadFromClasspath("Анкета ФЛ.xlsm");
        $(byText("Анкета индивидуального предпринимателя")).shouldBe(visible);
        $("#ipProfile").uploadFromClasspath("Анкета ИП.xlsm");

       // $x("//*[contains(text(), 'Продолжить')]").click();

        $(".template-editor__button-continue").click();

        $(".input__box .input__control", 0).setValue("06.07.2021");
        $(".textarea__inner .textarea__control").click();
        $(".textarea__inner .textarea__control").setValue("Причины необходимости замены");
        $(".input__box .input__control", 1).setValue("1655297756");
        $(".input__box .input__control", 2).setValue("044525593");
        $(".input__box .input__control", 3).setValue("АО \"АЛЬФА-БАНК\" г. Москва");
        $(".input__box .input__control", 4).setValue("30101810200000000593");
        $(".input__box .input__control", 5).setValue("40702810402750001774");
        $(".input__box .input__control", 6).setValue("г. Москва");

        $x("//*[contains(text(), 'Отправить запрос')]").click();

        $x("//*[contains(text(), 'Запрос отправлен')]").shouldBe(visible);
        $x("//*[contains(text(), 'Вернуться в личный кабинет')]").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();

    }

    @Step("ЭДО")
    public void request12() {
        $(".button-send-request").click();
        Selenide.switchTo().window("Запросы | Альфа-лизинг");
        //$x("//*[contains(text(), 'Создать новый')]").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).shouldBe(visible);
        $(".select-button__content").click();
        $(".menu-item:nth-child(12)").click();
        $(".select-contracts__field").click();
        $(".item:nth-child(3)").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).click();
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(byAttribute("value","Дриневская  Юлия Юрьевна")).shouldBe(visible);
        $(byAttribute("value","Директор")).shouldBe(visible);
        $(byAttribute("value","vaguz@alfaleasing.ru")).shouldBe(visible);
        $(byAttribute("value","+7 (960) 990-15-25")).shouldBe(visible);
        $x("//*[contains(text(), 'Продолжить')]").click();

        $x("//*[contains(text(), 'Иное')]").click();
        $(".textarea__inner .textarea__control").click();
        $(".textarea__inner .textarea__control").setValue("Запрос");

        $x("//*[contains(text(), 'Отправить запрос')]").click();

        $x("//*[contains(text(), 'Запрос отправлен')]").shouldBe(visible);
        $x("//*[contains(text(), 'Вернуться в личный кабинет')]").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step("Выезд за границу")
    public void request13() {
        $(".button-send-request").click();
        Selenide.switchTo().window("Запросы | Альфа-лизинг");
        //$x("//*[contains(text(), 'Создать новый')]").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).shouldBe(visible);
        $(".select-button__content").click();
        $(".menu-item:nth-child(13)").click();
        $(".select-contracts__field").click();
        $(".item:nth-child(3)").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).click();
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(byAttribute("value","Дриневская  Юлия Юрьевна")).shouldBe(visible);
        $(byAttribute("value","Директор")).shouldBe(visible);
        $(byAttribute("value","vaguz@alfaleasing.ru")).shouldBe(visible);
        $(byAttribute("value","+7 (960) 990-15-25")).shouldBe(visible);
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(".textarea__inner .textarea__control",0).click();
        $(".textarea__inner .textarea__control",0).setValue("Германия");
        $(".input__box .input__control", 0).setValue("06.07.2021");
        $(".input__box .input__control", 1).setValue("06.07.2022");
        $(".textarea__inner .textarea__control",1).click();
        $(".textarea__inner .textarea__control",1).setValue("Причина выезда");

        $x("//*[contains(text(), 'Отправить запрос')]").click();

        $x("//*[contains(text(), 'Запрос отправлен')]").shouldBe(visible);
        $x("//*[contains(text(), 'Вернуться в личный кабинет')]").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step("Установка дополнительного оборудования")
    public void request14() {
        $(".button-send-request").click();
        Selenide.switchTo().window("Запросы | Альфа-лизинг");
       // $x("//*[contains(text(), 'Создать новый')]").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).shouldBe(visible);
        $(".select-button__content").click();
        $(".menu-item:nth-child(14)").click();
        $(".select-contracts__field").click();
        $(".item:nth-child(3)").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).click();
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(byAttribute("value","Дриневская  Юлия Юрьевна")).shouldBe(visible);
        $(byAttribute("value","Директор")).shouldBe(visible);
        $(byAttribute("value","vaguz@alfaleasing.ru")).shouldBe(visible);
        $(byAttribute("value","+7 (960) 990-15-25")).shouldBe(visible);
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(".textarea__inner .textarea__control").click();
        $(".textarea__inner .textarea__control").setValue("Описание дополнительного оборудования");

        $x("//*[contains(text(), 'Отправить запрос')]").click();

        $x("//*[contains(text(), 'Запрос отправлен')]").shouldBe(visible);
        $x("//*[contains(text(), 'Вернуться в личный кабинет')]").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step("Сублизинг/аренда с экипажем")
    public void request15() {
        $(".button-send-request").click();
        Selenide.switchTo().window("Запросы | Альфа-лизинг");
        // $x("//*[contains(text(), 'Создать новый')]").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).shouldBe(visible);
        $(".select-button__content").click();
        $(".menu-item:nth-child(15)").click();
        $(".select-contracts__field").click();
        $(".item:nth-child(3)").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).click();
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(byAttribute("value","Дриневская  Юлия Юрьевна")).shouldBe(visible);
        $(byAttribute("value","Директор")).shouldBe(visible);
        $(byAttribute("value","vaguz@alfaleasing.ru")).shouldBe(visible);
        $(byAttribute("value","+7 (960) 990-15-25")).shouldBe(visible);
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(byText("Копия паспорта генерального директора Цессионария и поручителей (все страницы)")).shouldBe(visible);
        $("#directorPassportCopy").uploadFromClasspath("Копия паспорта директора.txt");
        $(byText("Карточка реквизитов контрагента")).shouldBe(visible);
        $("#contractorRequisitesCard").uploadFromClasspath("Карточка реквизитов КА.txt");
        $(byText("Свидетельство о государственной регистрации юридического лица")).shouldBe(visible);
        $("#copyOfRegistrationBusiness").uploadFromClasspath("Свидетельство о гос регистрации ЮЛ.txt");
        $(byText("Протокол/решение о назначении генерального директора")).shouldBe(visible);
        $("#appointmentDirectorCopy").uploadFromClasspath("Копия решения о назначении директора.txt");
        $(byText("Анкета ЮЛ")).shouldBe(visible);
        $("#ulProfile").uploadFromClasspath("Анкета ЮЛ цедент.xlsm");
        $(byText("Анкета ЕИО")).shouldBe(visible);
        $("#eioProfileTransferee").uploadFromClasspath("Анкета ЕИО цессионарий.xlsm");

        $(".textarea__inner .textarea__control").click();
        $(".textarea__inner .textarea__control").setValue("Укажите причину субаренды");
        $(".input__box .input__control", 0).setValue("06.07.2021");
        $(".input__box .input__control", 1).setValue("06.07.2022");
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(".input__box .input__control", 0).setValue("ИП Дриневская Юлия Юрьевна");
        $(".input__box .input__control", 1).setValue("1655297756");
        $(".input__box .input__control", 2).setValue("044525593");
        $(".input__box .input__control", 3).setValue("АО \"АЛЬФА-БАНК\" г. Москва");
        $(".input__box .input__control", 4).setValue("30101810200000000593");
        $(".input__box .input__control", 5).setValue("40702810402750001774");
        $(".input__box .input__control", 6).setValue("165501001");
        $(".input__box .input__control", 7).setValue("г. Москва");
        $(".input__box .input__control", 8).setValue("Дриневская  Юлия Юрьевна");
        $(".input__box .input__control", 9).setValue("+7 (960) 990-15-25");
        $(".input__box .input__control", 10).setValue("г. Москва");
        $(".textarea__inner .textarea__control").click();
        $(".textarea__inner .textarea__control").setValue("Цель использования предмета лизинга");

        $x("//*[contains(text(), 'Отправить запрос')]").click();

        $x("//*[contains(text(), 'Запрос отправлен')]").shouldBe(visible);
        $x("//*[contains(text(), 'Вернуться в личный кабинет')]").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step("Счёт-фактура/ОС-1/ИНВ-1")
    public void request16() {
        $(".button-send-request").click();
        Selenide.switchTo().window("Запросы | Альфа-лизинг");
        // $x("//*[contains(text(), 'Создать новый')]").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).shouldBe(visible);
        $(".select-button__content").click();
        $(".menu-item:nth-child(16)").click();
        $(".select-contracts__field").click();
        $(".item:nth-child(3)").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).click();
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(byAttribute("value","Дриневская  Юлия Юрьевна")).shouldBe(visible);
        $(byAttribute("value","Директор")).shouldBe(visible);
        $(byAttribute("value","vaguz@alfaleasing.ru")).shouldBe(visible);
        $(byAttribute("value","+7 (960) 990-15-25")).shouldBe(visible);
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(".radio_size_m", 2).click();
        $(".textarea__inner .textarea__control").click();
        $(".textarea__inner .textarea__control").setValue("Описание запроса");

        $x("//*[contains(text(), 'Отправить запрос')]").click();

        $x("//*[contains(text(), 'Запрос отправлен')]").shouldBe(visible);
        $x("//*[contains(text(), 'Вернуться в личный кабинет')]").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step("Акт сверки")
    public void request17() {
        $(".button-send-request").click();
        Selenide.switchTo().window("Запросы | Альфа-лизинг");
        // $x("//*[contains(text(), 'Создать новый')]").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).shouldBe(visible);
        $(".select-button__content").click();
        $(".menu-item:nth-child(17)").click();
        $(".select-contracts__field").click();
        $(".item:nth-child(3)").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).click();
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(byAttribute("value","Дриневская  Юлия Юрьевна")).shouldBe(visible);
        $(byAttribute("value","Директор")).shouldBe(visible);
        $(byAttribute("value","vaguz@alfaleasing.ru")).shouldBe(visible);
        $(byAttribute("value","+7 (960) 990-15-25")).shouldBe(visible);
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(".input__box .input__control", 0).setValue("06.07.2021");
        $(".input__box .input__control", 1).setValue("06.07.2022");
        $(".textarea__inner .textarea__control").click();
        $(".textarea__inner .textarea__control").setValue("Описание запроса");

        $x("//*[contains(text(), 'Отправить запрос')]").click();

        $x("//*[contains(text(), 'Запрос отправлен')]").shouldBe(visible);
        $x("//*[contains(text(), 'Вернуться в личный кабинет')]").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step("Счёт на оплату")
    public void request18() {
        $(".button-send-request").click();
        Selenide.switchTo().window("Запросы | Альфа-лизинг");
        // $x("//*[contains(text(), 'Создать новый')]").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).shouldBe(visible);
        $(".select-button__content").click();
        $(".menu-item:nth-child(18)").click();
        $(".select-contracts__field").click();
        $(".item:nth-child(3)").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).click();
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(byAttribute("value","Дриневская  Юлия Юрьевна")).shouldBe(visible);
        $(byAttribute("value","Директор")).shouldBe(visible);
        $(byAttribute("value","vaguz@alfaleasing.ru")).shouldBe(visible);
        $(byAttribute("value","+7 (960) 990-15-25")).shouldBe(visible);
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(".input__box .input__control", 0).setValue("06.07.2021");
        $(".input__box .input__control", 1).setValue("06.07.2022");
        $(".textarea__inner .textarea__control").click();
        $(".textarea__inner .textarea__control").setValue("Описание запроса");

        $x("//*[contains(text(), 'Отправить запрос')]").click();

        $x("//*[contains(text(), 'Запрос отправлен')]").shouldBe(visible);
        $x("//*[contains(text(), 'Вернуться в личный кабинет')]").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step("Предложение")
    public void request19() {
        $(".button-send-request").click();
        Selenide.switchTo().window("Запросы | Альфа-лизинг");
        // $x("//*[contains(text(), 'Создать новый')]").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).shouldBe(visible);
        $(".select-button__content").click();
        $(".menu-item:nth-child(19)").click();
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(byAttribute("value","Дриневская  Юлия Юрьевна")).shouldBe(visible);
        $(byAttribute("value","Директор")).shouldBe(visible);
        $(byAttribute("value","vaguz@alfaleasing.ru")).shouldBe(visible);
        $(byAttribute("value","+7 (960) 990-15-25")).shouldBe(visible);
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(".textarea__inner .textarea__control").click();
        $(".textarea__inner .textarea__control").setValue("Описание запроса");

        $x("//*[contains(text(), 'Отправить запрос')]").click();

        $x("//*[contains(text(), 'Запрос отправлен')]").shouldBe(visible);
        $x("//*[contains(text(), 'Вернуться в личный кабинет')]").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step("Жалоба")
    public void request20() {
        $(".button-send-request").click();
        Selenide.switchTo().window("Запросы | Альфа-лизинг");
        // $x("//*[contains(text(), 'Создать новый')]").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).shouldBe(visible);
        $(".select-button__content").click();
        $(".menu-item:nth-child(20)").click();
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(byAttribute("value","Дриневская  Юлия Юрьевна")).shouldBe(visible);
        $(byAttribute("value","Директор")).shouldBe(visible);
        $(byAttribute("value","vaguz@alfaleasing.ru")).shouldBe(visible);
        $(byAttribute("value","+7 (960) 990-15-25")).shouldBe(visible);
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(".textarea__inner .textarea__control").click();
        $(".textarea__inner .textarea__control").setValue("Описание запроса");

        $x("//*[contains(text(), 'Отправить запрос')]").click();

        $x("//*[contains(text(), 'Запрос отправлен')]").shouldBe(visible);
        $x("//*[contains(text(), 'Вернуться в личный кабинет')]").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step("Благодарность")
    public void request21() {
        $(".button-send-request").click();
        Selenide.switchTo().window("Запросы | Альфа-лизинг");
        // $x("//*[contains(text(), 'Создать новый')]").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).shouldBe(visible);
        $(".select-button__content").click();
        $(".menu-item:nth-child(21)").click();
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(byAttribute("value","Дриневская  Юлия Юрьевна")).shouldBe(visible);
        $(byAttribute("value","Директор")).shouldBe(visible);
        $(byAttribute("value","vaguz@alfaleasing.ru")).shouldBe(visible);
        $(byAttribute("value","+7 (960) 990-15-25")).shouldBe(visible);
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(".textarea__inner .textarea__control").click();
        $(".textarea__inner .textarea__control").setValue("Описание запроса");

        $x("//*[contains(text(), 'Отправить запрос')]").click();

        $x("//*[contains(text(), 'Запрос отправлен')]").shouldBe(visible);
        $x("//*[contains(text(), 'Вернуться в личный кабинет')]").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();

    }

    @Step("Иное")
    public void request22() {
        $(".button-send-request").click();
        Selenide.switchTo().window("Запросы | Альфа-лизинг");
        // $x("//*[contains(text(), 'Создать новый')]").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).shouldBe(visible);
        $(".select-button__content").click();
        $(".menu-item:nth-child(22)").click();
        $(".select-contracts__field").click();
        $(".item:nth-child(3)").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).click();
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(byAttribute("value","Дриневская  Юлия Юрьевна")).shouldBe(visible);
        $(byAttribute("value","Директор")).shouldBe(visible);
        $(byAttribute("value","vaguz@alfaleasing.ru")).shouldBe(visible);
        $(byAttribute("value","+7 (960) 990-15-25")).shouldBe(visible);
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(".textarea__inner .textarea__control").click();
        $(".textarea__inner .textarea__control").setValue("Описание запроса");

        $x("//*[contains(text(), 'Отправить запрос')]").click();

        $x("//*[contains(text(), 'Запрос отправлен')]").shouldBe(visible);
        $x("//*[contains(text(), 'Вернуться в личный кабинет')]").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step("Консультация по платежам")
    public void request23() {
        $(".button-send-request").click();
        Selenide.switchTo().window("Запросы | Альфа-лизинг");
        // $x("//*[contains(text(), 'Создать новый')]").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).shouldBe(visible);
        $(".select-button__content").click();
        $(".menu-item:nth-child(23)").click();
        $(".select-contracts__field").click();
        $(".item:nth-child(3)").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).click();
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(byAttribute("value","Дриневская  Юлия Юрьевна")).shouldBe(visible);
        $(byAttribute("value","Директор")).shouldBe(visible);
        $(byAttribute("value","vaguz@alfaleasing.ru")).shouldBe(visible);
        $(byAttribute("value","+7 (960) 990-15-25")).shouldBe(visible);
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(".textarea__inner .textarea__control").click();
        $(".textarea__inner .textarea__control").setValue("Описание запроса");

        $x("//*[contains(text(), 'Отправить запрос')]").click();

        $x("//*[contains(text(), 'Запрос отправлен')]").shouldBe(visible);
        $x("//*[contains(text(), 'Вернуться в личный кабинет')]").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step("Книга покупок и продаж")
    public void request24() {
        $(".button-send-request").click();
        Selenide.switchTo().window("Запросы | Альфа-лизинг");
        // $x("//*[contains(text(), 'Создать новый')]").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).shouldBe(visible);
        $(".select-button__content").click();
        $(".menu-item:nth-child(24)").click();
        $(".select-contracts__field").click();
        $(".item:nth-child(3)").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).click();
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(byAttribute("value","Дриневская  Юлия Юрьевна")).shouldBe(visible);
        $(byAttribute("value","Директор")).shouldBe(visible);
        $(byAttribute("value","vaguz@alfaleasing.ru")).shouldBe(visible);
        $(byAttribute("value","+7 (960) 990-15-25")).shouldBe(visible);
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(".input__box .input__control", 0).setValue("06.07.2021");
        $(".input__box .input__control", 1).setValue("06.07.2022");
        $(".textarea__inner .textarea__control").click();
        $(".textarea__inner .textarea__control").setValue("Описание запроса");

        $x("//*[contains(text(), 'Отправить запрос')]").click();

        $x("//*[contains(text(), 'Запрос отправлен')]").shouldBe(visible);
        $x("//*[contains(text(), 'Вернуться в личный кабинет')]").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step("Копия/дубликат договора/КАСКО/ПТС")
    public void request25() {
        $(".button-send-request").click();
        Selenide.switchTo().window("Запросы | Альфа-лизинг");
        // $x("//*[contains(text(), 'Создать новый')]").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).shouldBe(visible);
        $(".select-button__content").click();
        $(".menu-item:nth-child(25)").click();
        $(".select-contracts__field").click();
        $(".item:nth-child(3)").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).click();
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(byAttribute("value","Дриневская  Юлия Юрьевна")).shouldBe(visible);
        $(byAttribute("value","Директор")).shouldBe(visible);
        $(byAttribute("value","vaguz@alfaleasing.ru")).shouldBe(visible);
        $(byAttribute("value","+7 (960) 990-15-25")).shouldBe(visible);
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(".radio_size_m", 0).click();
        $(".textarea__inner .textarea__control").click();
        $(".textarea__inner .textarea__control").setValue("Описание запроса");

        $x("//*[contains(text(), 'Отправить запрос')]").click();

        $x("//*[contains(text(), 'Запрос отправлен')]").shouldBe(visible);
        $x("//*[contains(text(), 'Вернуться в личный кабинет')]").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step("Возврат денежных средств")
    public void request26() {
        $(".button-send-request").click();
        Selenide.switchTo().window("Запросы | Альфа-лизинг");
        // $x("//*[contains(text(), 'Создать новый')]").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).shouldBe(visible);
        $(".select-button__content").click();
        $(".menu-item:nth-child(26)").click();
        $(".select-contracts__field").click();
        $(".item:nth-child(3)").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).click();
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(byAttribute("value","Дриневская  Юлия Юрьевна")).shouldBe(visible);
        $(byAttribute("value","Директор")).shouldBe(visible);
        $(byAttribute("value","vaguz@alfaleasing.ru")).shouldBe(visible);
        $(byAttribute("value","+7 (960) 990-15-25")).shouldBe(visible);
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(byText("Заявление на возврат денежных средств")).shouldBe(visible);
        $("#zayavleniye").uploadFromClasspath("Анкета ЕИО цессионарий.xlsm");

        $x("//*[contains(text(), 'Отправить запрос')]").click();

        $x("//*[contains(text(), 'Запрос отправлен')]").shouldBe(visible);
        $x("//*[contains(text(), 'Вернуться в личный кабинет')]").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step("Зачет платежа")
    public void request27() {
        $(".button-send-request").click();
        Selenide.switchTo().window("Запросы | Альфа-лизинг");
         $x("//*[contains(text(), 'Создать новый')]").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).shouldBe(visible);
        $(".select-button__content").click();
        $(".menu-item:nth-child(27)").click();
        $(".select-contracts__field").click();
        $(".item:nth-child(3)").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).click();
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(byAttribute("value","Дриневская  Юлия Юрьевна")).shouldBe(visible);
        $(byAttribute("value","Директор")).shouldBe(visible);
        $(byAttribute("value","vaguz@alfaleasing.ru")).shouldBe(visible);
        $(byAttribute("value","+7 (960) 990-15-25")).shouldBe(visible);
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(byText("Заявление на зачет переплаты")).shouldBe(visible);
        $("#zayavleniye").uploadFromClasspath("Анкета ЕИО цессионарий.xlsm");

        $x("//*[contains(text(), 'Отправить запрос')]").click();

        $x("//*[contains(text(), 'Запрос отправлен')]").shouldBe(visible);
        $x("//*[contains(text(), 'Вернуться в личный кабинет')]").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }

    @Step("Заявка на лизинг")
    public void request28() {
        $(".button-send-request").click();
        Selenide.switchTo().window("Запросы | Альфа-лизинг");
        // $x("//*[contains(text(), 'Создать новый')]").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).shouldBe(visible);
        $(".select-button__content").click();
        $(".menu-item:nth-child(28)").click();
        $(".select-contracts__field").click();
        $(".item:nth-child(3)").click();
        $(byText("Выберите категорию запроса. Заполните дополнительные поля")).click();
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(byAttribute("value","Дриневская  Юлия Юрьевна")).shouldBe(visible);
        $(byAttribute("value","Директор")).shouldBe(visible);
        $(byAttribute("value","vaguz@alfaleasing.ru")).shouldBe(visible);
        $(byAttribute("value","+7 (960) 990-15-25")).shouldBe(visible);
        $x("//*[contains(text(), 'Продолжить')]").click();

        $(".textarea__inner .textarea__control").click();
        $(".textarea__inner .textarea__control").setValue("Описание запроса");

        $x("//*[contains(text(), 'Отправить запрос')]").click();

        $x("//*[contains(text(), 'Запрос отправлен')]").shouldBe(visible);
        $x("//*[contains(text(), 'Вернуться в личный кабинет')]").click();

        $(".header-button-bar__menu .icon_name_arrow-down").click();
        $(".header-popup-menu__item-button .icon_name_logout").click();
    }
}
