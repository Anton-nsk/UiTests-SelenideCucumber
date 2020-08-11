package ru.newUi.presentations.steps;

import io.cucumber.java.ru.Дано;
import io.qameta.allure.Step;

import static ru.newUi.presentations.actions.LoginPageActions.loginSystem;
import static ru.newUi.presentations.configurations.Configurations.PRODUCTION_URL;
import static ru.newUi.presentations.hooks.Hooks.open;

public class StepsForLoginPage {

    @Step("Логинимся на Centrum")
    @Дано("Логинимся на Centrum с логином: \"([^\"]*)\" и паролем: \"([^\"]*)\"")
    public void loginCentrum(String login, String password) {
        open(PRODUCTION_URL);
        loginSystem(login, password);
    }
}
