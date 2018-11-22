package com.example.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.example.components.Dataset;
import com.example.components.DropColumns;
import org.openqa.selenium.By;
import org.openqa.selenium.support.pagefactory.ByAll;

import static com.codeborne.selenide.Condition.not;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ZagsPage extends AbstractPage {
    public ZagsPage(){
        super();
        this.url = "https://data.mos.ru/opendata/7704111479-organy-zags-moskvy";
    }

    public AbstractPage navigate() {
        return super.navigate(this.getClass());
    }

    @Override
    public AbstractPage waitPageLoaded() {
        $(By.className("loader-block")).waitUntil(not(visible), 30000);
        return this;
    }
    public SelenideElement getDropColumnsButton(){
        return $(By.id("dropColumnsLink"));
    }
    public DropColumns getDropColumns(){
        return new DropColumns($(By.xpath("//*[@id='dropColumns']/div")));
    }
    public ElementsCollection getTableColumns(){
        return $$(By.xpath("/html/body/div[2]/div/div[7]/section[1]/div[3]/div[1]/div[3]/table[1]/thead/tr[1]/th"));
    }
}
