package com.example.tests;

import com.codeborne.selenide.testng.annotations.Report;
import com.example.steps.DatasetsPageSteps;
import org.testng.annotations.Test;

@Test
@Report
public class MFCentersPageTest extends BaseTest {

    @Test
    public void checkPager()  {
        DatasetsPageSteps datasetsPageSteps = new DatasetsPageSteps();
        datasetsPageSteps.openDatasetsPage()
                .goToGovermentServicesCategory()
                .goToMFCentersPage()
                .openSecondPage()
                .checkChange()
                .goToEnd()
                .checkChange();
    }
}
