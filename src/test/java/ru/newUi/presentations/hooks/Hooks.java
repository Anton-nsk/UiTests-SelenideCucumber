package ru.newUi.presentations.hooks;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterAll;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public final class Hooks {

    @Step("Запуск браузера. Открываем URL")
    public static void open(String url) {
        Selenide.open(url);
    }

    @After
    @Step("Убиваем браузер")
    public static void stopTests() {
        getWebDriver().close();
    }
}
