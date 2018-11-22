package com.example.tests;

import com.codeborne.selenide.testng.annotations.Report;
import com.example.steps.DatasetsPageSteps;
import org.testng.annotations.Test;

@Test
@Report
public class DatasetsPageTests extends BaseTest {

    @Test
    public void downloadJson()  {
        DatasetsPageSteps datasetsPageSteps = new DatasetsPageSteps();
        datasetsPageSteps.openDatasetsPage()
                .goToGovermentServicesCategory()
                .checkExistenceOfDataset()
                .checkExistenceOfDatasetName("Многофункциональные центры предоставления государственных услуг")
                .checkExistenceOfExportButten()
                .expandExportMenu()
                .checkExistenceOfDropDown()
                .downloadJson();
    }

    @Test
    public void showInfo()  {
        DatasetsPageSteps datasetsPageSteps = new DatasetsPageSteps();
        datasetsPageSteps.openDatasetsPage()
                .goToGovermentServicesCategory()
                .checkExistenceOfDataset()
                .checkExistenceOfDatasetNumber()
                .checkExistenceOfDatasetName("Многофункциональные центры предоставления государственных услуг")
                .checkExistenceOfAboutButten()
                .showAbout()
                .checkExistenceOfAboutWindow();
    }
}
