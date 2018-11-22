package com.example.pages;

import com.codeborne.selenide.SelenideElement;
import com.example.components.Dataset;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class DatasetsPage extends AbstractPage {
    public DatasetsPage(){
        super();
        this.url = "https://data.mos.ru/opendata";
    }
    public AbstractPage navigate() {
        return super.navigate(this.getClass());
    }
    @Override
    public AbstractPage waitPageLoaded() {
        getDatasetList().waitUntil(visible, 30000);
        return this;
    }
    public SelenideElement getGovermentServicesCategory(){
        return $(By.xpath("//*[@class='category-caption' and text()='Государственные услуги']//parent::a"));
    }
    public Dataset getDataset(){
        return new Dataset($(By.xpath("//*[@class='ds-caption-text' and text()='Многофункциональные центры предоставления государственных услуг']/../../parent::a")));
    }

    public SelenideElement getDatasetList(){
        return $(By.id("datasets"));
    }
}
