package com.example.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.example.components.DropColumns;
import com.example.components.Pager;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class MFCentersPage extends AbstractPage {
    public MFCentersPage(){
        super();
        this.url = "https://data.mos.ru/opendata/7731419456-mnogofunktsionalnye-tsentry-predostavleniya-gosudarstvennyh-uslug";
//        this.url = "https://data.mos.ru/opendata/7710474791-dannye-vyzovov-pojarnoy-slujby-po-ao-goroda-moskvy";
    }
    public AbstractPage navigate() {
        return super.navigate(this.getClass());
    }
    @Override
    public AbstractPage waitPageLoaded() {
        $(By.id("pager")).waitUntil(visible, 30000);
        return this;
    }
    public AbstractPage waitTableLoaded() {
        $(By.className("loader-block")).waitUntil(not(visible), 30000);
        return this;
    }
    public Pager getPager(){
        return new Pager($(By.className("pager page-container")));
    }
    public String getSomeRowId(){
        SelenideElement a = $(By.xpath("//td[1]//div[1]"));
        waitPageLoaded();
        return a.innerText();
    }
}


