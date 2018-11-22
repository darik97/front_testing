package com.example.components;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DatasetList extends ElementsContainer{
    public DatasetList(SelenideElement element) {setSelf(element);}

    public Dataset getDataset(){

        return new Dataset(getSelf().find(".category-181-list > li:nth-child(3) > a:nth-child(1)"));
    }
}
