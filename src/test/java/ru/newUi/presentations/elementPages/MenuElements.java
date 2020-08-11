package ru.newUi.presentations.elementPages;

public enum MenuElements {
    productsNavLink("Товары"),
    productSearchNavLink("Поиск товаров"),

    shopsNavLink("Магазины"),
    topologyNavLink("Топлогия"),
    shopsSearchNavLink("Поиск магазинов"),
    productShelvesNavLink("Товарные полки"),

    staffNavLink("Персонал"),
    usersNavLink("Пользователи"),
    userRolesNavLink("Роли пользователей"),
    cashiersNavLink("Кассиры"),
    cashierRolesNavLink("Роли кассиров"),

    operdayNavLink("Операционный день"),
    operdayChecksSearchNavLink("Чеки"),
    operdayShiftsNavLink("Смены"),
    operdayTransactionsSearchNavLink("Банковские транзакции"),
    operdaySettingsNavLink("Настройки ОперДня"),

    reportsNavLink("Отчёты"),
    personalMotivationReportsNavLink("Отчёт 'Мотивация персонала'"),
    cashesOptimizationReportsNavLink("Отчёт 'оптимизация касс'"),
    shopWorkReportsNavLink("Отчёт 'Работа магазина'"),
    reportsByActionsAndDiscountsNavLink("Отчёты 'По акциям и скидкам'"),
    financialReportsNavLink("Отчёт 'Финансовые'"),
    otherReportsNavLink("Отчёт 'Прочие'"),

    priceTagsNavLink("Ценники"),
    priceTagTemplatesNavLink("Ценники Шаблоны"),
    priceTagSettingsNavLink("Ценники настройки"),

    cashesNavLink("Кассовый модуль"),
    cashDevicesNavLink("Кассовое оборудование"),
    cashTemplatesNavLink("Шаблоны касс"),
    checkFormsNavLink("Чековые формы"),
    paymentTypesNavLink("Типы оплат"),
    banksNavLink("Банки"),
    cashProductListsNavLink("Списки товаров"),
    notLoadedToShopsNavLink("КМ - не загружены в магазины"),

    scalesNavLink("Весовой модуль"),
    scalesDevicesNavLink("Весовое оборудование"),
    scalesTemplatesNavLink("Шаблоны весов"),

    loyaltyNavLink("Лояльность"),
    actions("Рекламные акции"),
    salesGroups("Группы продаж"),
    unloadedOnShops("Лояльность - не загружены в магазины"),
    loyaltyCoupons("Купоны"),
    settings("Лояльность - настройки"),

    cardsNavLink("Карты"),
    cardsSearch("Поиск карт"),
    bonusAccounts("Бонусные счета"),
    presentCards("Подарочные карты"),
    segmentsSearch("Сегменты"),
    unloadedOnShopss("Карты - не загружены в магазины"),

    otherNavLink("Справочники"),
    departmentsNavLink("Отделы"),
    productTypesNavLink("Типы товаров"),
    externalProcessingsNavLink("Внешние процессинги"),

    importExportNavLink("Импорт/Экспорт"),
    exportNavLink("Экспорт"),
    refusedProductsNavLink("Отклонённые товары"),

    settingsNavLink("Настройки"),

    vendorsNavLink("Интеграции");

    private final String menuName;

    MenuElements(String menuName) {
        this.menuName = menuName;
    }

    public static MenuElements getLink(String name) {
        for (MenuElements goal : values()) {
            if (goal.menuName.equals(name)) {
                return goal;
            }
        }
        return null;
    }
}
