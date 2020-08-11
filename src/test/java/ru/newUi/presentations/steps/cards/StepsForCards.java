package ru.newUi.presentations.steps.cards;

import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Тогда;
import ru.newUi.presentations.actions.cards.SearchCardsActions;

public class StepsForCards extends SearchCardsActions {

    @Тогда("Ищем карту принадлежащую \"([^\"]*)\"")
    public static void searchCardsByLastName(String lastName) {
        searchCard(lastName);
        checkVisibleTableResults();
    }

    @Тогда("Ищем карту c номером \"([^\"]*)\"")
    public static void searchCardsByNumber(String numberCard) {
        searchCard(numberCard);
        checkVisibleBaseInformationCard();
    }
    @И("Проверяем, что карта найдена и отображается меню действий с картой")
    public static void checkBarActionsWithCardVisible(){

    }
}
