package com.example.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import com.example.components.Filter;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProjectPlansPage extends AbstractPage {
    public ProjectPlansPage() {
        super();
        this.url = "https://data.mos.ru/opendata/7710145589-reestr-utverjdennyh-proektov-planirovki-territoriy";
    }

    public AbstractPage navigate() {
        return super.navigate(this.getClass());
    }

    @Override
    public AbstractPage waitPageLoaded() {
        $(By.id("pager")).waitUntil(visible, 30000);
        return this;
    }

    public SelenideElement getFilterButton() {
        return $("#app > div:nth-child(3) > div.dataset-buttons.hide-for-mobile.filter-link");
    }

    public Filter getFilter() {
        return new Filter($(By.id("columnsFilter")));
    }
}
