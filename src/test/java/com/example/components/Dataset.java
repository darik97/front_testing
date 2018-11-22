package com.example.components;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Dataset extends ElementsContainer{
    public Dataset(SelenideElement element) {setSelf(element);}
    public SelenideElement getHelpMenu(){
        return $(By.id("descLink"));
    }
    public SelenideElement getExportButton() {
        return getSelf().find(By.id("dropDepartmentsLink"));
    }
    public SelenideElement getJsonButton(){
        return $(By.xpath("//*[@id='dropExport']//a[text()='json']"));
    }
    public SelenideElement getAboutButton(){
        return getSelf().find(By.id("descLink"));
    }
    public SelenideElement getDatasetNumber(){
        return getSelf().find(By.className("dataset-number"));
    }
    public SelenideElement getDatasetName(){
        return getSelf().find(By.className("ds-caption-text"));
    }
    public SelenideElement getDatasetIcon(){
        return getSelf().find(By.xpath("//*[@class='dataset-icon']/i"));
    }
    public SelenideElement getPassportButten(){
        return getSelf().find(By.id("dropPassportLink"));
    }
    public SelenideElement getAboutWindow(){
        return $(By.id("dropDesc"));
    }
    public SelenideElement getAvailableExportFormats(){
        return $(By.id("dropExport"));
    }
}
