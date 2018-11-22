package com.example.steps;

import com.example.pages.DatasetsPage;
import static com.codeborne.selenide.Condition.*;

public class DatasetsPageSteps extends BaseSteps<DatasetsPage> {
    public DatasetsPageSteps() {
        page = new DatasetsPage();
    }

    public DatasetsPageSteps openDatasetsPage() {
        page.navigate().shouldBeOpened();
        return this;
    }
    public DatasetsPageSteps goToGovermentServicesCategory() {
        page.getGovermentServicesCategory().click();
        return this;
    }
    public DatasetsPageSteps checkExistenceOfDataset(){
        page.getDatasetList().should(exist);
        return this;
    }
    public DatasetsPageSteps checkExistenceOfDatasetNumber(){
        page.getDataset().getDatasetNumber().should(matchText("\\d+"));
        return this;
    }
    public DatasetsPageSteps expandExportMenu(){
        page.getDataset().getExportButton().click();
        return this;
    }
    public DatasetsPageSteps downloadJson(){
        page.getDataset().getJsonButton().click();
        return this;
    }
    public DatasetsPageSteps checkExistenceOfDatasetIcon(){
        page.getDataset().getDatasetIcon().should(exist);
        return this;
    }
    public DatasetsPageSteps checkExistenceOfPassportButten(){
        page.getDataset().getPassportButten().shouldHave(text("Паспорт"));
        return this;
    }
    public DatasetsPageSteps checkExistenceOfExportButten(){
        page.getDataset().getExportButton().shouldHave(text("Экспорт"));
        return this;
    }
    public DatasetsPageSteps checkExistenceOfAboutButten(){
        page.getDataset().getAboutButton().shouldHave(text("?"));
        return this;
    }
    public DatasetsPageSteps checkExistenceOfDatasetName(String name){
        page.getDataset().getDatasetName().shouldHave(text(name));
        return this;
    }
    public DatasetsPageSteps showAbout(){
        page.getDataset().getAboutButton().click();
        return this;
    }
    public DatasetsPageSteps checkExistenceOfAboutWindow(){
        page.getDataset().getAboutWindow().should(visible);
        return this;
    }
    public DatasetsPageSteps checkExistenceOfDropDown(){
        page.getDataset().getAvailableExportFormats().should(visible);
        return this;
    }
    public MFCentersPageSteps goToMFCentersPage(){
        return new MFCentersPageSteps().openMFCentersPage();
    }
}
