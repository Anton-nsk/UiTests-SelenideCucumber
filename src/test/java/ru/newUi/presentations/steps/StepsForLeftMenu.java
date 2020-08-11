package ru.newUi.presentations.steps;

import io.cucumber.java.ru.Тогда;

import static ru.newUi.presentations.actions.MenuActions.openNestedMenuLink;

public class StepsForLeftMenu {

    @Тогда("Открываем боковое меню и переходим в раздел \"([^\"]*)\"")
    public void openLinkMenu(String nameMenu) {
        openNestedMenuLink(nameMenu);
    }
}
