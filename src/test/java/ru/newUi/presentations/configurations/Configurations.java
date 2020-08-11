package ru.newUi.presentations.configurations;

import io.cucumber.java.Before;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Configuration.browserSize;

public final class Configurations {

    public static final String PRODUCTION_URL = "http://172.29.17.205:8090";

    @Before/*(order = 1)*/
    @Step("Устанавливаем параметры браузера")
    public static void browserConfigurations() {
        browser = CHROME;
        browserSize = "1920x1080";
    }
}
