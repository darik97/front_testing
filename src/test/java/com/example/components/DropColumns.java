package com.example.components;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class DropColumns extends ElementsContainer{
    public DropColumns(SelenideElement element) {setSelf(element);}
    public SelenideElement getHelpMenu(){
        return $(By.id("descLink"));
    }

    public ElementsCollection getInactiveItems(){
        return getSelf().findAll(By.className("inactive"));
    }
    public ElementsCollection getActiveItems(){
        return getSelf().$$x("ul/li[@class!='inactive']");
    }
    public SelenideElement getFirstDropDownElement(){
        return getSelf().$x("//a[text()='Выбрать все']//parent::li");
    }
}
