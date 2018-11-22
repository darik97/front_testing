package com.example.steps;

import com.codeborne.selenide.SelenideElement;
import com.example.pages.MainPage;

import static com.codeborne.selenide.Condition.attribute;

public class MainPageSteps extends BaseSteps<MainPage> {
    public MainPageSteps() {
        page = new MainPage();
    }

    public MainPageSteps openMainPage() {
        page.navigate().shouldBeOpened();
        return this;
    }

    public MainPageSteps checkSearchInputPlaceholder(String expectedPlaceholder) {
        SelenideElement searchField = page.getSearchField();
        searchField.shouldHave(attribute("placeholder", expectedPlaceholder));
        return this;
    }

    public MainPageSteps searchFor(String searchText) {
        SelenideElement searchField = page.getSearchField();
        searchField.setValue(searchText);
        page.getSearchButton().click();
        return this;
    }
}
