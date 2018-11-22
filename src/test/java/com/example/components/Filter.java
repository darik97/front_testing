package com.example.components;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class Filter extends ElementsContainer{
    public Filter(SelenideElement element) {setSelf(element);}
    public SelenideElement getName(){
        return getInputByName("VID_PPT");
    }
    public SelenideElement getShortName(){
        return getInputByName("ShortName");
    }
    public SelenideElement getAddress(){
        return getInputByName("Address");
    }
    public SelenideElement getResponsibilityArea(){
        return getInputByName("ResponsibilityArea");
    }
    public SelenideElement getWorkingHours(){
        return getInputByName("WorkingHours");
    }
    public WebElement getRegionForSelect(){
        return getSelf().findElement(By.cssSelector("div.scrollable.scroll > ul > li:nth-child(4) > select"));
    }
    public SelenideElement getRegion(){
        return getSelf().find("div.scrollable.scroll > ul > li:nth-child(4) > select");
    }
    public SelenideElement getRegionOption(){
        return getSelf().find("#div.scrollable.scroll > ul > li:nth-child(4) > select > option:nth-child(2)");
    }
    public SelenideElement getAdministrativeDistrict(){
        return getSelf().find("div.scrollable.scroll > ul > li:nth-child(3) > select");
    }
    public SelenideElement getIdInput(){
        return getInputByName("global_id");
    }
    public SelenideElement getCloseButton(){
        return getButton(2);
    }
    public SelenideElement getApplyButton(){
        return getButton(3);
    }
    public SelenideElement getResetButton(){
        return getButton(1);
    }
    private SelenideElement getInputByName(String name){
        return getSelf().find(String.format("input[name=\"%s\"]", name));
    }
    private SelenideElement getButton(int number){
        return getSelf().find(String.format("div.btn_footer > div:nth-child(%d)", number));
    }
}
