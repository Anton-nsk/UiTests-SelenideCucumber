package ru.newUi.presentations.actions;

import io.qameta.allure.Step;
import ru.newUi.presentations.elementPages.StartPages;

import static com.codeborne.selenide.Condition.visible;

public final class LoginPageActions implements StartPages {

    private LoginPageActions() {
    }

    @Step("Проверка открытия страницы и логин")
    public static void loginSystem(String login, String password) {
        loginForm.shouldBe(visible);
        inputLogin.shouldBe(visible).sendKeys(login);
        inputPassword.shouldBe(visible).sendKeys(password);
        btnLogin.click();
    }
}
