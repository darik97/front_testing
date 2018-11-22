package com.example.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.example.pages.MFCentersPage;

import static com.codeborne.selenide.Condition.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.testng.Assert.assertNotEquals;

public class MFCentersPageSteps extends BaseSteps<MFCentersPage> {
    private String oldId;
    public MFCentersPageSteps() {
        page = new MFCentersPage();
    }
    public MFCentersPageSteps openMFCentersPage() {
        page.navigate().shouldBeOpened();
        page.waitTableLoaded();
        return this;
    }
    public MFCentersPageSteps openSecondPage() {
        oldId = page.getSomeRowId();
        ElementsCollection elements = page.getPager().getNavigationElements();
        elements.get(getSelectedPageIndex(elements) + 1).click();
        page.waitTableLoaded();
        return this;
    }
    public MFCentersPageSteps goToEnd(){
        oldId = page.getSomeRowId();
        page.getPager().getDoubleRightButton().click();
        page.waitTableLoaded();
        return this;
    }
    public MFCentersPageSteps goToTop(){
        oldId = page.getSomeRowId();
        page.getPager().getDoubleLeftButton().click();
        page.waitTableLoaded();
        return this;
    }
    public MFCentersPageSteps goToBack(){
        oldId = page.getSomeRowId();
        page.getPager().getLeftButton().click();
        page.waitTableLoaded();
        return this;
    }
    public MFCentersPageSteps goToNext(){
        oldId = page.getSomeRowId();
        page.getPager().getRightButton().click();
        page.waitTableLoaded();
        return this;
    }
    private int getSelectedPageIndex(ElementsCollection elements){
        for(int i = 0; i < elements.size(); i++){
            if(elements.get(i).has(Condition.cssClass("selected"))){
                return i;
            }
        }
        return -1;
    }
    public MFCentersPageSteps checkChange(){
        String newId = page.getSomeRowId();
        assertNotEquals(oldId, newId);
        return this;
    }
}
