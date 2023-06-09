package com.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "json:target/cucumber.json",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",
        glue = "/com/stepDefinitions",
        dryRun =false,
        tags = "@whole" //Tag verdiğin yeri execute'luyo sadece.
                            // --"or, and, and not" keyword'leriyle birden fazla executable scenario oluşturabiliyoruz--
)
public class CukesRunner {

}
