package ru.newUi.presentations.actions.cards;

import io.qameta.allure.Step;
import ru.newUi.presentations.elementPages.cards.SearchCardsPage;

import static com.codeborne.selenide.Condition.visible;

public class SearchCardsActions implements SearchCardsPage {

    @Step("Открытие вкладки")
    public static void openTab(String nameTab) {
        SearchCardsPage.tabName(nameTab)
                .shouldBe(visible)
                .click();
    }

    @Step("Поиск карты по номеру или фамилии")
    public static void searchCard(String parameterSearch) {
        clearInputSearch();
        searchField
                .shouldBe(visible)
                .sendKeys(parameterSearch);
        searchField.pressEnter();
    }

    @Step("Проверяем, что появился список результатов поиска по фамилии")
    public static void checkVisibleTableResults() {
        tableResults.shouldBe(visible);
    }

    @Step("Проверяем, что появился результат поиска по номеру карты")
    public static void checkVisibleBaseInformationCard() {
        baseInformationForCard.shouldBe(visible);
    }

    @Step("Очищаем поле, если оно не пустое")
    public static void clearInputSearch() {
        String valueField = searchField.getValue();
        if (!valueField.isEmpty()) {
            btnClearField.isEnabled();
            btnClearField.click();
        }
    }
}
