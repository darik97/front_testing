package com.example.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.example.pages.ZagsPage;

import static com.codeborne.selenide.Condition.*;

public class ZagsPageSteps extends BaseSteps<ZagsPage> {
    public ZagsPageSteps() {
        page = new ZagsPage();
    }

    public ZagsPageSteps openZagsPage() {
        page.navigate().shouldBeOpened();
        return this;
    }

    public ZagsPageSteps switchColumnsMenu(){
        page.getDropColumnsButton().click();
        return this;
    }
    public ZagsPageSteps activateAllColumns(){
        ElementsCollection inactiveItems = page.getDropColumns().getInactiveItems();
        ClickItems(inactiveItems);
        return this;
    }
    public ZagsPageSteps checkTableColumnsStatus(Condition condition){
        ElementsCollection elements = page.getTableColumns();
        for(int i = 0;i<elements.size();i++ ){
            elements.get(0).should(condition);
        }
        return this;
    }
    private void ClickItems(ElementsCollection items){

        for (int i = 0; i<items.size(); i++){
            items.get(0).click();
        }
    }
}
