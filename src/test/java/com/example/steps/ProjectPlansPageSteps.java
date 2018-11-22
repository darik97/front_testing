package com.example.steps;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import com.example.components.Filter;
import com.example.pages.ProjectPlansPage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;

public class ProjectPlansPageSteps extends BaseSteps<ProjectPlansPage> {
    private Actions actions;

    public ProjectPlansPageSteps() {
        page = new ProjectPlansPage();
        this.actions = new Actions(WebDriverRunner.getWebDriver());
    }

    public ProjectPlansPageSteps openProjectPlansPage() {
        page.navigate().shouldBeOpened();
        return this;
    }

    public ProjectPlansPageSteps openFilterMenu() {
        SelenideElement filterButton = page.getFilterButton();
        scrollToTop();
        filterButton.click();
        return this;
    }

    public ProjectPlansPageSteps applyFilter() {
        page.getFilter().getApplyButton().click();
        wait(1000);
        return this;
    }

    public ProjectPlansPageSteps setFilter() {
        Filter filter = page.getFilter();

        filter.getName().setValue("храм");

        return this;
    }

    private void scrollToTop() {
        actions.moveToElement($("body > header:nth-child(2)")).perform();
    }

    private void wait(int miliseconds) {
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
