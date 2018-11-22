package com.example.components;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class Pager extends ElementsContainer {
    public Pager(SelenideElement element) {
        setSelf(element);
    }

    public SelenideElement getDoubleLeftButton() {
        return getSelf().find(By.xpath("//*[@class=\"arr double left-arr\"]"));
    }

    public SelenideElement getDoubleRightButton() {
        return getSelf().find(By.xpath("//*[@class=\"arr double right-arr\"]"));
    }

    public SelenideElement getRightButton() {
        return getSelf().find(By.xpath("//*[@class=\"arr right-arr\"]"));
    }

    public SelenideElement getLeftButton() {
        return getSelf().find(By.xpath("//*[@class=\"arr left-arr\"]"));
    }

    public ElementsCollection getNavigationElements() {
        return getSelf().findAll(By.xpath("//*[@id=\"pager\"]/li/a"));
    }
}

