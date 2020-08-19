package com.freeCRM.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue ="com/freeCRM/stepDefinitions/",
        features = "src/test/resources/features/",
        monochrome = true,
        dryRun = false,
        tags ="@login",
        plugin = {"pretty", "html:test-output", "json:json_output/cucumber.json", "json:junit_xml/cucumber.xml"}
//        plugin ={
//                "html:target/default-report",
//                "json:target/cucumber.json",
//                "rerun:target/rerun.txt"
//        }

)

public class TestRunner {
}
