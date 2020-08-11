package ru.newUi.presentations.elementPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public interface BasicPage {

    SelenideElement content = $x("//*[@id = 'content']//div[@id = 'pagesContainer']");
    SelenideElement btnMenu = $x("//*[@id = 'appBarLeftButton']");
    SelenideElement navigationMenu = $x("//*[@id = 'navigationMenuNavBar']");

    static SelenideElement topMenuItem(String nameMenu) {
        return $x("//div[@id = '" + MenuElements.getLink(nameMenu) + "']/div");
    }

    static SelenideElement nestedMenuItem(String nameMenu) {
        return $x("//div[@id = '" + MenuElements.getLink(nameMenu) + "']");
    }
}
