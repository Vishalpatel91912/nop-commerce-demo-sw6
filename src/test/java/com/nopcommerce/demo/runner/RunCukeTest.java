package com.nopcommerce.demo.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;


@CucumberOptions(
            features = "src/test/resources/features",
            glue = "com/nopcommerce/demo/steps",
            plugin = {"html:target/cucumber-reports/cucumber.html",
                    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
            tags = "@regression"

    )
    public class RunCukeTest extends AbstractTestNGCucumberTests {

}

