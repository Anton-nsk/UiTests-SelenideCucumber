package ru.newUi.presentations.actions;

import io.qameta.allure.Step;
import ru.newUi.presentations.elementPages.BasicPage;

import static com.codeborne.selenide.Condition.visible;

public final class MenuActions implements BasicPage {

    private MenuActions() {
    }

    @Step("Открываем боковое меню")
    public static void openLeftMenu() {
        btnMenu
                .shouldBe(visible)
                .click();
        navigationMenu.shouldBe(visible);
    }

    @Step("Открываем раздел")
    public static void openTopMenuLink(String topNameMenu) {
        BasicPage.topMenuItem(topNameMenu)
                .shouldBe(visible)
                .click();
    }

    @Step("Открываем пункт меню")
    public static void openNestedMenuLink(String nestedNameMenu) {
        openLeftMenu();
        switch (nestedNameMenu) {
            case "Поиск карт":
            case "Бонусные счета":
            case "Подарочные карты":
            case "Сегменты":
            case "Карты - не загружены в магазины":
                BasicPage.topMenuItem("Карты")
                        .shouldBe(visible)
                        .click();
                BasicPage.nestedMenuItem(nestedNameMenu)
                        .shouldBe(visible)
                        .click();
                break;
        }
    }
}
