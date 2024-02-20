package com.google.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt", //store failed scenario names into rerun.txt file
                "json:target/cucumber.json" //generate a json execution report to be used for html report
        },
        features = "src/test/resources/feature",
        glue = "com/google/step_definitions",
        dryRun = false,
        tags = "@facebook or @google_01 or @google_02"

)
public class CukesRunner {
    /**
     * Mvn command line
     * -- to run a specific feature: mvn test -Dcucumber.options="src/test/resource/login.feature "feature path
     * -- to run a specific scenario:mvn test -Dcucumber.options="feature file path:numbers starting"
     *         Example: mvn test -Dcucumber.options="feature/google.feature:11"
     * -- run with tag: mvn test -Dcucumber.options="--tags@smoke"
     */
}
