package com.example.tests;

import com.codeborne.selenide.testng.annotations.Report;
import com.example.steps.ProjectPlansPageSteps;
import org.testng.annotations.Test;

@Test
@Report
public class ProjectPlansFilterTest extends BaseTest {

    @Test
    public void checkFilter() {
        ProjectPlansPageSteps datasetsPageSteps = new ProjectPlansPageSteps();
        datasetsPageSteps.openProjectPlansPage()
                .openFilterMenu()
                .setFilter()
                .applyFilter();
    }
}
