package ru.newUi.presentations.elementPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public interface StartPages {

    SelenideElement loginForm = $x("//*[@id = 'loginForm']");
    SelenideElement inputLogin = $x("//*[@id = 'nameInput']");
    SelenideElement inputPassword = $x("//*[@id = 'passwordInput']");
    SelenideElement btnLogin = $x("//*[@id = 'submitButton']");
}
