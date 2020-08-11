package ru.newUi.presentations.elementPages.cards;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public interface SearchCardsPage {

    SelenideElement searchField = $x("//*[@id = 'filterInput']");
    SelenideElement tableResults = $x("//*[@id = 'BaseTableContainer']");
    SelenideElement baseInformationForCard = $x("//*[@id = 'commonInformation']");
    SelenideElement btnClearField = $x("//*[@id = 'filterInputClearButton']");

    static SelenideElement tabName(String nameTab) {
        return $x("//button/span[contains(text(), '" + nameTab + "')]");
    }
}
