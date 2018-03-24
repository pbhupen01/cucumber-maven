package com.practice;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"pretty", "html:out.html"},
        features={"src/test/resources/features"},
        glue ={"stepdefs"}
)
public class CukesRunner {
}
