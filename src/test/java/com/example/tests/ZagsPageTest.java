package com.example.tests;

import com.codeborne.selenide.testng.annotations.Report;
import com.example.steps.ZagsPageSteps;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;

@Test
@Report
public class ZagsPageTest extends BaseTest {

    @Test
    public void checkColumnMenu()  {
        ZagsPageSteps zagsPageSteps = new ZagsPageSteps();
        zagsPageSteps.openZagsPage()
                .switchColumnsMenu()
                .activateAllColumns()
                .switchColumnsMenu()
                .checkTableColumnsStatus(enabled);
    }
}
